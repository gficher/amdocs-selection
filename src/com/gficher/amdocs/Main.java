package com.gficher.amdocs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int xSize = in.nextInt();
        int ySize = in.nextInt();

        // Check for valid plateau size
        if (xSize < 0 || ySize < 0) {
            System.err.println("Invalid plateau size.");
        }

        Plateau plateau = new Plateau(xSize, ySize);

        // While there is another rover
        while(in.hasNextLine()) {
            // Create another rover and attach to the plateau
            int xCoord, yCoord;
            try {
                xCoord = in.nextInt();
                yCoord = in.nextInt();
            } catch (Exception e) {
                // Stop if next input is not a new rover
                break;
            }

            String direction = in.next();
            Rover currentRover = plateau.deployRover(
                    new Coordinate(xCoord, yCoord, CardinalDirections.valueOf(direction))
            );

            // Drop remaining end of line
            in.nextLine();

            String moves = in.nextLine();

            for (int i = 0; i < moves.length(); i++) {
                switch (moves.charAt(i)) {
                    case 'L':
                        currentRover.rotateLeft();
                        break;
                    case 'R':
                        currentRover.rotateRight();
                        break;
                    case 'M':
                        // Predict movement
                        Coordinate coord = currentRover.getCoordinate().getClone();
                        coord.moveForward();

                        if (plateau.hasRoverInCoordinate(coord)) {
                            // Crash detected
                            System.err.println("Crash at " + coord.getFormattedCoords());
                        }

                        if (!plateau.isCoordWithinBounds(coord)) {
                            // Rover is out of bounds
                            System.err.println("Rover out of bounds " + coord.getFormattedCoords());
                        }

                        currentRover.moveForward();
                        break;
                    default:
                        System.err.println("Invalid movement: " + moves.charAt(i));
                }
            }
        }

        // Display Output
        for (Rover rover : plateau.getRoverList()) {
            System.out.println(rover.getCoordinate().getFormattedCoords());
        }
    }
}
