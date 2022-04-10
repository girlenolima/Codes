import model.FIle;
import model.FileSystemItem;
import model.Folder;

import java.io.File;
import java.util.Arrays;


public class Cliente {

    public static void main(String[] args) {

        FileSystemItem file1 = new FIle("File1.txt");
        FileSystemItem file2 = new FIle("File2.txt");
        FileSystemItem file3 = new FIle("File3.txt");
        FileSystemItem file4 = new FIle("File4.txt");

        FileSystemItem sf1 = new Folder("sf1", Arrays.asList(file1));
        FileSystemItem sf2 = new Folder("sf1", Arrays.asList(file2,sf1));
        FileSystemItem folder = new Folder("sf1", Arrays.asList(sf2,file3,file4));

        folder.print("");


    }



}
