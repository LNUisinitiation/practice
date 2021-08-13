#include <stdio.h>
#include <malloc.h>

typedef struct Node{
	
	int data;//数据域 
	struct Node *pNext;//指针域 
}SingleNode, *LinkList;//SingleNode等价于struct Node   LinkList等价于struct Node * 


int main(){
	
	SingleNode p1;

	LinkList r;
	
	p1.data = 1;
	

	r = &p1;
	
	r -> data = 2;
	
	free(r);

	printf("**************\n");
	printf("输出r：%p\n",r-> data);
	printf("输出：%p\n",&p1);


	return 0; 
}
