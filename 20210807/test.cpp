#include <stdio.h>
#include <malloc.h>

typedef struct Node{
	
	int data;//������ 
	struct Node *pNext;//ָ���� 
}SingleNode, *LinkList;//SingleNode�ȼ���struct Node   LinkList�ȼ���struct Node * 


int main(){
	
	SingleNode p1;

	LinkList r;
	
	p1.data = 1;
	

	r = &p1;
	
	r -> data = 2;
	
	free(r);

	printf("**************\n");
	printf("���r��%p\n",r-> data);
	printf("�����%p\n",&p1);


	return 0; 
}
