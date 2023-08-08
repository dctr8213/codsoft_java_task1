import java.util.*;

public class RandNumb{
  public static void main(String[] args){ 
      int user_guess=0,won=0,lost=0;
      Random r=new Random();
      Scanner sc=new Scanner(System.in);
      System.out.println("cool! lets play the number guessing game with computer.\n");
      System.out.println("how many chances you want??");
      int chances =sc.nextInt();
      
  while(true)
  {
   int computer_pick=r.nextInt(101);
   System.out.print("Enter any number b/w (1,100): ");
   int count=0;
   boolean flag=true,success=false;
   
   while(flag)
     {
      user_guess=sc.nextInt();
      
      
      if(computer_pick==user_guess)
      {
        System.out.println("Congrats you won.");
        flag=false;
        success=true;
      }
      
      else if(computer_pick<user_guess)
      {
        count++; 
        if(count==chances)
        {
          System.out.println("Sorry,you lost the actual number is "+computer_pick+".");
          flag=false;
        }
        else
        {
          System.out.println("Guess a small number(still you have "+(chances-count)+" chances)");
        }
      }
      
      else
      {
        count++;
        if(count==chances)
        {
          System.out.println("Sorry,you lost the actual number is "+computer_pick+".");
          flag=false;
        }  
        else
        {
          System.out.println("Guess a big number(still you have "+(chances-count)+" chances)");}
        }
      }
      
      
    if(success)
    {
      won++;
    }
    else{
      lost++;
    }
    
    System.out.println("you won "+(won)+" matches out of "+(won+lost)+" and lost "+(lost)+" matches.");
    System.out.println("Wanna play another one if(Yes '1':No '0'): ");
    int n=sc.nextInt();
    if(n==0)
    {
      break;
    }
  }
    sc.close();
  }
}