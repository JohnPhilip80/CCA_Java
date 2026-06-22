//String Functions
package edu.cca.john.jfs;

public class Demo {
	public static void main(String[] args) {
		//String in Java
        String a="John Philip";
        String b="John Philip";
        
        System.out.println("a==b :" + a==b);
        System.out.println("Equals : "+a.equals(b));
        
        System.out.println("A : "+a);
        System.out.println("B : "+b);
 
        System.out.println("Equals : "+a.equals(b));
        
        System.out.println("Equals Ignore Case: "+a.equalsIgnoreCase(b));

        System.out.println("Length: "+a.length());
        System.out.println("CharAt: "+a.charAt(0));
        System.out.println("Uppercase: "+a.toUpperCase());
        System.out.println("Lowercase: "+a.toLowerCase());
        System.out.println("Replace: "+a.replace("John","Martin"));
        System.out.println("Contains : " + a.contains("John"));
        System.out.println("Empty : " + a.isEmpty());
        System.out.println("EndWith : " + a.endsWith("hn"));
        System.out.println("StartWith : " + a.startsWith("Jo"));
        System.out.println("Substring : " + a.substring(5));
        System.out.println("Substring : " + a.substring(0, 5));
        char[] carray = a.toCharArray();
        String c=" John ";
        System.out.println("Length: "+c.length());
        System.out.println("C:"+c);
        System.out.println("C Trim :"+c.trim());
        System.out.println("C Trim Length:"+c.trim().length());
	}
}
