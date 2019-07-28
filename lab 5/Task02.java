import java.util.*;
class Printing_Array{
	int[] array_=new int[4];
	
     void populateArray(){
     	Scanner sc=new Scanner(System.in);
        for(int i=0;i<=array_.length-1;i++){
        	int input_=sc.nextInt();
        	array_[i]=input_;
        }


     }
     void  showdetails(){
     	for(int i=0;i<=array_.length-1;i++){
      System.out.print(array_[i]+" ");
      
      }
  }
     
     public static void main(String args[]){
      Printing_Array result=new Printing_Array();
      
      result.populateArray();
      result.showdetails();
     }

 }




