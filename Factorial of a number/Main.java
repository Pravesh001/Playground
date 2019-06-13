#include <stdio.h>
//#include<Math.h>
int main() {
	//Type your code
  int n,fac = 1;
   scanf("%d",&n);
  while(n > 0) {
  fac = fac * n	;
  n--;
  }
  printf("%d",fac);
	return 0;
}