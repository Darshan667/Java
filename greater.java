public class greater {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 4;
        int num3 = 8;
        
        if (num1<num2 && num1<num3)
        {
            if (num1==0)
            {
                System.out.println("get lost");
            }
            else{
                System.out.println("Num1 is greater one");
            }
            
        }
        else if(num2>num3){
            System.out.println("Num2 is greater");
        }
        else {
            System.out.println("num 3 is greater");
        }
        
    }
    
}
