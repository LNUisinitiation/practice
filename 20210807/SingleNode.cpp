#include <stdio.h>
#include <malloc.h>

typedef struct Node{
	
	int data;//������ 
	struct Node *pNext;//ָ���� 
}SingleNode, *LinkList;//SingleNode�ȼ���struct Node   LinkList�ȼ���struct Node * 


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
//	printf("p3�ĵ�ַ��%p\n",p1.pNext);//Ӧ�õ���p3�ĵ�ַ
//	printf("q�ĵ�ַ��%p	\np3�ĵ�ַ��%p\n",q,&p3); 
//	
////	printf("%p\n",p2.pNext);//Ӧ�õ����������ֵĵ�ַ
//	
//	printf("p2�ĵ�ַ��%p\n",p3.pNext);//Ӧ�õ���p2�ĵ�ַ 
//	printf("q -> pNext: %p\n",q -> pNext);
//	printf("p2�ĵ�ַ��%p\n",&p2);
	
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
//	printf("�ͷ�p2��ռ�ڴ棺%p\n",&p2);
	printf("**************\n");
	printf("p1.data = %d\n",p1.data);
	
	//free(r)���ͷŵ���ָ����� r ��ָ����ڴ棬������ָ����� r ����
	//ָ����� r ��û�б��ͷţ���Ȼָ��ԭ���Ĵ洢�ռ䡣
	
	//��ʵ��ָ��ֻ��һ��������ֻ�г������ʱ�ű����١��ͷ��ڴ�ռ��
	//ԭ��ָ�����ռ��ָ�뻹�Ǵ��ڵģ�ֻ��������ָ��ָ�������ڴ��ǲ��Ϸ��ġ�
	//��ˣ����ͷ��ڴ�󣬱����ָ��ָ�� NULL���Է�ָֹ���ں��治С���ֱ��������ˡ�
	
	
	return 0; 
}
