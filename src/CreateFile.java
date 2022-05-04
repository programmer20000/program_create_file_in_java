import java.io.File;

public class CreateFile {

    public void createFile(String NameFile) {

        try {
            File file = new File(NameFile);
            if (file.createNewFile()){
            System.out.println("file with successful created");
            }
            else{
                System.out.println("file with already created");
            }

        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
