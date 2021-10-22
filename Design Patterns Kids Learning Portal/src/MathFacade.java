public class MathFacade {
    private Subject addition;
    private Subject subtraction;
    private Subject multiplication;
    private Subject division;
    private Subject math;
    private static MathFacade mathFacade=new MathFacade();
    private MathFacade(){
        math=new Math();
        addition=new AdditionDecorator(math);
        subtraction=new SubtractionDecorator(math);
        multiplication=new MultiplicationDecorator(math);
        division=new DivisionDecorator(math);

    }

    public void additionDetails() {
       addition.printDetails();
    }

    public void divDetails() {
        division.printDetails();
    }

    public void multiplicationDetails(){
        multiplication.printDetails();
    }

    public void subtractionDetails(){
        subtraction.printDetails();
    }

    public static MathFacade getInstance(){
        return mathFacade;
    }
}
