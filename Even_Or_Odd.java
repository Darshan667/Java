import java.sql.SQLOutput;

public class Even_Or_Odd {
    public static void main(String[] args)
    {
        int num = 7;
        String output;
        if(num %2 == 0)
        {
            output = "Even";
        }
        else {
            output = "Odd";
        }
        System.out.println(output);

       //Using ternary operator ?
        output = num %2 == 0 ? "Even" : "Odd";
        System.out.println(output);

    }

}
