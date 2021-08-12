#include <stdio.h>

//typedef int water;//为int再重新多取一个名字，water等价于int 

//water cardId = 10;

typedef struct Student{
	
	int id;
	char name[10] = {'z','h','a','n','g','s','a','n'};
	char sex;
}ST, * PS;//PS等价于struct Student *  --->  PS ps1 = &st1; 
//ST等价于struct Student
 
int main(){
	
//	struct Student st;//等价于 ST st; 
//	struct Student * ps = &st;//等价于 ST * ps = &ST;

	ST st1;
	st1.id = 2021;
	st1.name[0] = 'a';
	st1.sex = 'm';
	printf("%d\n%c\n%s\n", st1.id, st1.sex, st1.name);
	
	printf("************我是分界线*************\n");
	
	int b = 20;
	int * a = &b;
	printf("b = %d\n a = %p\n &b = %p\n *a = %d\n", b, a, &b, *a);
	
	printf("*************分界线********************\n");
	
	
	PS ps1 = &st1;//PS ps1;如果是单独的这样一个语句，它是没有赋值的。也就是说，ps1仅仅是一个指向struct Student类型的一个指针。 
	ps1->id = 20210804;
	ps1->sex = 'f'; 
	printf("%d\n %c\n", ps1->id, ps1->sex);

	//下面两行错误： 
	//PS->id = 20201;
	//printf("%d\n", PS->id);
	
	//printf("cardId = %d\n", cardId);
	
	return 0; 
}
