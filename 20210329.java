/*
 * 2021/3/27周六
 */
//package JAVA_eclipse;
//public class HelloWorld{
//	public static void main(String[] args) {
//		System.out.println("姓名：张三\n");
//		//System.out.println();
//		System.out.println("性别：男");
//		System.out.println("家庭住址：辽宁省沈阳市辽宁大学");
//	}
//}
/*
 创建java文件：HelloWorld.java
 编译：javac HelloWorld.java    --->对应文件名
 运行：java HelloWorld          --->对应类名
 */

/**
 * 练习文档注释
 * 
 */

//类名、接口名，变量名、方法名，常量名的命名规范：
//class ChinesePeopleChina
//int chinesePeopleChina
//CHINESE_PEOPLE_CHINA
//class ChinesePeopleChina
//int chinesePeopleChina
//CHINESE_PEOPLE_CHINA
//class ChinesePeopleChina
//int chinesePeopleChina
//CHINESE_PEOPLE_CHINA
//class ChinaPeopleChina
//int chinesePeopleChina
//CHINESE_PEOPLE_CHINA
//class ChinesePeopleChina
//int chinesePeopleChina
//CHINESE_PEOPLE_CHINA
//class ChinesePeopleChina
//int chinesePeopleChina
//CHINESE_PEOPLE_CHINA
//class ChinesePeopleChina
//int chinesePeopleChina
//CHINESE_PEOPLE_CHINA

