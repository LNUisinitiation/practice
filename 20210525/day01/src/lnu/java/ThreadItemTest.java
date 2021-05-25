package lnu.java;

/**
 *多线程的创建方式一：继承于Thread类
 *
 * @author LiYimin
 * @create 2021-05-25 13:50
 */
//public class ThreadItemTest {
//
//    public static void main(String[] args) {
//        //3.创建Thread类的子类的对象
//        MyThreadClass t1 = new MyThreadClass();
//        //4.通过此对象调用start()
//        t1.setName("分线程1：");
//        t1.start();
//        Thread.currentThread().setName("主线程：");
//
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(Thread.currentThread().getName() + ":" + i);
//            }
//        }
//
//    }
//}
//
////1.创建一个继承于Thread类的子类
//class MyThreadClass extends Thread{
//
//    //2.重写Thread类中的run()，将此线程执行的操作声明在run()中
//    @Override
//    public void run() {
//        //求100以内的偶数
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(Thread.currentThread().getName() + ":" + i);
//            }
//        }
//
//    }
//}

/**
 * 创建多线程的方式二：实现Runnable接口
 */
public class ThreadItemTest{

    public static void main(String[] args) {
        //3.创建实现类的对象
        MyThreadClass mythread = new MyThreadClass();

        //4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(mythread);
        Thread t2 = new Thread(mythread);
        Thread t3 = new Thread(mythread);

        t1.setName("分线程1：");
        t2.setName("分线程2：");
        t3.setName("分线程3：");
        //5.通过Thread类的对象调用start()
        t1.start();
        t2.start();
        t3.start();

        Thread.currentThread().setName("主线程：");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }

}

//1.创建一个实现了Runnable接口的类
class  MyThreadClass implements Runnable{

    //2.实现类去实现Runnable中的抽象方法：run()
    @Override
    public void run() {
        //求100以内的奇数
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}





