#include <stdio.h> 
#include <malloc.h>
#include <stdlib.h>

//������� 
typedef struct Node{
	
	int data;//������
	struct Node *pNext;//ָ���� 
	
	
}Node,*pNode;//Node�ȼ���struct Node   pNode�ȼ���struct Node * 

//��������
pNode create_list();//�������� 

void traverse_list(pNode);//���������ֵ   //����������λ�ÿ��Բ��ð��β�д���壿 void traverse_list(pNode);

bool isEmpty(pNode);//����������λ�ÿ��Բ��ð��β�д���壿 bool isEmpty(pNode pHead);

int length_list(pNode);//����������λ�ÿ��Բ��ð��β�д���壿 int length_list(pNode pHead);

void sort_list(pNode);

bool insert_list(pNode pHead, int pos, int val);

bool delete_list(pNode, int, int*);


//main���� 
int main(){
	
	pNode pHead = NULL;//�ȼ���struct Node * pHead = NULL;
	
	pHead = create_list();//����һ����ѭ�������������������ͷ���ĵ�ַ����pHead
//	traverse_list(pHead);//�����pHead��ʵ�� 
	
	
//	if(isEmpty(pHead)){
//		printf("isEmpty����Ϊ�գ�\n");
//	}else{
//		printf("isEmpty����Ϊ�գ�\n");
//	}
	
//	int len = length_list(pHead);
//	printf("����ĳ���Ϊ��%d\n", len);
	
//	printf("***********20210809**********\n");
	//sort_list(pHead);//���� 
//	traverse_list(pHead);//���� 
	
	//���� 
	printf("******20210811************\n");
	int pos,val;
	printf("������Ҫ�����pos��val\n");
	scanf("%d%d",&pos,&val);
	if(insert_list(pHead, pos, val)){
		printf("����ɹ���\n");
	}else{
		printf("����ʧ�ܣ�\n");
	}
	traverse_list(pHead);
	
	//ɾ�� 
	int pVal;
	printf("������Ҫɾ����pos\n");
	scanf("%d",&pos);
	if(delete_list(pHead, pos, &pVal)){
		
		printf("ɾ���ɹ�����ɾ����ֵ�ǣ�%d\n", pVal);
	}else{
		printf("ɾ��ʧ�ܣ�\n");
	}
	traverse_list(pHead);
	
	return 0;
}

//�������� 
pNode create_list(){
	
	int len;
	int i;
	int val;//������ʱ����û�����Ľ���ֵ
	
	//������һ���������Ч���ݵ�ͷ���pHead 
	pNode pHead = (Node *)malloc(sizeof(Node));
	if(pHead == NULL) {
		
		printf("����ʧ�ܣ�������ֹ��\n");
		exit(-1);
	}
	
	pNode pTail = pHead;
	pTail -> pNext = NULL;//��ͷ����ָ������Ϊ�� 
	 
	printf("��������Ҫ���ɵ�����ĸ�����len = ");
	scanf("%d",&len);
	
	if(len < 0) {
		printf("����������С��0��������\n");
		exit(-1);
	}
	
	for(i = 0;i < len;i++){
		
		printf("�������%d������ֵ��\n", i + 1);
		scanf("%d",&val);
		
		//ÿѭ��һ�Σ��ͷ���һ�������Ч���ݵĽ�� 
		pNode pNew = (pNode)malloc(sizeof(Node));
		if(pNew == NULL) {
		
		printf("����ʧ�ܣ�������ֹ��\n");
		exit(-1);
		}

		pNew -> data = val;//���˴�ѭ�������ֵ�������		
		pTail -> pNext = pNew;
		pNew -> pNext = NULL;
		pTail = pNew;
	}
	
	return pHead;
}

//���������ֵ 
void traverse_list(pNode pHead){//�β� 
	
	pNode r = pHead;
	if(r -> pNext  == NULL){
		printf("����Ϊ�գ�\n");
		exit(-1);
	}

	int i = 1; 
	while(r -> pNext != NULL){
		printf("����ĵ�%d������ֵΪ��%d\n", i, r -> pNext -> data);
		r = r -> pNext;
		i++;
	}
	
	if(r -> pNext == NULL){
		printf("���������ϣ�\n");
	}
}

//�ж������Ƿ�Ϊ��
bool isEmpty(pNode pHead){
	
	if(pHead -> pNext == NULL){
		return true;
	}else{
		return false;
	}
	
} 

//��������
int length_list(pNode pHead){//�����βε�λ�ã��βα���д���塣 int length_list(pNode pHead);
	
	pNode r = pHead;
	if(r -> pNext  == NULL){
		printf("������Ϊ0\n");
		exit(-1);
	}

	int len = 0; 
	while(r -> pNext != NULL){
		r = r -> pNext;
		len++;
	}

	return len; 
} 

//���� 
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

//��pHead��ָ������ĵ�pos������ǰ�����һ���µĽ�㣬�ý���ֵ��val,����pos��ֵ�Ǵ�1��ʼ 
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
		
		printf("��̬�ڴ����ʧ�ܣ�\n");
		exit(-1);
	}
	
	pNew -> data = val;
	pNew -> pNext = p -> pNext;
	p -> pNext = pNew;
	
	return true;
}

//ɾ�� 
bool delete_list(pNode pHead, int pos, int* pVal){
	
	int i = 0;
	pNode p = pHead;
//	pNode q = p -> pNext;//���������Ǵ���ģ�������������ִ����while����q�ĵ�ַ��ָ��pHead -> pNext 
	
	while(p -> pNext != NULL && i < pos - 1) {
		
		p = p -> pNext;
		i++;
	}
	
	if(i > pos - 1 || p -> pNext == NULL){
		
		return false;
	}
	
	pNode q = p -> pNext;//�������while���ִ���ָ꣬��p��λ�ñ��ˣ�qҲ���ű䵽��p�� 
	*pVal = q -> data; 
	p -> pNext = p -> pNext -> pNext;
	free(q);
	q == NULL;
	
	
	return true; 
}







