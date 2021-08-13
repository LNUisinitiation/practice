#include <stdio.h>
#include <malloc.h>

typedef struct Node{
	
	int data;//数据域 
	struct Node *pNext;//指针域 
}SingleNode, *LinkList;//SingleNode等价于struct Node   LinkList等价于struct Node * 


int main(){
	
	SingleNode p1;
	SingleNode p2;
	SingleNode p3;
	LinkList p;
//	LinkList q;
	
	p1.data = 1;
	p2.data = 2;
	p3.data = 3;
	
	p = &p1;
//	q = &p3;
	
//	q -> pNext = &p2;
//	p -> pNext = q;
//	
//	printf("p3的地址：%p\n",p1.pNext);//应该等于p3的地址
//	printf("q的地址：%p	\np3的地址：%p\n",q,&p3); 
//	
////	printf("%p\n",p2.pNext);//应该等于垃圾数字的地址
//	
//	printf("p2的地址：%p\n",p3.pNext);//应该等于p2的地址 
//	printf("q -> pNext: %p\n",q -> pNext);
//	printf("p2的地址：%p\n",&p2);
	
//	char * p = (char *)malloc(MAX_BUF_SIZE);
//	LinkList r = (LinkList)malloc(4);
	LinkList r;
	
	p -> pNext = &p2;
	p -> pNext -> pNext = &p3;
	r = p -> pNext;
	p -> pNext = r -> pNext;
	printf("r -> data = %d\n",p2.data); 
	free(r);
	r = NULL; 
//	printf("释放p2所占内存：%p\n",&p2);
	printf("**************\n");
	printf("p1.data = %d\n",p1.data);
	
	//free(r)”释放的是指针变量 r 所指向的内存，而不是指针变量 r 本身。
	//指针变量 r 并没有被释放，仍然指向原来的存储空间。
	
	//其实，指针只是一个变量，只有程序结束时才被销毁。释放内存空间后，
	//原来指向这块空间的指针还是存在的，只不过现在指针指向的这块内存是不合法的。
	//因此，在释放内存后，必须把指针指向 NULL，以防止指针在后面不小心又被解引用了。
	
	
	return 0; 
}
