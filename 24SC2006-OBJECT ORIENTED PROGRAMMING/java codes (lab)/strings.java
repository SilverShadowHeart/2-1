package neww;

public class strings {
 public static void main(String args[]) {
	 String str="hello this is java class";
	 String str1="hello";
	 String str2="hellO";
	 String str3="hi how are you";
	 String str5="1234";
	 String str4="HELLO";
	 String str6="java234";	 
	 String str7="";
	 String str9=" 			hello java 		";
	 System.out.println(str.length());
	 System.out.println(str1.length());
	 System.out.println(str2.length());
	 System.out.println(str3.length());
	 System.out.println(str4.length());
	 System.out.println(str5.length());
	 System.out.println(str6.length());
	 System.out.println(str7.length());
	 System.out.println(str9.length());
	 
	 System.out.println(str.toUpperCase());
	 System.out.println(str4.toLowerCase());
	 System.out.println(str.charAt(4));
	 System.out.println(str3.charAt(9));
	 //index always starts at 0 not 1 it will give char 
	 System.out.println(str1.compareTo(str2));
	 System.out.println(str1.compareTo(str4));
	 System.out.println(str1.compareToIgnoreCase(str4));
	 System.out.println(str1.concat(str4));
	 System.out.println(str1.contains("he"));
	 System.out.println(str1.contentEquals(str2));
	 System.out.println(str1.endsWith("lo"));
	 System.out.println(str1.equals(str4));
	 System.out.println(str1.indexOf("l"));
	 System.out.println(str1.equalsIgnoreCase(str2));
	 System.out.println(str1.matches("[a-zA-z]+"));
	 System.out.println(str5.matches("[0-9]+"));
	 System.out.println(str5.matches("\\d+"));
	 System.out.println(str6.matches("[a-zA-z0-9]+"));
	 System.out.println(str6.matches("[a-zA-z]+\\d+"));
	 //+ * ? are used in the above matches
	 System.out.println(str1.isEmpty());
	 System.out.println(str7.isEmpty());
	 System.out.println(String.join(" j ",str1,str2,str3,str4));
	 System.out.println(String.join(" j ","jio","hi","jdia","djsoa"));
	 System.out.println(str1.lastIndexOf("l"));
	 System.out.println(str1.replace("l","p"));
	 System.out.println(str1.replaceFirst("hel","tra"));
	 String str8[]= str3.split(" ");
	 for (String i:str8) {
		 System.out.println(i);
	 }
	 System.out.println(str6.startsWith("hi"));
	 System.out.println(str.subSequence(5, 7));
	 char arr[]=str4.toCharArray();
	 System.out.println(arr[0]);
	 System.out.println(str9.trim());
	 System.out.println(String.valueOf(9.8f));
 }


}
 

