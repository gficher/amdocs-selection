package com.gficher.amdocs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int xSize = in.nextInt();
        int ySize = in.nextInt();
        Plateau plateau = new Plateau(xSize, ySize);

        // While there is another rover
        while(in.hasNextLine()) {
            // Create another rover and attach to the plateau
            int xCoord = in.nextInt();
            int yCoord = in.nextInt();
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
                        currentRover.moveForward();
                        break;
                    default:
                        System.err.println("Invalid movement: " + moves.charAt(i));
                }
            }
        }

        // Display Output
        for (Rover rover : plateau.getRoverList()) {
            System.out.println(rover.getFormattedCoords());
        }
    }
}
