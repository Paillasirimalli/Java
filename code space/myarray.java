class myarray{
public static void main(String args[]){
int[] myarray={1043,78,23,46,90,124,563,245};
int max=myarray[0];
int sum=0;
for(int i=0;i<myarray.length;i++){
sum=sum+myarray[i];
if(myarray[i]>max){
max=myarray[i];
}
}
System.out.println(max+" and sum is "+sum);
}
}