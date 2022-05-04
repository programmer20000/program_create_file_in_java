import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        n();
        ExitProgram();
    }

    private static void n() {
        System.out.print("Enter name file:" + "\n");
        Scanner scanner = new Scanner(System.in);
        String NameFile = scanner.nextLine();
        CreateFile createFile = new CreateFile();
        createFile.createFile(NameFile);

    }

    private static void ExitProgram() {
        System.out.println("\n" + "you want to exit if yes enter y if yes enter n:");
        String SymbolContinue = "n";
        String SymbolExit = "y";

        Scanner scanner = new Scanner(System.in);
        String exit = scanner.nextLine();

        while (true) {
            if (exit.equals(SymbolExit)) {
                break;
            }

            if (exit.equals(SymbolContinue)) {
                n();
            }
        }
    }
}