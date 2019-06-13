#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
 int t,rem,sum=0; 
 t=n;
  while(t != 0){
  rem = t%10;
    sum = sum+ rem;
    t = t/10;
   
  } printf("%d",sum);
  
  return 0;
}