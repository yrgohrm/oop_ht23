import java.io.*;

public class VeryBad {
    /**
     * 
     * @throws IOException if some error occurs when reading the file
     */
    public void stuff() throws IOException{
        // this does stuff
        new FileInputStream("apan");
    }

    public void foo() {
        try {
            stuff();
        }
        catch (Exception ex) {
            // should not happen in production
        }
    }

    public void bar() {
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
