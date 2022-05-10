
import java.io.*;
class demo1 {
    public static void main(String args[]) {
        FileInputStream input1 = null;
        try {
            input1 = new FileInputStream("D:/file.txt");
        } catch(FileNotFoundException input2) {
            System.out.println("The file does not " + "exist at the location");
        }

        int m;
        try {
            while((m = input1.read()) != -1) {
                System.out.print((char)m);
            }

            input1.close();
        } catch(IOException input3) {
            System.out.println("I/O error occurred: "+ input3);
        }
    }
}