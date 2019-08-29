package com.ssi.task3.stringclass;
import java.util.Random;
public class Question2 {
	
	
	public int generateNo(){
	    	Random rand = new Random();
	    	int randInt = rand.nextInt(100000);
	    	return randInt;
	}
    public String generateRollNo(){
    String code[] ={"12","34","56","78"};
    int ind = this.generateNo()%4;
    String s = code[ind]+ String.valueOf(this.generateNo());
    return s;
    }
	public static void main(String[] args) {
		   Question2 objdemo = new Question2(); 
		   
		   int noOfStudent = (objdemo.generateNo()%10 )+10;
		   String rnos[] = new String [noOfStudent];
		   for(int i=0;i<noOfStudent;++i)
			   rnos[i]= objdemo.generateRollNo();
		   int cntCS=0,cntIT=0,cntMech=0,cntCivil=0,cntOther=0;
		   for(String studentRno:rnos){
		   if(studentRno.startsWith("12"))
			   {
			     cntCS+=1;
			   }
		   else if(studentRno.startsWith("34"))
		   {
		     cntIT+=1;
		   }
		   else if(studentRno.startsWith("56"))
		   {
		     cntMech+=1;
		   }
		   else if(studentRno.startsWith("78"))
		   {
			     cntCivil+=1;
			   }
		   else
			   cntOther+=1;
		   }
		   
		   System.out.println("Total rollNo: "+rnos.length);
		   for(String rno:rnos)
			   System.out.print(rno+" ");
		   System.out.println("\nBranch\t count");
		   System.out.println("CS     \t"+ cntCS);
		   System.out.println("IT     \t"+ cntIT);
		   System.out.println("Mech   \t"+ cntMech);
		   System.out.println("Civil  \t"+ cntCivil);
		   System.out.println("OtherBranch\t"+cntOther );
			/*12	CS
			34	IT
			56	Mech
			78	Civil
			count the branch wise no of students
*/

	}

}
