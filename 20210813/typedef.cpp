#include <stdio.h>

//typedef int water;//Ϊint�����¶�ȡһ�����֣�water�ȼ���int 

//water cardId = 10;

typedef struct Student{
	
	int id;
	char name[10] = {'z','h','a','n','g','s','a','n'};
	char sex;
}ST, * PS;//PS�ȼ���struct Student *  --->  PS ps1 = &st1; 
//ST�ȼ���struct Student
 
int main(){
	
//	struct Student st;//�ȼ��� ST st; 
//	struct Student * ps = &st;//�ȼ��� ST * ps = &ST;

	ST st1;
	st1.id = 2021;
	st1.name[0] = 'a';
	st1.sex = 'm';
	printf("%d\n%c\n%s\n", st1.id, st1.sex, st1.name);
	
	printf("************���Ƿֽ���*************\n");
	
	int b = 20;
	int * a = &b;
	printf("b = %d\n a = %p\n &b = %p\n *a = %d\n", b, a, &b, *a);
	
	printf("*************�ֽ���********************\n");
	
	
	PS ps1 = &st1;//PS ps1;����ǵ���������һ����䣬����û�и�ֵ�ġ�Ҳ����˵��ps1������һ��ָ��struct Student���͵�һ��ָ�롣 
	ps1->id = 20210804;
	ps1->sex = 'f'; 
	printf("%d\n %c\n", ps1->id, ps1->sex);

	//�������д��� 
	//PS->id = 20201;
	//printf("%d\n", PS->id);
	
	//printf("cardId = %d\n", cardId);
	
	return 0; 
}
