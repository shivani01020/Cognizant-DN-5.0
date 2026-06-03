import java.io.FileReader;

class Exercise23{
    public static void main(String args[]){
        try{
            FileReader f = new FileReader("output.txt");
            int i;
            while((i = f.read()) != -1){
                System.out.print((char)i);
            }
            f.close();

        }
        catch(Exception e){
            System.out.println("Can't read from file");
        }
    }
}