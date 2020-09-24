package string;

public class test {

	public static void main(String[] args) {
		String a = "i am a tester";
         int store= a.length();
         System.out.println(store);
         
          String a1=a.toUpperCase();
          System.out.println(a1);
          
          String a2=a.toLowerCase();
          System.out.println(a2);
          
          int a3=a.indexOf('a');
          System.out.println(a3);
          
          int a4=a.lastIndexOf('a');
          System.out.println(a4);
          
          int a5=a.indexOf("am");
          System.out.println(a5);
          
          char a6=a.charAt(7); 
          System.out.println(a6);
          
          String aa =" and developer";
          String aa1=a.concat(aa);
          String aa2= a+" and DEVELOPER";
          System.out.println(aa1);
          System.out.println(aa2);
          
          boolean f1=aa2.contains("tester");
          System.out.println(f1);
          
          boolean f5=aa2.contains("apple");
          System.out.println(f5);
          
          boolean f2=aa1.equals(aa2);
          System.out.println(f2);
          
          boolean f3=aa1.equalsIgnoreCase(aa2);
          System.out.println(f3);
          
          String a7= aa1.replace("tester", "not a tester");
          System.out.println(a7);
	}

}
