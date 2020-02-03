public class callr{

public static void main(String args[]){
int p=100;
int[] intarray=new int[10];
callbyvalue(p);
System.out.println("The value of p : "+p);
callbyref(intarray);
System.out.println("after main "+intarray[0]);
}
public static void callbyvalue(int value){
   ++value;
}
public static void callbyref(int[] array){
    System.out.println("in ref method "+array[0]);
    array[0]=15;
    System.out.println("after "+array[0]);
}
}