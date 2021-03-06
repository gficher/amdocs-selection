# amdocs-selection

This project solves the **Problem Two: MARS Rovers**.

It requires at least Java 8.

To make it simple, no IDE is required.

## Details

This program simulates a rover on Mars that runs on a grid-like plateau.

First the program receives the grid upper-rightmost coordinate, and it assumes that the lower-leftmost corner is (0,0).

Then, it receives the information of each rover, one at a time. It also processes them one at a time in the same order as received.

Each rover information is composed by two lines: the first one contains the coordinates and direction; the second one contains the movements sequence.

If the input is entered by the terminal, then it needs an invalid character (e.g. a dot) to stop receiving the rover data.

The program will output the final position and direction of all rovers in the same order as received.

If any rover gets outside the plateau or goes to the same coordinate another rover is "parked" an error (_stderr_) message is issued before the movement is done, but it's not prevented from moving (the rover is very robust).
Such warnings can be dismissed by redirecting them to null.

## Compiling

In order to compile the project you need to run the following command under the project root

```bash
$ javac .\src\com\gficher\amdocs\*.java -d out
```

## Running and Testing

Running the compiled code is as simple as

```bash
$ java -cp out com.gficher.amdocs.Main
```

but it requires you to enter the input data manually. If you do this way, input an invalid character (e.g. a dot) to stop inputting new rovers. 

Another way to test the code is by using files as input. Run the following command to use the already-included test file:

```bash
$ java -cp out com.gficher.amdocs.Main < input.txt
```

Or if you use Windows Powershell:

```powershell
PS> Get-Content .\input.txt | java -cp out com.gficher.amdocs.Main
```

Using the sample input

```txt
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM
```

Both ways will produce the expected result

```txt
1 3 N
5 1 E
```

Using _stdin_ and _stdout_ is a great way to test and compare the output of several inputs.

## Additional info

The solution includes collision and boundary checks, but it won't prevent the rover from moving. If you want to suppress the warning output just redirect the stderr to _null_.

Bash
```bash
$ java -cp out com.gficher.amdocs.Main < input.txt 2> /dev/null
```

Powershell
```powershell
PS> Get-Content .\input.txt | java -cp out com.gficher.amdocs.Main 2> $null
```