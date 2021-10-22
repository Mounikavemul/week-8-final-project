public class MultiplicationDecorator extends SubjectDecorator implements Strategy{
    public MultiplicationDecorator(Subject subject) {
        super(subject);
    }

    @Override
    public void printDetails() {
        subject.printDetails();
        multiplicationDetails();
    }

    private void multiplicationDetails() {
        System.out.println("* symbol is used for multiplication.\nTo multiply two numbers you write them like this:\na*b");
    }

    @Override
    public int doOperation(int a, int b) {
        return a*b;
    }
}
