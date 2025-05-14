
import java.io.IOException;
import java.util.Scanner;


public class MiniShell {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ShellCommandHandler handler = new ShellCommandHandler();
        System.out.println("Welcome to MiniShell type 'help' for a list of commands.");

        while (true) {
            System.out.print(handler.getCurrentDirectory().getAbsolutePath() + " > ");
            String input = scanner.nextLine().trim();
            String[] parts = input.split(" ", 2);
            String command = parts[0];
            String argument = parts.length > 1 ? parts[1] : null;
            if (command.equals("help"))
                handler.print();
       if  (command.equals("pwd"))
           
         handler.printWorkingDirectory();

      else if (command.equals("ls"))
          handler.listDirectory();

      else if(command.equals("cd")) {
         if (argument != null)
             handler.changeDirectory(argument);
         else {
             System.out.println("Error");
         }
     }
      else if (command.equals("mkdir")) {
          if (argument != null)
              handler.makeDirectory(argument);
          else {
              System.out.println("Error");
                }
            }
      else if(command.equals("touch")){
          if (argument != null)
              handler.createFile(argument);
            }
            if (command.equals("exit")) {
                System.out.println("Goodbye!");
                return;
            }
 }

    }
}
