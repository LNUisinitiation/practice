#include <stdio.h>
#include <malloc.h>

int main(){

	int len;
	printf("������len��");
	scanf("%d", &len);
	int * pArr = (int *)malloc(sizeof(int) * len);
	printf("%p",pArr);
	printf("\n");
	
	int i;
	for(i = 0;i < len;i++){
		printf("��������ֵ��");
		scanf("%d",&pArr[i]);
			
	}
	
	for(i = 0; i< len;i++){
		printf("%d\n", pArr[i]);
	}
	
	free(pArr);
	
	return 0;
}
