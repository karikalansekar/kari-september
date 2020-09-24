package string;

public class test {

	public static void main(String[] args) {
		String a = "i am a tester";
         int store= a.length();  // to identify the length of the string
         System.out.println(store);
         
          String a1=a.toUpperCase();   // to print the string in upper case
          System.out.println(a1);
          
          String a2=a.toLowerCase();  // to print the string in lower case
          System.out.println(a2);
          
          int a3=a.indexOf('a');    //to identify the exact location of a specific character in a string
          System.out.println(a3);
          
          int a4=a.lastIndexOf('a');  // to identify the exact location of a character in a string from last of backward
          System.out.println(a4);
          
          int a5=a.indexOf("am");   // to identify the position or location of a specific name in a string
          System.out.println(a5);
          
          char a6=a.charAt(7);    // to print the character in the arg
          System.out.println(a6);
          
          String aa =" and developer";
          String aa1=a.concat(aa);    // to add another characters in the string
          String aa2= a+" and DEVELOPER";  //another method to add a string
          System.out.println(aa1);
          System.out.println(aa2);
          
          boolean f1=aa2.contains("tester");  // to check whether "tester" the mentioned character present in the string 
          System.out.println(f1);
          
          boolean f5=aa2.contains("apple"); //to check whether "apple" the mentioned character present in the string
          System.out.println(f5);
          
          boolean f2=aa1.equals(aa2);  // to check whether the 2 string are equal or not
          System.out.println(f2);
          
          boolean f3=aa1.equalsIgnoreCase(aa2);  //to check whether the 2 strings are equal or not by ignoring the case-sensitive
          System.out.println(f3);
          
          String a7= aa1.replace("tester", "not a tester");  //to replace the a character in a string
          System.out.println(a7);
	}

}
