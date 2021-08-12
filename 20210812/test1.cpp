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

void sort_list(pNode);

bool insert_list(pNode pHead, int pos, int val);

bool delete_list(pNode, int, int*);


//main函数 
int main(){
	
	pNode pHead = NULL;//等价于struct Node * pHead = NULL;
	
	pHead = create_list();//创建一个非循环单链表，并将该链表的头结点的地址赋给pHead
//	traverse_list(pHead);//这里的pHead是实参 
	
	
//	if(isEmpty(pHead)){
//		printf("isEmpty链表为空！\n");
//	}else{
//		printf("isEmpty链表不为空！\n");
//	}
	
//	int len = length_list(pHead);
//	printf("链表的长度为：%d\n", len);
	
//	printf("***********20210809**********\n");
	//sort_list(pHead);//排序 
//	traverse_list(pHead);//遍历 
	
	//插入 
	printf("******20210811************\n");
	int pos,val;
	printf("请输入要插入的pos和val\n");
	scanf("%d%d",&pos,&val);
	if(insert_list(pHead, pos, val)){
		printf("插入成功！\n");
	}else{
		printf("插入失败！\n");
	}
	traverse_list(pHead);
	
	//删除 
	int pVal;
	printf("请输入要删除的pos\n");
	scanf("%d",&pos);
	if(delete_list(pHead, pos, &pVal)){
		
		printf("删除成功！你删除的值是：%d\n", pVal);
	}else{
		printf("删除失败！\n");
	}
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
	p = pHead -> pNext;//,p = pHead -> pNext
	for(i = 0;i < len - 1;i++){//,p = p -> pNext
		q = p -> pNext;
		for(j = i + 1;j < len;j++){//,q = p -> pNext	,q = q -> pNext
			
			if(p -> data > q -> data){
//				pPointer -> data = pHead -> pNext -> data;
				t = p -> data;
				p -> data = q -> data;
//				r -> pNext -> pNext -> data = pPointer -> data;
				q -> data = t;
				q = q -> pNext;
			}
			else{
				q = q -> pNext; 
			}
			
		}
		p = p -> pNext;
		//q = p -> pNext; 
	}
	
//	for(t = 0;t < len;t++){
//		
//		printf("%d\n",q -> pNext -> data);
//		q = q -> pNext;
//	}
}

//在pHead所指向链表的第pos个结点的前面插入一个新的结点，该结点的值是val,并且pos的值是从1开始 
bool insert_list(pNode pHead, int pos, int val){

	int i = 0;
	pNode p = pHead;
	
	while(p != NULL && i < pos - 1) {
		
		p = p -> pNext;
		i++;
	}
	
	if(i > pos - 1 || p == NULL){
		
		return false;
	}
	
	pNode pNew = (pNode)malloc(sizeof(Node));
	if(pNew == NULL){
		
		printf("动态内存分配失败！\n");
		exit(-1);
	}
	
	pNew -> data = val;
	pNew -> pNext = p -> pNext;
	p -> pNext = pNew;
	
	return true;
}

//删除 
bool delete_list(pNode pHead, int pos, int* pVal){
	
	int i = 0;
	pNode p = pHead;
//	pNode q = p -> pNext;//放在这里是错误的！如果放在这里，当执行完while语句后，q的地址还指向pHead -> pNext 
	
	while(p -> pNext != NULL && i < pos - 1) {
		
		p = p -> pNext;
		i++;
	}
	
	if(i > pos - 1 || p -> pNext == NULL){
		
		return false;
	}
	
	pNode q = p -> pNext;//放在这里，while语句执行完，指针p的位置变了，q也跟着变到了p后 
	*pVal = q -> data; 
	p -> pNext = p -> pNext -> pNext;
	free(q);
	q == NULL;
	
	
	return true; 
}







