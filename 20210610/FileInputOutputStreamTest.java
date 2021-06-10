import org.junit.Test;

import java.io.*;

/**
 * 测试FileInputStream和FileOutputStream的使用
 *
 * 结论：
 * 1.对于文本文件(.txt / .java / .c / .cpp)，使用字符流处理
 * 2.对于非文本文件(.jpg / .mp3 / .mp4 / .avi / .doc / .ppt / ...)，使用字节流处理
 *
 * @author LiYimin
 * @create 2021-05-30 16:34
 */
public class FileInputOutputStreamTest {

    //使用字节流FileInputStream处理文本文件，可能出现乱码
    @Test
    public void testFileInputStream(){
        FileInputStream fis = null;//这里会有异常
        try {
            //1.造文件
            File file = new File("hello.txt");
            //2.造流
            fis = new FileInputStream(file);
            //3.读数据
            byte[] buffer = new byte[5];//英文字符在UTF-8，JDK中，一个字符就是用一个字节存的；在UTF-8中，一个中文是用三个字节存的
            int len;//记录每次读取的字节的个数
            while((len = fis.read(buffer)) != -1){//这里会有异常

                String str = new String(buffer,0,len);
                System.out.print(str);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            try {
                if(fis != null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /*
    实现对图片的复制操作
     */
    @Test
    public void testFileInputOutputStream(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //
            File srcFile = new File("iu.png");//图片要放到Module下面（也就是day09下）
            File destFile = new File("iu1.png");

            //
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //复制的过程
            byte[] buffer = new byte[5];
            int len;
            while((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
            System.out.println("复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //指定路径下文件的复制操作
    public void copyFile(String srcPath,String destPath){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //
            File srcFile = new File(srcPath);//图片要放到Module下面（也就是day09下）
            File destFile = new File(destPath);

            //
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //复制的过程
            byte[] buffer = new byte[1024];//如果用byte[5],速度特别慢，需要将近3分钟
            int len;
            while((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
            System.out.println("复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void testCopyFile(){

        long start = System.currentTimeMillis();

        String srcPath = "C:\\Users\\l'y'm\\Desktop\\01-视频.mp4";
        String destPath = "C:\\Users\\l'y'm\\Desktop\\02-视频.mp4";

//        String srcPath = "hello.txt";//相对路径
//        String destPath = "hello3.txt";//用字节流处理文本文件也可以，因为没有在内存层面读
        copyFile(srcPath,destPath);//文本文件如果只是想复制一下，其实用字节流也行，只要别在内存层面去读，如果读出来，可能会有乱码，
                                    //反之，非文本文件还是不能用字符流处理
        long end = System.currentTimeMillis();

        System.out.println("复制操作花费的时间为：" + (end - start));
    }
}
