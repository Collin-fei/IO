import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2020/9/2.
 */
public class TestFile3 {
    public static void main(String[] args) throws IOException {
        File f = new File("d:\\client\\game");
        File[] fs = f.listFiles();
        if (null == fs)
            return;

        try {
            for (File file : fs) {
                if (file.isDirectory())
                    continue;
                System.out.println(file.getName());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
