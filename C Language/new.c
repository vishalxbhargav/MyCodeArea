#include<stdio.h>
int main(){
	
        //The Butterfly Pattern
        int n=8;  
        //Upper

        for( int i=1; i<=n; i++){
            //1st
            for(int j=1; j<=i; j++){
                printf("*");
            }
            
            //spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                printf(" ");
            }

            //2nd
            for(int j=1; j<=i; j++){
                printf("*");
            }
            printf("\n");
        }

        //Lower 
        for( int i=n; i>=1; i--){
            //1st
            for(int j=1; j<=i; j++){
                printf("*");
            }
            
            //spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                printf(" ");
            }

            //2nd
            for(int j=1; j<=i; j++){
                printf("*");
            }
            printf("\n");
        }
}