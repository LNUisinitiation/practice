#include <stdio.h> 
#include <malloc.h>
#include <stdlib.h>

//结点类型 
typedef struct Node{
	
	int data;//数据域
	struct Node *pNext;//指针域 
	
	
}Node,*pNode;//Node等价于struct Node   pNode等价于struct Node * 

//函数声明
pNode create_list();//创建链表 

void traverse_list(pNode);//遍历链表的值   //函数声明的位置可以不用把形参写具体？ void traverse_list(pNode);

bool isEmpty(pNode);//函数声明的位置可以不用把形参写具体？ bool isEmpty(pNode pHead);

int length_list(pNode);//函数声明的位置可以不用把形参写具体？ int length_list(pNode pHead);

//bool insert_list(PNode, int, int);
//
//bool delete_list(pNode, int, int *);
//
void sort_list(pNode);


//main函数 
int main(){
	
	pNode pHead = NULL;//等价于struct Node * pHead = NULL;
	
	pHead = create_list();//创建一个非循环单链表，并将该链表的头结点的地址赋给pHead
	traverse_list(pHead);//实参 
	
	
	if(isEmpty(pHead)){
		printf("isEmpty链表为空！\n");
	}else{
		printf("isEmpty链表不为空！\n");
	}
	
	int len = length_list(pHead);
	printf("链表的长度为：%d\n", len);
	
	printf("***********20210809**********\n");
	sort_list(pHead);
	traverse_list(pHead);
	return 0;
}

//创建链表 
pNode create_list(){
	
	int len;
	int i;
	int val;//用来临时存放用户输入的结点的值
	
	//分配了一个不存放有效数据的头结点pHead 
	pNode pHead = (Node *)malloc(sizeof(Node));
	if(pHead == NULL) {
		
		printf("分配失败，程序终止！\n");
		exit(-1);
	}
	
	pNode pTail = pHead;
	pTail -> pNext = NULL;//将头结点的指针域置为空 
	 
	printf("请输入需要生成的链表的个数：len = ");
	scanf("%d",&len);
	
	if(len < 0) {
		printf("不可以输入小于0的数量！\n");
		exit(-1);
	}
	
	for(i = 0;i < len;i++){
		
		printf("请输入第%d个结点的值：\n", i + 1);
		scanf("%d",&val);
		
		//每循环一次，就分配一个存放有效数据的结点 
		pNode pNew = (pNode)malloc(sizeof(Node));
		if(pNew == NULL) {
		
		printf("分配失败，程序终止！\n");
		exit(-1);
		}

		pNew -> data = val;//将此次循环输入的值赋给结点		
		pTail -> pNext = pNew;
		pNew -> pNext = NULL;
		pTail = pNew;
	}
	
	return pHead;
}

//遍历链表的值 
void traverse_list(pNode pHead){//形参 
	
	pNode r = pHead;
	if(r -> pNext  == NULL){
		printf("链表为空！\n");
		exit(-1);
	}

	int i = 1; 
	while(r -> pNext != NULL){
		printf("链表的第%d个结点的值为：%d\n", i, r -> pNext -> data);
		r = r -> pNext;
		i++;
	}
	
	if(r -> pNext == NULL){
		printf("链表遍历完毕！\n");
	}
}

//判断链表是否为空
bool isEmpty(pNode pHead){
	
	if(pHead -> pNext == NULL){
		return true;
	}else{
		return false;
	}
	
} 

//求链表长度
int length_list(pNode pHead){//函数形参的位置，形参必须写具体。 int length_list(pNode pHead);
	
	pNode r = pHead;
	if(r -> pNext  == NULL){
		printf("链表长度为0\n");
		exit(-1);
	}

	int len = 0; 
	while(r -> pNext != NULL){
		r = r -> pNext;
		len++;
	}

	return len; 
} 

//排序 
void sort_list(pNode pHead){
	
	int i,j,t;
	pNode p = pHead;
	pNode q = pHead;
	int len = length_list(pHead);
	for(i = 0,p = pHead -> pNext;i < len - 1;i++,p = p -> pNext){
		
		for(j = i + 1,q = p -> pNext;j < len;j++,q = q -> pNext){
			
			if(p -> data > q -> data){
//				pPointer -> data = pHead -> pNext -> data;
				t = p -> data;
				p -> data = q -> data;
//				r -> pNext -> pNext -> data = pPointer -> data;
				q -> data = t;
			}
//			else{
//				r = r -> pNext; 
//			}
			
		}
//		pHead = pHead -> pNext;
//		r = pHead -> pNext; 
	}
	
//	for(t = 0;t < len;t++){
//		
//		printf("%d\n",q -> pNext -> data);
//		q = q -> pNext;
//	}
}











