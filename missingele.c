
 #include<stdio.h>
 #include<conio.h>
 int main(){
   int a[];
   int n,i,j,k,l;
   scanf("%d",&n);
   for(i=0;i<n;i++){
     scanf("%d",&a[i]);
   }
   for(j=0;j<n;j++){
     for(k=j+1;k<n;k++){
       if(a[j]==a[k]){
         a[k]=0;
         }
      }
   }
   for(l=0;l<n;l++){
     if(a[l]!=0){
       printf("%d",a[l]);
       }
   }
   return 0;
 }  
