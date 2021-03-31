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
//package JAVA_eclipse;
//public class HelloWorld{
//	public static void main(String args[]) {
//		int num1 = 10,num2 = 20;
//		int temp = num1;
//		num1 = num2;
//		num2 = temp;
//		System.out.println("num1 = " + num1);
//		System.out.println("num2 = " + num2);
//		System.out.println("temp = " + temp);
//		System.out.println("*********************************");
//		int num3 = 30,num4 = 40;
//		int temp1 = num3; //定义临时变量的方式
//		num3 = num4; //交换num3和num4
//		num4 = temp1; //用temp这个变量来帮助完成交换
//		System.out.println("num3 = " + num3 + ",num4 = " + num4 + ",temp1 =" + temp1);
//		System.out.println("*********************");
//		int i1 = 10,i2 = 10;
//		String strMax = (i1 > i2) ? "彗星楼" : "地球";
//	    double max = (i1 < i2) ? 1 : 2.0; //要用double接收
//		System.out.println(strMax);
//		System.out.println(max);
//	}
//}
//20210330 周二
//package JAVA_eclipse;
//public class HelloWorld{
//	public static void main(String[] args) {
//		int num1 = 10,num2 = 20;
//		int temp = num1;
//		num1 = num2;
//		num2 = temp;
//		System.out.println("num1 = " + num1 + ",num2 = " + num2 + ",temp = " + temp);
//		System.out.println("***************************");
//		if(num1 < num2) {
//			System.out.println("num2的数值大");
//		}else if(num1 > num2) {
//			System.out.println("num1的数值大");
//		}else {
//			System.out.println("num1和num2的数值一样大");
//		}
//		if(num2 < num1) {
//			System.out.println("num1的数值大");
//		}else if(num2 > num1) {
//			System.out.println("num2的数值大");
//		}else {
//			System.out.println("两个数一样大");
//		}
//	}
//}
//public class HelloWorld{
//	public static void main(String[] args) {
//		int num1 = 10,num2 = 10,num3 = 30;
//		int num4 = (num1 > num2) ? num1 : num2; //三元运算符
//		int num5 = (num4 > num3) ? num4 : num3;
//		System.out.println("最大值是：" + num5);
//		
//		if(num1 > num2) {
//			num4 = num1;
//			if(num4 > num3) { //没有判断相等的情况
//				System.out.println("num4" + "最大");
//			}
//		}else if(num1 < num2) {
//			num4 = num2;
//			if(num4 < num3) {
//				System.out.println("num3" + "最大");
//			}
//		}
//		else {
//			System.out.println("啥也不是");
//		}
//	}
//}
//public class HelloWorld{
//	public static void main(String[] args) {
//		int num1 = 10,num2 = 20,num3 = -21;
//		int max;
//		if(num1 >= num2 && num1 >= num3) { //判断num1是不是最大值
//			max = num1;
//		}else if(num2 >= num1 && num2 >= num3) { //判断num2是不是最大值
//			max = num2; //如果其他两个数不是最大值，那么就把num3的值赋给max，最大值就是max
//		}else {
//			max = num3;
//		}
//		System.out.println("max = " + max); //输出最大值max
//		
//		double d1 = 12.3,d2 = 32.1;
//		if(d1 > 10.0 && d2 < 20.0) {
//			System.out.println("d1 + d2 = " + (d1 + d2));
//		}else {
//			System.out.println("d1 * d2 = " + (d1 * d2));
//		}
//		
//		String cityName1 = "北京",cityName2 = "上海";
//		String exchangeCityName = cityName1; //交换城市名字
//		cityName1 = cityName2;
//		cityName2 = exchangeCityName;
//		System.out.println("交换之后的结果是：" + cityName1 + "," + cityName2 + "," + exchangeCityName);
//		// = += -= *= /= %=
//		int i1 =1;
//		short s1 =1;
//		i1 += 10;
//		System.out.println(i1); //i1 = 11
//		s1 += 2;
//		System.out.println(s1);
//	}
//}

