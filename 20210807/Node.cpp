#include <stdio.h>
#include <malloc.h>

//单链表 
//typedef struct Node{
//	
//	int data;//数据域 
//	struct Node *pointer;//指针域
//	
//}Node,*LinkList;

//双向链表
typedef struct DulNode{
	
	int data;//数据域
	struct DulNode *prior;
	struct DulNode *next;
	
}DulNode,*DulLinkList; 

//单链表 单向循环链表	双向链表 双向循环链表 

int main(){
	
	DulNode dulNode1;
	DulNode dulNode2;
	DulNode dulNode3;
	DulLinkList p1 = &dulNode1;
	DulLinkList p2 = &dulNode2;
	DulLinkList p3 = &dulNode3;
	
	p1 -> data = 1;
	p1 -> next = p2;
	p1 -> prior = NULL;
	
	p2 -> data = 2;
	p2 -> next = p3;
	p2 -> prior = p1;
	
	p3 -> data = 3;
	p3 -> next = NULL;
	p3 -> prior = p2;
	
	//输出p1、p2、p3结点的数据 
//	printf("%d\n", dulNode1.data);
//	printf("%d\n", dulNode2.data);
//	printf("%d\n", dulNode3.data);
	
	printf("输出p1的地址：\n");
	printf("%p\n", p1);
	printf("%p\n", p2 -> prior);
	printf("输出p2的地址：\n");
	printf("%p\n", p2);
	printf("%p\n", p3 -> prior);
	printf("%p\n", p1 -> next);
	printf("输出p3的地址：\n");
	printf("%p\n", p3);
//	printf("下面是free();");
//	free(p2);//用了free，后面的语句就不输出了，why??? 
//	p2 = NULL;
//	printf("**********");
	printf("%p\n", p2 -> next);
	
//	p1 -> prior = null;
//	p2 -> prior = p1;
//	p2 -> next = p3;
//	p3 -> prior = p2;
//	p3 -> next = null;
//	
//	p -> prior -> next = p;

//	if(p2 -> prior -> next = p2){
//		printf("双向链表！");
//	}
	
	 
	return 0;
}
