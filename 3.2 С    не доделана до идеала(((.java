import java.util.Scanner;
import java.util.TreeSet;

public class DirectoryLister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> directories = new TreeSet<>();


        while (scanner.hasNextLine()) {
            String path = scanner.nextLine();
            addDirectories(directories, path);
        }

        for (String dir : directories) {
            System.out.println(dir);
        }
    }

    private static void addDirectories(TreeSet<String> directories, String path) {
        String[] parts = path.split("/");
        String currentDir = "/";
        for (int i = 1; i < parts.length; i++) {
            currentDir += parts[i] + "/";
            directories.add(currentDir);   



        }
    }
}
