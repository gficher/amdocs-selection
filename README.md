# amdocs-selection

This project solves the **Problem Two: MARS Rovers**.

It requires at least Java 8.

To make it simple, no IDE is required.

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

but it requires you to enter the input data manually.

Another way to test the code is by using files as input. Run the following command to use the already-included test file:

```bash
$ java -cp out com.gficher.amdocs.Main < input.txt
```

If you use Windows Powershell:

```powershell
PS> Get-Content .\input.txt | java -cp out com.gficher.amdocs.Main
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