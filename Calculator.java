class Calculator
{
    public void subtraction(int a, int b)
    {
        int result = a - b;
        System.out.println("Subtraction Result is " + result);
    }

    public static void main(String[] args)
    {
        System.out.println("Hello World");
        Calculator calc = new Calculator();
        calc.subtraction(10, 5);
    }
}
