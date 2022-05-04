import java.io.File;

public class CreateFile {

    public void createFile(String NameFile) {

        try {
            File file = new File(NameFile);
            if (file.createNewFile()){
            System.out.println("file successful created");
            }
            else{
                System.out.println("file already created");
            }

        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
