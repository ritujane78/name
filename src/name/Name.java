/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



package name;
import java.util.Scanner;
/**
 *
 * @author Ritu
 */
public class Name {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a;
        
        Scanner reader = new Scanner(System.in);
System.out.println("Enter name");

a=reader.nextLine();
a=a.replaceAll("\\s+", " ");
System.out.println("Your name is:" + a);
System.out.println("There are " + length(a) + " letters in your name.");
System.out.println(check(a));
System.out.println("In Hungarian Notation: " + hungarian(a));
System.out.println("There are " + vowels(a) + " vowels in your name");
System.out.println("Name without Vowels: " + removeVowels(a));








        
        // TODO code application logic here
    }
    public static int length(String a)
    {
         int spaces = a.replace(" ", "").length();
         System.out.println(a);
         return (spaces);
    }
    
    public static String check(String a)
    { String[] names = a.split(" ");
       if(names[0].length()==names[1].length()){
      return("Good one!");}
      else
       {
           return("Not Bad though!");
       
       } 
    
    }
    public static String hungarian(String a)
    {
        String h = a.replace(" ", "");
        
        h = h.substring(0,1).toLowerCase() + h.substring(1);
    return h;
    }
    
    public static int vowels(String a)
    {int v=0;
    a=a.replace(" ", "");
    
    
    a=a.toLowerCase();
        for (int i =0; i < a.length(); ++i) {
    switch(a.charAt(i)) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            v++;
            break;
        default:
           
    }
        }
    return v;
    }
   public static String removeVowels(String a)
   {
       a= a.toLowerCase();
   a=a.replaceAll("a|e|i|o|u| ", "");
   return a;
   }
}
