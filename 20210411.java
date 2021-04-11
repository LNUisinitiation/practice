//20210407 周三
//package javaeclipse;
//
//import java.util.Scanner;
//
//public class ArrayTest {
//	private static String ;
//
//	public static void main(String[] args) {
//	//动态初始化	
//	String[] names = new String[5];
//	//静态初始化
//	int[] ids = new int[] {1001,1002,1003,1004};
//	
//	int[] ide = new int[] {1,2,3,4,5};
//	String[] goods = new String[10];
//	names[0] = "张三";
//	names[1] = "李四";
//	names[2] = "王五";
//	names[3] = "钱进";
//	names[4] = "燕小六";
//	Scanner scan = new Scanner(System.in);
//	String s1 = scan.next();
//	char c1 = s1.charAt(0);
//	System.out.println(c1);
//	//属性:length
//	System.out.println(names.length);
//	System.out.println(ide.length);
//	
//	for(int i = 0;i < names.length;i++) {
//		System.out.println(names[i]);
//	}
//	char tel = ' ';
//	//String tellNumber = "";
//	int num;
//	num = 2020;
//	String tellNumber;
//	tellNumber = "辽宁大学";
//	System.out.println(tel + tellNumber + num);
	//shift+enter 切换到下一行
	//ctrl+shift+enter 
//	}
//}
//package javaeclipse;
//
//import java.util.Scanner;
//
//public class ArrayTest{
//	public static void main(String[] args){
//		//1.使用Scanner，读取学生人数
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请输入学生人数:");
//		int number = scan.nextInt();
//		
//		//2.创建数组，存储学生成绩，动态初始化
//		int[] scores = new int[number];
//		//3.给数组中的元素赋值
//		System.out.println("请输入" + number + "个学生的成绩:");
//		int maxScore = 0;
//		for(int i = 0;i < scores.length;i++) {
//			scores[i] = scan.nextInt();
//			if(maxScore < scores[i]) {
//				maxScore = scores[i];
//			}
//		}
		//4.获取数组中的元素的最大值:最高分
//		int maxScore = 0;	
//		for(int i = 0;i < scores.length;i++) {
//			if(maxScore < scores[i])
//				maxScore = scores[i];
//		}
		//5.根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
