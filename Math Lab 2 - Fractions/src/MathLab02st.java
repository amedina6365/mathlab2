 // MathLab02st.java
// The Rational Class Program I
// This is the student, starting version of the MathLab02 assignment.


import javax.swing.JOptionPane;


public class MathLab02st
{
	public static void main (String args[])
	{   
		String strNbr1 = JOptionPane.showInputDialog("Enter Numerator "); 
		String strNbr2 = JOptionPane.showInputDialog("Enter Denominator ");

		int num = Integer.parseInt(strNbr1);
		int den = Integer.parseInt(strNbr2);

		Rational1 r = new Rational1(num,den);
		JOptionPane.showMessageDialog(null,r.getDecimal1()+ " equals "+  r.getOriginal() +
				"\n" +" and reduces to " + r.getRational());
          
		System.exit(0);
	}
}

				

class Rational1
{
	private int num, den;
		
//	Rational
	public Rational1 (int n, int d){
		num = n;
		den = d;
	}
	
//	getNum
	
	public int getNum1(int n){
		return num;
	}
//	getDen
	
	public int getDen1(int d){
		return den;
	}

//	getDecimal
	public String getDecimal1(){
		return num+ "/"+  den ;
	}
//	getRational 
	public String getRational(){
		int gfc= getGCF(num, den);
		return   (num/gfc)+ "/"+ (den/gfc);
	}
	
//	getOriginal
	public double  getOriginal(){
		return (double) num/den;
	}
//	reduce

	

	private int getGCF(int n1,int n2)
	{
		int rem = num;
		int gcf = den;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
		return gcf;
	} 
}



	

 


