public abstract class SubjectDecorator implements Subject{
    Subject subject;

    public SubjectDecorator(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void printDetails() {
        subject.printDetails();
    }
}
