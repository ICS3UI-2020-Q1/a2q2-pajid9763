import java.util.Scanner;
/**
 * 
 * @author Darian Pajic
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask for the integers
  System.out.println("Please enter an integer:");
  int a = input.nextInt();
  System.out.println("Please enter another integer:");
  int b = input.nextInt();

  // determine which number is bigger or if they are the same
  if (a > b){
    System.out.println("The biggest number is " + a + ".");
  } else if(a == b){
    System.out.println("There is no biggest number.");
  }else{ 
    System.out.println("The biggest number is " + b + ".");
  
  }

    
  }
}
