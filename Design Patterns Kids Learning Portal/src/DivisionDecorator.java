public class DivisionDecorator extends SubjectDecorator implements Strategy{
    public DivisionDecorator(Subject subject) {
        super(subject);
    }

    @Override
    public void printDetails() {
        subject.printDetails();
        divDetails();
    }

    private void divDetails() {
        System.out.println("/ symbol is used for subtraction.\nTo divide two numbers you write them like this:\na/b");
    }

    @Override
    public int doOperation(int a, int b) {
        return a/b;
    }
}
