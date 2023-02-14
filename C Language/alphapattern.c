#include <stdio.h>
int main() {
   int i, j;
   char input, alphabet = 'A';
   printf("Enter an character you want to print in the last row: ");
   scanf("%c", &input);
   if(input>=97&&input<=122) input-=32;//if Entered lowercase,then convert lowercase to uppercase
   printf("Total Iteration of following row is:%d\n",input-65+1);
   for (i = 1; i <= (input - 65 + 1); ++i) {//(input-Ascii code an integer number as A=65,B=66,..F=70,..Z=90)
      for (j = 1; j <= i; ++j) {
         printf("%c ", alphabet);
      }
      ++alphabet;
      printf("\n");
   }
   return 0;
}