//导包： import java.util.Scanner;
//import java.util.Scanner; //这里是Scanner类
//public class HelloWorld{
//	public static void main(String[] args) {
////	Scanner scan = new Scanner(System.in);
////	int num = scan.nextInt();
////	System.out.println(num);
////	
////	Scanner scan1 = new Scanner(System.in);
////	int num1 = scan.nextInt();
////	System.out.println(num1);
//
//	Scanner scan = new Scanner(System.in);
//	System.out.println("请输入你的姓名：");
////	int num2 = scan.nextInt();
//	String name = scan.next();
//	System.out.println(name);
//	
//	System.out.println("请输入你的年龄");
//	int age = scan.nextInt();
//	System.out.println(age);
//	
//	System.out.println("请输入你的体重");
//	double weight = scan.nextDouble();
//	System.out.println(weight);
//	
//	System.out.println("你是否喜欢我呢");
//	boolean isLove = scan.nextBoolean();
//	System.out.println(isLove);
//	
//	//对于char型的获取，Scanner没有提供相关的方法，只能获取一个字符串
//	System.out.println("请输入你的性别：");
//	String gender = scan.next(); //"男"
//	char genderChar = gender.charAt(0); //获取索引为0位置上的字符
//	System.out.println(genderChar);
//	System.out.println("the end");
//	}
//}
//import java.util.Scanner; //这里是Scanner类
//public class HelloWorld{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请输入你的姓名");
//		String name = scan.next();
//		System.out.println(name);
//		
//		System.out.println("请输入你的年龄");
//		int age = scan.nextInt();
//		System.out.println(age);
//		
//		System.out.println("请输入你的体重");
//		double weight = scan.nextDouble();
//		System.out.println(weight);
//		
//		System.out.println("你是否喜欢我呢");
//		boolean isLove = scan.nextBoolean();
//		System.out.println(isLove);
//		
//		//对于char类型的获取，Scanner没有提供相关的方法，只能获取一个字符串
//		System.out.println("请输入你的性别");
//		String gender = scan.next(); //"男"
//		char genderChar = gender.charAt(0); //获取索引为0位置上的字符
//		System.out.println(genderChar);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请输入你的姓名");
//		String name = scan.next();
//		System.out.println(name);
//		
//		System.out.println("请输入你的年龄");
//		int age = scan.nextInt();
//		System.out.println(age);
//		
//		System.out.println("请输入你的体重");
//		double weight = scan.nextDouble();
//		System.out.println(weight);
//		
//		System.out.println("你是否喜欢我呢");
//		boolean isLove = scan.nextBoolean();
//		System.out.println(isLove);
//		
//		System.out.println("请输入你的性别");
//		String gender = scan.next();
//		char genderChar = gender.charAt(0);
//		System.out.println(genderChar);
//
//		
//	}
//}
//import java.util.Scanner;
//public class HelloWorld{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("请输入张三的期末成绩：(0-100)");
//		int score = scan.nextInt();
//		
//		if(score == 100) {
//			System.out.println("奖励一辆BMW");
//		}else if(score > 80 && score <= 99) {
//			System.out.println("奖励一台手机");
//		}else if(score >= 60 && score <= 80) {
//			System.out.println("奖励一台ipad");
//		}else {
//			System.out.println("什么奖励也没有");
//		}
//	}
//}
//
//如何获取一个随机数：10-99
//public class HelloWorld{
//	public static void main(String[] args) {
//		int value = (int)(Math.random() * 90 + 10); // Math.random类的范围是[0.0,1.0)
//		System.out.println(value);
//		//公式: [a,b] : (int)(Math.random() * (b - a + 1) + a)
//		//公式: [a,b] : (int)(Math.random() * (b - a + 1) + a)
//		int value1 = (int)(Math.random() * 90 + 10);
//		System.out.println(value1);
//		float value = (float)(Math.random());
//		System.out.println(value);
//		
//	}
//}
//import java.util.Scanner; //导包import java.util.Scanner;
//public class HelloWorld{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in); //new一个Scanner类的对象
//		
//		System.out.println("请输入你的身高");
//		int height = scan.nextInt(); //获取一个整型的值
//		System.out.println("请输入你的财富");
//		double wealth = scan.nextDouble(); //获取一个双精度浮点型的值
//		System.out.println("请输入你是否帅");
//		boolean isHandsome = scan.nextBoolean(); //获取一个布尔型的值true/false
//		
//		if(height >= 180 && wealth >= 1 && isHandsome) { //判断是否满足这三项
//			System.out.println("我一定要嫁给他！！！");
//		}else if(height >= || wealth >= 1 || isHandsome) { //判断是否满足其中一项
//			System.out.println("比上不足比下有余");
//		}else { //都不满足
//			System.out.println("不嫁");
//		}
//	}
//}
//
//package JAVA_eclipse; //正确的写法是：javaeclipse
//import java.util.Scanner; //导包
//public class HelloWorld{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in); //new一个Scanner类的对象
//		
//		System.out.println("你的身高是多少");
//		double height = scan.nextDouble();
//		System.out.println("你的财富是多少");
//		double wealth = scan.nextDouble();
//		System.out.println("你是否帅");
//		boolean isHandsome = scan.nextBoolean();
//		
//		if(height >= 180 && wealth >= 1 && isHandsome) {
//			System.out.println("nice");
//		}else if(height >=180 || wealth >= 1 || isHandsome) {
//			System.out.println("just so so");
//		}else {
//			System.out.println("no");
//		}
//	}
//}
//package JAVA_eclipse; //规范的写法应该是javaeclipse
//import java.util.Scanner;
//public class HelloWorld{
//	public static void main(String[] args) {
//		//new一个Scanner类的对象
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("请输入你的身高");
//		double height = scan.nextDouble();
//		System.out.println("请输入你的财富");
//		double wealth = scan.nextDouble();
//		System.out.println("你是否帅");
//		boolean isHandsome = scan.nextBoolean();
//		
//		if(height >= 180 && wealth >= 1 && isHandsome) {
//			System.out.println("good");
//		}else if(height >= 180 || wealth >= 1 || isHandsome) {
//			System.out.println("just so so");
//		}else {
//			System.out.println("no");
//		}
//	}
//}
//
//package JAVA_eclipse; //规范的写法应该是javaeclipse
//import java.util.Scanner;
//public class HelloWorld{
//	public static void main(String[] args) {
//		//new一个Scanner类的对象
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("请输入你的身高");
//		double height = scan.nextDouble();
//		System.out.println("请输入你的财富");
//		double wealth = scan.nextDouble();
//		System.out.println("请输入你是否帅");
//		boolean isHandsome = scan.nextBoolean();
//		
//		if(height >= 180 && wealth >= 1 && isHandsome) {
//			System.out.println("good");
//		}else if(height >= 180 || wealth >= 1 || isHandsome) {
//			System.out.println("just so so");
//		}else {
//			System.out.println("no");
//		}
//	}
//}
package JAVA_eclipse; //规范的写法是javaeclipse
import java.util.Scanner; //导包
public class HelloWorld{
	public static void main(String args[]) {
		//new一个Scanner类的对象
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入你的身高");
		int height = scan.nextInt();
		System.out.println("请输入你的财富");
		double wealth = scan.nextDouble();
		//System.out.println("请输入你是否帅");
		//boolean isHandsome = scan.nextBoolean();
		System.out.println("请输入你是否帅(是/否)");
		String isHandsome = scan.next(); //获取一个字符串给isHandsome
		
		
		if(height >= 180 && wealth >= 1 && isHandsome.equals("是")) {
			System.out.println("满意");
		}else if(height >= 180 || wealth >= 1 || isHandsome.equals("是")) {
			System.out.println("还行");
		}else {
			System.out.println("不行");
		}
	}
}

















