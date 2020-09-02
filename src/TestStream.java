import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2020/9/2.
 */
public class TestStream {
    public static void main(String[] args) {
        try {
            File f = new File("d:/java.txt");
            // 创建基于文件的输入流
            FileInputStream fis = new FileInputStream(f);
            // 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中
            byte[] all =new byte[(int) f.length()];
            //以字节流的形式读取文件所有内容
            fis.read(all);
            for (byte b : all) {
                //打印出来是65 66
                System.out.println(b);
            }
            //每次使用完流，都应该进行关闭
            fis.close();

            byte data[] = { 89 };
            File fi = new File("d:/test.txt");

            if(!fi.exists()) {
                fi.createNewFile();
            }
            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(fi);
            // 把数据写入到输出流
            fos.write(data);
            // 关闭输出流
            fos.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