//		char level;
//		for(int i = 0;i < scores.length;i++) {
//			if(maxScore - scores[i] <= 10) {
//				level = 'A';
//			}else if(maxScore - scores[i] <= 20) {
//				level = 'B';
//			}else if(maxScore - scores[i] <= 30) {
//				level = 'C';
//			}else {
//				level = 'D';
//			}
//		System.out.println("student " + i + " score is " + scores[i] + " grade is " + level);
//		}
//	}
//}
//20210408 周四
//package javaeclipse;
//public class ArrayTest{
//	public static void main(String[] args) {
//		int[] arr1 = new int[] {1,2,3,4,5};
//		int[][] arr2 = new int[][] {{1,2,3},{1,2,3,4},{4,5,6,7}};
//		System.out.println(arr1[0]);
//		System.out.println(arr2[1][2]);
//		
//		System.out.println("给二维数组赋值");
//		String[][] arr3 = new String[3][];
//		arr3[1] = new String[4];
//		arr3[1][0] = "ABC";
//		System.out.println(arr3[1][0]);
//		System.out.println("***********");
//		int[][] arr4 = new int[5][];
//		arr4[2] = new int[3];
//		arr4[2][2] = 30;
//		System.out.println(arr4[2][2]);
//		System.out.println("******************************");
//		
//		//获取数组的长度
//		System.out.println(arr2.length);
//		System.out.println(arr2[0].length);
//		System.out.println(arr2[1].length);
//		System.out.println("*******************************************");
//		//如何遍历二维数组
//		for(int i = 0;i < arr2.length;i++) {
//			for(int j = 0;j < arr2[i].length;j++) {
//				System.out.print(arr2[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
//}
//package javaeclipse;
//public class ArrayTest{
//	public static void main(String[] args) {
//		
//		int[] arr1 = new int[] {1,2,3,4,5};
//		int[][] arr2 = new int[][] {{1,2,3},{4,5,6},{1,2,3,4,5,6}};
//		System.out.println(arr1[0]);
//		System.out.println(arr2[1][2]);
//		
//		System.out.println("给二维数组赋值");
//		String[][] arr3 = new String[3][];
//		arr3[1] = new String[4];
//		arr3[1][0] = "ABC";
//		System.out.println(arr3[1][0]);
//		
//		int[][] arr4 = new int[5][];
//		arr4[2] = new int[6];
//		arr4[2][5] = 30;
//		System.out.println(arr4[2][5]);
//		
//		//获取数组的长度
//		System.out.println(arr4.length);
//		//System.out.println(arr4[0]);
//		System.out.println(arr4[2]); //[I@28a418fc
//		System.out.println(arr3[2]); //null
//		System.out.println(arr3[1]); //[Ljava.lang.String;@5305068a
//		System.out.println(arr3); //[[Ljava.lang.String;@1f32e575
//		//System.out.println(arr4[3]);
//		//如何遍历二维数组
//		for(int i = 0;i < arr2.length;i++) {
//			for(int j = 0;j < arr2[i].length;j++) {
//				System.out.print(arr2[i][j] + " ");
//			}
//			System.out.println();
//		}
//		}
//	}
//20210409 周五
//package javaeclipse;
//public class ArrayTest{
//	public static void main(String[] args) {
//		int[][] arr = new int[][] {{3,5,8},{12,9},{7,0,6,4}};
//		
//		int sum = 0; //记录总和
//		for(int i = 0;i < arr.length;i++) {
//			for(int j = 0;j < arr[i].length;j++) {
//			sum += arr[i][j];	
//			}
//		}
//		System.out.println("总和为:" + sum);
//	}
//}
//杨辉三角
//package javaeclipse;
//public class ArrayTest{
//	public static void main(String[] args) {
//		//声明并初始化二维数组
//		int[][] yangHui = new int[10][];
//		
//		//给数组的元素赋值
//		for(int i = 0;i < yangHui.length;i++) {
//			yangHui[i] = new int[i + 1];
//			
//			//给首末元素赋值
//			yangHui[i][0] = yangHui[i][i] = 1;
//			//给每行的非首末元素赋值
//			if(i > 1) {
//				for(int j = 1;j < yangHui[i].length - 1;j++) {
//					yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
//				}
//			}
//		}
//		//遍历二维数组
//		for(int i = 0;i < yangHui.length;i++) {
//			for(int j = 0;j < yangHui[i].length;j++) {
//				System.out.print(yangHui[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//	}
//}
//20210410周六
//随机获取一个两位数
//package javaeclipse;
//public class ArrayTest{
//	public static void main(String[] args) {
//		int[] arr = new int[10];
//		//int number = (int)(Math.random() * (99 - 10 + 1) + 10); //(int)(Math.random() * (b-a+1) + a)
//		for(int i = 0;i < arr.length;i++) {
//			arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);//[a,b] [10,99]
//			System.out.print(arr[i] + "\t"); //遍历数组的值
//		}
//		System.out.println();
//		
//		//求数组元素的最大值
//		int maxValue =  arr[0];
//		for(int i = 1;i < arr.length;i++) {
//			if(maxValue < arr[i]) {
//				maxValue = arr[i];
//			}
//		}
//		System.out.println("最大值为:" + maxValue);
//		
//		//求数组的最小值
//		int minValue = arr[0];
//		for(int i = 1;i < arr.length;i++) {
//			if(minValue > arr[i]) {
//				minValue = arr[i];
//			}
//		}
//		System.out.println("最小值为:" + minValue);
//		
//		//求数组元素的总和
//		int sum = 0;
//		for(int i = 0;i < arr.length;i++) {
//			sum += arr[i];
//		}
//		System.out.println("总和为:" +sum);
//		
//		//求数组的平均数
//		int avgValue = sum / arr.length;
//		System.out.println("平均数为:" + avgValue);
//	}
//}
////数组的复制
//array2 = new int[array1.length];
//for(int i = 0;i < array2.length;i++) {
//	array2[i] = array1[i];
//}
//package javaeclipse;
//public class ArrayTest{
//	public static void main(String[] args) {
//		
//		String[] arr = new String[] {"aa","bb","cc","dd","ee","ff"};
//		
//		//数组的复制
//		String[] arr1 = new String[arr.length];
//		for(int i = 0;i < arr1.length;i++) {
//			arr1[i] = arr[i];
//			System.out.print(arr1[i] + "\t");
//		}
//		System.out.println();
//		
//		//数组的反转
//		//方法一:
////		for(int i = 0;i < arr.length / 2;i++) {
////			String temp = arr[i]; //定义一个中间变量，进行交换
////			arr[i] = arr[arr.length - i - 1]; //arr.length - i - 1
////			arr[arr.length - i - 1] = temp;
////		}
//		
//		//方法二:
//		for(int i = 0,j = arr.length - 1;i < j;i++,j--) {
//			String temp = arr[i]; ////定义一个中间变量，进行交换
//			arr[i] = arr[j];
//			arr[j] = temp;
//		}
//	
//		//遍历
//		for(int i = 0;i < arr.length;i++) {
//			System.out.print(arr[i] + "\t");
//		}
//	}
//}
//20210411周日
//int number = (int)(Math.random() * (b-a+1) + a);
//package javaeclipse;
//import java.util.Scanner;
//public class ArrayTest{
//	public static void main(String[] args) {
//		
//		String[] arr = new String[] {"aa","bb","cc","dd","ee","ff"};
//		
//		//数组的复制
//		String[] arr1 = new String[arr.length];
//		for(int i = 0;i < arr1.length;i++) {
//			arr1[i] = arr[i];
//			System.out.print(arr1[i] + "\t");
//		}
//		System.out.println();
//		
//		//数组的反转
//		//方法一:
////		for(int i = 0;i < arr.length / 2;i++) {
////			String temp = arr[i]; //定义一个中间变量，进行交换
////			arr[i] = arr[arr.length - i - 1]; //arr.length - i - 1
////			arr[arr.length - i - 1] = temp;
////		}
//		
//		//方法二:
//		for(int i = 0,j = arr.length - 1;i < j;i++,j--) {
//			String temp = arr[i]; ////定义一个中间变量，进行交换
//			arr[i] = arr[j];
//			arr[j] = temp;
//		}
//	
//		//遍历
//		for(int i = 0;i < arr.length;i++) {
//			System.out.print(arr[i] + "\t");
//		}
//		
//		//查找(或搜索)
//		//线性查找:
//		System.out.println(); //换行
//		
//		System.out.println("请输入要查找的元素:");
//		Scanner scan = new Scanner(System.in);
//		String dest = scan.next();
//		
//		boolean isFlag = true; //用来判断是否找到要查找的元素
//		
//		for(int i = 0;i < arr.length;i++) {
//			
//			if(dest.equals(arr[i])) { //记住dest.equals(arr[i])
//				isFlag = false;
//				System.out.println("找到了指定的元素，位置为:" + i);
//				break; //找到了就跳出
//			}
//			
//		}
//		if(isFlag) {
//			System.out.println("没有找到该元素");
//		}
//
//		//二分查找:
//		//所要查找的数组必须是有序的
//		int[] arr2 = new int[] {-32,-20,0,5,10,13,50};
//		
//		boolean isFlag1 = true;
//		int dest1 = -30;
//		int head = 0; //初始的首索引
//		int end = arr2.length - 1; //初始的末索引
//		
//		while(head <= end) {
//			
//			int middle = (head + end) / 2;
//			
//			if(dest1 == arr2[middle]) {
//				isFlag1 = false;
//				System.out.println("找到了指定的元素,位置为:" + middle);
//				break;
//			}else if(dest1 < arr2[middle]) {
//				end = middle - 1;
//			}else
//				head = middle + 1; //dest1 > arr2[middle]
//		}
//		if(isFlag1) {
//			System.out.println("没有找到指定的元素");
//		}
//		
//	}
//}
//package javaeclipse;
//public class ArrayTest{
//	public static void main(String[] args) {
//		
//		//冒泡排序
//		int[] arr = new int[] {-15,20,-50,100,-6,150,1,10,-360,666};
//		
//		for(int i = 0;i < arr.length - 1;i++) {
//			
//			for(int j = 0;j < arr.length - 1 - i;j++) {
//				
//				if(arr[j] > arr[j + 1]) {
//				int temp = arr[j]; //交换
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//				}
//			}
//	
//		}
//		
//		for(int i = 0;i < arr.length;i++) {
//			System.out.print(arr[i] + "\t");
//		}
//		
//	}
//}
package javaeclipse;

import java.util.Arrays;

public class ArrayTest{
	public static void main(String[] args) {
		
		//1.boolean equals(int[] a,int[] b) 判断两个数组是否相等
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {1,3,2,4};
		boolean isEquals = Arrays.equals(arr1,arr2);
		System.out.println(isEquals);
		
		//2.String toString(int[] a) 输出数组信息
		String str = Arrays.toString(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println("输出数组信息:" + str);
		
		//3.void fill(int[] a,int val) 将指定值填充到数组之中
		Arrays.fill(arr1,10); //将10填充到整个数组中，也就是替换数组中原来的元素
		System.out.println(Arrays.toString(arr1));
		
		//4.void sort(int[] a) 对数组进行排序
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2)); //输出数组信息
		
		//5.int binarySearch(int[] a,int key) //二分查找
		int[] arr3 = new int[] {-3,2,-9,15,-5,60,-100,999,-1000};
		int index = Arrays.binarySearch(arr3,-9);
		if(index >= 0) {  // 返回的index是数组索引，从0开始
			System.out.println(index);
		}else {
			System.out.println("未找到");
		}
	}
}
















