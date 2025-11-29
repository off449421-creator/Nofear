// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.Scanner;

/**
 * 
 */
public class PassFail
{

    /**
     * 
     */
    static public void main(String[] args)
    {
        Scanner sc = new Scanner ( System . in );
        System . out . print ( "Enter marks: " );
        int marks = sc . nextInt ( );
        if (marks >= 40) {
            System . out . println ( "Student has Passed." );
        }
        else {
            System . out . println ( "Student has Failed." );
        }
    }
}
