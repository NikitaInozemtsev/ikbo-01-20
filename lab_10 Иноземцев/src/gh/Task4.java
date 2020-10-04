package gh;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task4 {
    final private static String PATH = "src/gh";

    public static void main(String[] args) {

        List<String> a = catalog(new File(PATH));
        for (int i = 0; i < a.size() && i < 5; i++) {
            System.out.println(a.get(i));
        }
    }

    private static List<String> catalog(File dir) {
        List<String> res = new ArrayList<>();
        if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                res.add(file.getName());
            }
        }
        return res;
    }
}
