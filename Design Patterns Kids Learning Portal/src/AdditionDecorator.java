public class AdditionDecorator extends SubjectDecorator implements Strategy{

    public AdditionDecorator(Subject subject) {
        super(subject);
    }

    @Override
    public void printDetails() {
        subject.printDetails();
        additionDetails();
    }

    private void additionDetails() {
        System.out.println("+ symbol is used for addition.\nTo add two numbers you write them like this:\na+b");
    }

    @Override
    public int doOperation(int a, int b) {
        return a+b;
    }
}
