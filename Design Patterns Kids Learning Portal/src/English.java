public class English implements Subject{
    @Override
    public void printDetails() {
        System.out.println("English language Contains 26 alphabets: ");
        for(char c = 'A'; c <= 'Z'; ++c)
            System.out.print(c + " ");
        System.out.println();
    }

}