//package JAVA_eclipse;
//public class HelloWorld{
//	public static void main(String args[]) {
//		long myNumber; //声明long型常量后面加'L'或者'l '
//		myNumber = 20202052216L; // = 两边要空格  
//		System.out.println(myNumber);
//	}
//}
//
//package JAVA_eclipse;
//public class HelloWorld{
//	public static void main(String args[]) {
//		byte myAge = 24; //myAge =
//		short hisAge = 23;
//		int herAge = 22;
//		long otherAge = 21L; //'L'或者'l'
//		double myBalance = 100.05;
//		float hisLenth = 18.131415926f;
//		char c1 = 'a';
//		char c2 = '\u0043'; //Unicode
//		char c3 = '辽';
//		char c4 = '이';
//		char thisIsC5 = 'す';
//		char thisIsC6 = '\\'; //转义字符
//		thisIsC6 = '\t';
//		boolean b1B = true;
//		boolean b2B = false;
//		System.out.println(b1B);
//		System.out.println(b2B);
//		System.out.println("省份是：" + c3);
//		System.out.println("省份是：" + thisIsC6 + c3);
//		System.out.println(c1);
//		System.out.println(thisIsC5);
//		System.out.println(c2);
//		System.out.println(myBalance + 1);
//		System.out.println(hisLenth - 18);
//		System.out.println(myBalance * 10);
//		System.out.println(myAge);
//		System.out.println(otherAge);
//		
//		boolean isMarried = true;
//		if(isMarried) {
//			System.out.println("太可惜了，\n你不能参加单身派对了"); //在""中输入\n 就会换行
//			System.out.println("你不能参加\\n单身派对了"); //  \\n
//			System.out.println("你不能参加“单身派对”了"); //  \"  \"
//		}else {
//			System.out.println("欢迎参加我们的单身派对");
//		}
//	}
//}
/*
package JAVA_eclipse;

public class HelloWorld{
	public static void main(String[] args) {
		System.out.println('a');
		byte b1 = 10;
		int i1 = 100;
		short s1 = 1000;
		long l1 = 10000l;
		int i2 = b1 + i1;
		System.out.println(i2);
		byte b2 = 11;
		int i3 = 111;
		short s2 = 10001;
		long l2 = 1002125L;
		long l3 = s2 + l2;
		System.out.println(s2 + l2);
		System.out.println(l3);
		System.out.println();
		
		double d1 = 100.1314;
		double d2 = 99.9999;
		float f1 = 100.123456f;
		int i4 = (int)d1; //阶段操作
		short s4 = (short)f1;
		i1 = (int)d1;
		i2 = (int)d2;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(f1);
		System.out.println(i4);
		System.out.println(s4);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println();
		
		//String类型变量的使用
		//String属于引用数据类型 
		 
		String saysTalk1 = "这里是辽宁大学";
		String saysTalk2 = "这里是6舍130";
		System.out.println(saysTalk1);
		System.out.println(saysTalk2);
		String saysTalk3 = ""; //""中间没有字符串是可以的
		char c5 = ' '; //''中间没有字符是不可以的；可以放空格，因为空格也是一个字符
		System.out.println(saysTalk3);
		System.out.println(c5);
		System.out.println(saysTalk2);
		System.out.println("********************");
		int number = 1001;
		String str = "学号：";
		String strNumber = str + number; //+ 连接运算
		System.out.println(strNumber);
		boolean bool1 = true;
		String str1 = strNumber + bool1;
		System.out.println(str1);
		boolean bool2 = false;
		String str2 = strNumber + bool2;
		System.out.println(str2);
		System.out.println("\t"); //这里的"\t"表示一个制表符
		System.out.println('\t');
		System.out.println("*************************");
		String str6 = 123 + "";
		String str7 = 123 + "123";
		System.out.println(str6);
		System.out.println(str7);
		System.out.println("*******************");
		int i6 = 100;
		System.out.println("i6 = " + i6);
		
	}
}
*/
//package JAVA_eclipse;
//public class HelloWorld{
//	public static void main(String[] args) {
//		System.out.println("姓名：张三");
//		System.out.println("性别:男");
//		System.out.println("家庭住址：辽宁省沈阳市辽宁大学");
//	}
//}
//创建java文件：HelloWorld.java
//编译：javac HelloWorld --->对应文件名
//运行：java HelloWorld --->对应类名
//
//类名、接口名
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina 
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina 
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina
//变量名、方法名
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//常量名
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//类名、接口名
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina
//class ChinesePeopleChina
//变量名、方法名
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina 
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//int chinesePeopleChina
//常量名的命名规范
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//CHINESE_PEOPLE_CHINA
//package javaeclipse;
//public class HelloWorld{
//	public static void main(String[] args) {
//		long myNumber; //声明long型常量后面加'l'或者'L'
//		myNumber = 20202052216; // = 两边要空格
//		System.out.println(myNumber);
//		
//	}
//}
//package javaeclipse;
//public class HelloWorld{
//	public static void main(Sting[] args) {
//	byte myAge = 24; //myAge = 
//	short hisAge = 22;
//	long otherAge = 21L; // l 或者 L
//	double myBalance = 100.123;
//	float hisLenth = 18.134f; //float的常量后面要加F或者f
//	char c1 = 'a';
//	char c2 = '\u0043'; //Unicode
//	char c3 = '辽宁';
//	char c4 = 'A';
//	char thisIsC5 = '\\'; //转义字符
//	char thisIsC6 = '\t';
//	boolean b1B = true;
//	boolean b2B = false;
//	System.out.println(b1B);
//	System.out.println(b2B);
//	System.out.println("省份是：" + c3);
//	System.out.println("省份是：" + thisIsC6 + c3);
//	System.out.println(c1);
//	System.out.println(thisIsC5);
//	System.out.println(c2);
//	System.out.println(myBalance + 1);
//	System.out.println(hisLenth - 18);
//	System.out.println(myBalance * 10);
//	System.out.println(myAge);
//	System.out.println(otherAge);
//	System.out.println("***************");
//	boolean isMarried = true;
//	if(isMarried) {
//		System.out.println("太可惜了，\n你不能参加单身派对了");
//		//在""中输入\n就会换行
//		System.out.println("你不能参加\n单身派对了") // \n
//		System.out.println("你不能参加\"单身派对\"了")
//		else {
//			System.out.println("欢迎参加我们的单身派对");
//		}
//	}
//	}
//}
//package javaeclipse;
//public class HelloWorld{
//	public static void main(String[] args) {
//	System.out.println('a');
//	byte b1 = 100;
//	int i1 = 1;
//	short s1 = 1000;
//	long l1 = 1000000l; // long型 常量后面加L或者l
//	System.out.println(i2);
//	byte b2 = 11;
//	int i3 = 111;
//	short s2 = 10001;
//	long l2 = 10002312L;
//	long l3 = 199932L;
//	System.out.println(s2 + l2);
//	System.out.println(l3);
//	System.out.println();
//	double d1 = 100.1334;
//	double d2 = 3394.324;
//	float f1 = 1000.234f;
//	float f2 = 13944.3542343F;
//	int i4 = (int)d1; /截断操作
//	short s4 = (short)f1;
//	i1 = (int)d1;
//	i2 = (int)d2;
//	System.out.println(d1);
//	System.out.println(d2);
//	System.out.println(f1);
//	System.out.println(i4);
//	System.out.println(s4);
//	System.out.println(i1);
//	System.out.println(i2);
//	System.out.println(d1);
//	System.out.println(d2);
//	System.out.println();
//	String类型变量的使用
//	String属于引用数据类型
//	String saysTalk1 = "这里是辽宁大学";
//	String saysTalk2 = "这里是6舍130";
//	String saysTalk3 = "明天是周一";
//	System.out.println(saysTalk1);
//	System.out.println(saysTalk2);
//	String saysTalk3 = ""; //""中间没有字符串是可以的
//	char c5 = ''; //''中间没有字符是不可以的；可以放空格因为空格也是一个字符
//	int number = 1001;
//	String str = "学号";
//	String strNumber = str + number; // + 是连接运算
//	System.out.println(strNumber);
//	boolean bool2 = true;
//	String str1 = strNumber + bool1;
//	System.out.println(str1);
//	boolean bool2 = false;
//	String str2 = strNumber + bool2;
//	System.out.println(str2);
//	System.out.println("\t"); //这里的"\t"表示一个制表符
//	String str6 = 123 + "123";
//	String str7 = 123 + "123";
//	System.out.println(str6);
//	System.out.println(str7);
//	System.out.println("**********"); //输出星号
//	int i6 = 100;
//	System.out.println("i6 = " + i6);
//	}
//}
//package JAVA_eclipse;
//public class HelloWorld{
//	public static void main(String[] args) {
//		System.out.println("心动了吗");
//	}
//}
//package JAVA_eclipse;
//public class HelloWorld{
//	public static void main(String[] args) {
//		boolean b1 = true;
//		int num1 = 10;
//		if(b1 & (num1++ > 0)) {
//			System.out.println("我现在在北京");
//		}else {
//			System.out.println("我现在在南京");
//		}
//		System.out.println("num1 = " + num1);
//		
//		boolean b2 = true;
//		int num2 = 10;
//		if(b2 && (num2++ > 0)) {
//			System.out.println("我现在在北京");
//		}else {
//			System.out.println("我现在在南京");
//		}
//		System.out.println("num2 = " + num2);
//	}
//}
//package JAVA_eclipse;
//public class HelloWorld{
//	public static void main(String[] args) {
//		boolean b1 = false;
//		int num1 = 10;
//		if(b1 & (num1++ > 0)) {
//			System.out.println("我现在在北京");
//		}else {
//			System.out.println("我现在在南京");
//		}
//		System.out.println(num1);
//		
//		boolean b2 = false;
//		int num2 = 10;
//		if(b2 && (num2++ > 0)) {
//			System.out.println("这里是北京");
//		}else {
//			System.out.println("这里是南京");
//		}
//		System.out.println(num2);
//	}
//}
package JAVA_eclipse;
public class HelloWorld{
	public static void main(String args[]) {
		int num1 = 10,num2 = 20;
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("temp = " + temp);
		System.out.println("*********************************");
		int num3 = 30,num4 = 40;
		int temp1 = num3; //定义临时变量的方式
		num3 = num4; //交换num3和num4
		num4 = temp1; //用temp这个变量来帮助完成交换
		System.out.println("num3 = " + num3 + ",num4 = " + num4 + ",temp1 =" + temp1);
		System.out.println("*********************");
		int i1 = 10,i2 = 10;
		String strMax = (i1 > i2) ? "彗星楼" : "地球";
	    double max = (i1 < i2) ? 1 : 2.0; //要用double接收
		System.out.println(strMax);
		System.out.println(max);
	}
}






























