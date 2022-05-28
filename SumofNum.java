package akash.com;

public class SumofNum {
	public static void main(String[] args) {
	       String str = "Akash Add 456 with 897";
	        char[] array = str.toCharArray();
	        int sum = 0;
	        String temp = "";
	        for (int i = 0; i < array.length; i++)
	        {
	            char c = array[i];
	            if (Character.isDigit(c)) 
	            {
	                temp += c;
	            }
	            else
	            {
	                if (temp != "")
	                {
	                    sum += Integer.valueOf(temp);
	                    temp = "";
	                }
	            }
	        }
	        if (temp != "") 
	        {
	          sum += Integer.valueOf(temp);
	        }
	        System.out.println(sum);
	    }
	}


