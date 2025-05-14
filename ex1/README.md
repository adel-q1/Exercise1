# ex1
first ex
# MiniShell Project

## How to Compile and Run

| Step             | Command                                             |
|------------------|-----------------------------------------------------|
| Compile the code | javac MiniShell.java ShellCommandHandler.java     |
| Run the program  | java MiniShell                                    |

---

## Supported Commands

| Command          | Description                                       |
|------------------|---------------------------------------------------|
| pwd            | Show the current working directory path.          |
| ls             | List contents of the current directory.           |
| cd [dir]       | Change to a different directory.                  |
| mkdir [dir]    | Create a new directory.                            |
| touch [file]   | Create a new empty file.                           |
| help           | Display a list of available commands.             |
| exit           | Exit the shell.                                    |

---

## Code Explanation

| Part                  | Description |
|------------------------|-------------|
| MiniShell.java        | Main class that reads user input and triggers the corresponding actions. |
| ShellCommandHandler.java | Helper class that contains all file and directory operations such as listing, changing directory, creating folders/files, and printing help. |

---

## Example Usage

```bash
Welcome to MiniShell! Type 'help' to see the list of commands.
/home/user > pwd
yourDirectory is /home/user
/home/user > mkdir Projects
Directory created Projects
/home/user > cd Projects
/home/user/Projects > touch README.md
File created README.md
/home/user/Projects > ls
File README.md
/home/user/Projects > exit
Goodbye!
