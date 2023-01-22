class Calculator
{
    public void subtraction(int a, int b)
    {
        int result = a - b;
        System.out.println("Subtraction Result is " + result);
    }

    public void multiplication(int a, int b)
    {
        int result = a * b;
        System.out.println("Multiplication Result is " + result);
    }

    public static void main(String[] args)
    {
        System.out.println("Hello World");
        Calculator calc = new Calculator();
        int a= 10, b=5;
        calc.subtraction(a, b);
        calc.multiplication(a, b);
    }

}
