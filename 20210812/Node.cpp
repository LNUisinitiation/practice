#include <stdio.h>
#include <malloc.h>

//������ 
//typedef struct Node{
//	
//	int data;//������ 
//	struct Node *pointer;//ָ����
//	
//}Node,*LinkList;

//˫������
typedef struct DulNode{
	
	int data;//������
	struct DulNode *prior;
	struct DulNode *next;
	
}DulNode,*DulLinkList; 

//������ ����ѭ������	˫������ ˫��ѭ������ 

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
	
	//���p1��p2��p3�������� 
//	printf("%d\n", dulNode1.data);
//	printf("%d\n", dulNode2.data);
//	printf("%d\n", dulNode3.data);
	
	printf("���p1�ĵ�ַ��\n");
	printf("%p\n", p1);
	printf("%p\n", p2 -> prior);
	printf("���p2�ĵ�ַ��\n");
	printf("%p\n", p2);
	printf("%p\n", p3 -> prior);
	printf("%p\n", p1 -> next);
	printf("���p3�ĵ�ַ��\n");
	printf("%p\n", p3);
//	printf("������free();");
//	free(p2);//����free����������Ͳ�����ˣ�why??? 
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
//		printf("˫������");
//	}
	
	 
	return 0;
}
