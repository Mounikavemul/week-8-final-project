import java.util.Scanner;

public class Driver {
    public static void main(String[]args){
        System.out.println("Welcome to Kids Learning Portal!");
        int choice=0;
        Scanner sc=new Scanner(System.in);
        String s="";
        Subject subject=null;
        while(choice!=3) {
            System.out.println("==================================================");
            System.out.println("\nChoose a subject to view its details\n1- English\n2- Math\n3- Exit");
            s=sc.nextLine();
            choice= Integer.parseInt(s);

            if(choice==1){
                subject=new English();
                subject.printDetails();
            }
            else if(choice==2){
                subject=new Math();
                subject.printDetails();
                System.out.println("==================================================");
                System.out.println("\nChoose an operation to view its details\n1- Addition\n2- Subtraction\n3- Multiplication\n4- Division");
                s=sc.nextLine();
                int operation= Integer.parseInt(s);
                MathFacade mathFacade=MathFacade.getInstance();
                if(operation==1){
                    mathFacade.additionDetails();
                    Context context=new Context(new AdditionDecorator(subject));
                    System.out.println("3 + 4 = "+context.executeStrategy(3,4));

                }
                else if(operation==2){
                    mathFacade.subtractionDetails();
                    Context context=new Context(new SubtractionDecorator(subject));
                    System.out.println("13 - 4 = "+context.executeStrategy(13,4));
                }
                else if(operation==3){
                    mathFacade.multiplicationDetails();
                    Context context=new Context(new MultiplicationDecorator(subject));
                    System.out.println("3 * 4 = "+context.executeStrategy(3,4));
                }
                else{
                    mathFacade.divDetails();
                    Context context=new Context(new DivisionDecorator(subject));
                    System.out.println("12 / 4 = "+context.executeStrategy(12,4));
                }


            }
        }
    }
}
