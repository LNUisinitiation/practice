#include <stdio.h> 
#include <malloc.h>
#include <stdlib.h>

typedef struct Node{
	
	int data;
	struct Node* pNext;
}Node,* pNode;

typedef struct Stack{
	
	pNode pTop;
	pNode pBottom;
}Stack,* pStack;

//函数声明 
void init(pStack);
void push(pStack,int);
void traverse(pStack);
void pop(pStack,int*);
void clear(pStack);

//main()
int main(){
	
	Stack s;//Stack 等价于 struct Stack	
	int val;
	
	init(&s);//只有写地址才能改变s的值 
	push(&s,5);
	push(&s,4);
	push(&s,3);
	push(&s,2);
	push(&s,1);
	traverse(&s);
	
	pop(&s,&val);
	pop(&s,&val);
	pop(&s,&val);
	pop(&s,&val);
	printf("栈中剩余元素为：");
	traverse(&s);
	
	printf("清空：\n");
	clear(&s);
//	traverse(&s);
	pop(&s,&val);
		
	return 0;
}

//初始化栈 
void init(pStack s){
	
	s -> pTop = (pNode)malloc(sizeof(Node));
	if(s -> pTop == NULL){
		printf("动态内存分配失败！\n");
		exit(-1);	
	}else{
		s -> pBottom = s -> pTop;
		s -> pTop -> pNext = NULL;
	}
}

//压栈 
void push(pStack s,int val){
	
	pNode pNew = (pNode)malloc(sizeof(Node));
		
	pNew -> data = val;
	pNew -> pNext = s -> pTop;
	s -> pTop = pNew;
}

//遍历栈 
void traverse(pStack s){
	
	pNode p = s -> pTop;
	while(p != s -> pBottom){
		
		printf("%d\n",p -> data);
		p = p -> pNext;
	}
}

//出栈
void pop(pStack s,int* val){
	
	pNode p = s -> pTop;
	if(s -> pTop == s -> pBottom){
		printf("出栈失败！\n");
		exit(-1);
	}
	
	*val = s -> pTop -> data;
	s -> pTop = s -> pTop -> pNext;
	printf("出栈元素是：%d\n",*val);
	free(p);
	p = NULL;
}

//clear清空
void clear(pStack s) {
	
	pNode p,q;
	
	while(s -> pTop != s -> pBottom){
		
		p = s -> pTop;
		q = p -> pNext;
		s -> pTop = q;
		free(p);
		p = NULL;	
	}
	
}


