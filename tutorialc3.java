
/**
 * Write a description of class tutorialc3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorialc3
{
   int age; // instance variable 
   static int qty; // static variable 
   public static void main (String[] args){
       int n1=10; // local variable
       
       //Implici Typecasting 
       
       double dt=n1;
       system.out.println(dt);
   
       //Explicit Typecating 
       double db = 10.01;
       int itr= (int)db;
       
       System.out.println(itr);
       
       // Finding min, mmax , size, and bytes
       
       System.out.println(Byte.Max_value); //returns max value
       System.out.println(Byte.Max_value); //returns min value
       System.out.println(Byte,SIZE); // returns bits
       System.out.println(Byte,BYTES); // returns bytes
       
       //Escape Sequwnce 
       
       System.out.println("Hello\nWorld "); // new line
       System.out.println("Hello\tNepal "); // tab
       Systewdm.out.println("He said \" "); //Quotation
        // Unicode escape
        System.out.println("\u2764");
       