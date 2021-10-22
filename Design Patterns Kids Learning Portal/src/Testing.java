import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {

    @Test
    public void mathFacadeTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        MathFacade facade=MathFacade.getInstance();
        facade.divDetails();

        assertEquals("Math is all about numbers and symbols... and fun!\r\n0 1 2 3 4 5 6 7 8 9 + - * /\r\n/ symbol is used for subtraction.\nTo divide two numbers you write them like this:\na/b\r\n", outContent.toString());
        System.setOut(originalOut);

    }

    @Test
    public void strategyTestAddition(){

        Subject subject=new Math();
        Context context=new Context(new AdditionDecorator(subject));
        int result=context.executeStrategy(3,4);

        assertEquals(result,7);
    }


    @Test
    public void strategyTestMultiplication(){

        Subject subject=new Math();
        Context context=new Context(new MultiplicationDecorator(subject));
        int result=context.executeStrategy(3,4);

        assertEquals(result,12);
    }

    @Test
    public void strategyTestSubtraction(){

        Subject subject=new Math();
        Context context=new Context(new SubtractionDecorator(subject));
        int result=context.executeStrategy(13,4);

        assertEquals(result,9);
    }

    @Test
    public void strategyTestDivision(){

        Subject subject=new Math();
        Context context=new Context(new DivisionDecorator(subject));
        int result=context.executeStrategy(20,5);

        assertEquals(result,4);
    }
}
