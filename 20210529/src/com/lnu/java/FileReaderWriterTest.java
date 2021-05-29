package com.lnu.java;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 一.流的分类：
 * 1.操作数据单位：字节流、字符流
 * 2.数据的流向：输入流、输出流
 * 3.流的角色：节点流、处理流
 *
 * 二.流的体系结构
 * 抽象基类             节点流(或文件流)              缓冲流(处理流的一种)
 * InputStream          FileInputStream             BufferedInputStream
 * OutputStream         FileOutputStream            BufferedOutputStream
 * Reader               FileReader                  BufferedReader
 * Writer               FileWriter                  BufferedWriter
 *
 *
 * @author LiYimin
 * @create 2021-05-29 20:24
 */
public class FileReaderWriterTest {

    public static void main(String[] args) {
        File file = new File("hello.txt");//相较于当前工程 相对路径
        System.out.println(file.getAbsolutePath());

        File file1 = new File("day09\\hello.txt");//如果是在main方法中就这么写
        System.out.println(file1.getAbsolutePath());
    }
    /*
    将day09下的hello.txt文件内容读入程序中，并输出到控制台

    说明点：
    1.read()的理解：返回读入的一个字符。如果达到文件末尾，返回-1
    2.异常的处理：为了保证流资源一定可以执行关闭操作。需要使用try-catch-finally处理
    3.读入的文件一定要存在，否则就会报FileNotFoundException。
     */
    @Test
    public void testFileReader(){
        FileReader fr = null;

        try {
            //1.实例化File类的对象，指明要操作的文件
            File file = new File("hello.txt");//相较于当前Module；如果是在测试方法中就这么写
            //System.out.println(file.getAbsolutePath());
            //2.提供具体的流
            fr = new FileReader(file);
            //3.数据的读入
            //read():返回读入的一个字符。如果达到文件末尾，返回-1

            //方式一：
//        int data = fr.read();
//        while (data != -1) {
//            System.out.print((char)data);
//            data = fr.read();
//        }

            //方式二：语法上针对方式一的修改
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char)data);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭操作
            try {
                if(fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //对read()的操作升级：使用read的重载方法
    @Test
    public void testFileReader1() throws IOException {
        FileReader fr = null;//会有异常
        try {
            //1.File类的实例化
            File file = new File("hello.txt");
            //2.FileReader流的实例化
            fr = new FileReader(file);
            //3.读入操作
            char[] cbuf = new char[5];//cbuf --- char buffer缓冲区
            fr.read(cbuf);//数组就是容器 会有异常
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null){
                //4.资源的关闭
                try {
                    fr.close();//因为涉及资源的关闭操作，所以不能使用throws，要用try-catch-finally
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
