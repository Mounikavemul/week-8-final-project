public class SubtractionDecorator extends SubjectDecorator implements Strategy{
    public SubtractionDecorator(Subject subject) {
        super(subject);
    }

    @Override
    public void printDetails() {
        subject.printDetails();
        subDetails();
    }

    private void subDetails() {
        System.out.println("- symbol is used for subtraction.\nTo subtract two numbers you write them like this:\na-b");
    }

    @Override
    public int doOperation(int a, int b) {
        return a-b;
    }
}
