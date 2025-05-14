import java.io.File;
import java.io.IOException;


public class ShellCommandHandler {
    private File currentDirectory;

    ShellCommandHandler() {
    this.currentDirectory = new File(System.getProperty("user.dir"));
    }
    public File getCurrentDirectory() {
        return currentDirectory;
    }
//
//    public st void setCurrentDirectory(File file) {
//        this.currentDirectory = file;

public void printWorkingDirectory(){
        String current =System.getProperty("user.dir");
    System.out.println("yourDirectory is "+ current);
}
public void listDirectory(){
        File[]files= currentDirectory.listFiles();
        if (files!=null) {
            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                if (file.isDirectory()) {
                    System.out.println("Directory " + file.getName());
                } else
                    System.out.println("File " + file.getName());
            }
        }
}
public void changeDirectory(String name){
        File newFile=new File(currentDirectory,name);
        if (newFile.isDirectory()&&newFile.exists()){
            currentDirectory=newFile;
        }
        else {
            System.out.println("you didn't have this folder");
        }
}
public void makeDirectory(String name){
        File file =new File(currentDirectory,name);
        if(file.exists()){
            System.out.println("you have this folder");
        }
        else {
            boolean mkdir = file.mkdir();
            System.out.println("Directory created "+name);
        }
}
public void createFile(String name) throws IOException {
    if (name.equals("..")) {
        currentDirectory = currentDirectory.getParentFile();
    } else {
        File file = new File(currentDirectory, name);
        if (file.exists()&&file.isDirectory()) {
            currentDirectory=file;
        }
        else {
            System.out.println("you have this file");
        }
    }
}
public void print (){
    System.out.println("Support commands" + "\n"
            +"pwd         -Show current directory path"+"\n"
            +"ls          -Lest contents of the current directory" +"\n"
            +"cd [dir]    -Change to directory (..to go back) " +"\n"
            +"mkdir [dir] "+"-Create a new directory"+"\n"
            +"touch [dir] -Create a new file"+"\n"
            +"help        -Show this help message"+"\n"
            +"exit        -Exit the shell");

}
}
