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

//�������� 
void init(pStack);
void push(pStack,int);
void traverse(pStack);
void pop(pStack,int*);
void clear(pStack);

//main()
int main(){
	
	Stack s;//Stack �ȼ��� struct Stack	
	int val;
	
	init(&s);//ֻ��д��ַ���ܸı�s��ֵ 
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
	printf("ջ��ʣ��Ԫ��Ϊ��");
	traverse(&s);
	
	printf("��գ�\n");
	clear(&s);
//	traverse(&s);
	pop(&s,&val);
		
	return 0;
}

//��ʼ��ջ 
void init(pStack s){
	
	s -> pTop = (pNode)malloc(sizeof(Node));
	if(s -> pTop == NULL){
		printf("��̬�ڴ����ʧ�ܣ�\n");
		exit(-1);	
	}else{
		s -> pBottom = s -> pTop;
		s -> pTop -> pNext = NULL;
	}
}

//ѹջ 
void push(pStack s,int val){
	
	pNode pNew = (pNode)malloc(sizeof(Node));
		
	pNew -> data = val;
	pNew -> pNext = s -> pTop;
	s -> pTop = pNew;
}

//����ջ 
void traverse(pStack s){
	
	pNode p = s -> pTop;
	while(p != s -> pBottom){
		
		printf("%d\n",p -> data);
		p = p -> pNext;
	}
}

//��ջ
void pop(pStack s,int* val){
	
	pNode p = s -> pTop;
	if(s -> pTop == s -> pBottom){
		printf("��ջʧ�ܣ�\n");
		exit(-1);
	}
	
	*val = s -> pTop -> data;
	s -> pTop = s -> pTop -> pNext;
	printf("��ջԪ���ǣ�%d\n",*val);
	free(p);
	p = NULL;
}

//clear���
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


