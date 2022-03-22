package AllForloopProblems;

public class Generatinprime {
	static void generateprime()
	
	{
	int c=0;
	   for(int i=1;i<=100;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   if(j%i==0)
			   {
				   c++;
			   }
		   }
		   if(c==2)
		   {
			   System.out.println(i+" ");
		   }
	   }
}
	


	public static void main(String[] args) {
		
		Generatinprime.generateprime();

	}
}


