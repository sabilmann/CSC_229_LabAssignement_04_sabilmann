public class Main
{
    public static void main(String[] args)
    {
        LabAssignment04 assignment = new LabAssignment04();
        // Output for Task 1 countdown method
        System.out.println("Task 01 - Output:");
        assignment.countDown(5);

        // Countdown with only even numbers
        System.out.println("Task 01 - New Method with Even Numbers Only:");
        assignment.countDownEven(5);

        //output for task 2 GCD method
        System.out.println("Task 02 - Output:");
        System.out.println(assignment.gcd(48,18));

        // GCD with Subtraction
        System.out.println("Task 02 - New Method with GCD Subtraction:");
        System.out.println(assignment.gcdSubtraction(48,18));

        // Fib Method
        System.out.println("Task 03 - Fib Method:");
        System.out.println(assignment.fib(10));

        // Homework 01 - Recursive Hello World Method)
        System.out.println("Homework 01 - Prints Hello world 4 times");
        assignment.HelloWorld(4);

        // Homework 02 - Sum of all numbers between n1 - n2, multiples of 7, with recursion.
        System.out.println("Homework 02 - Sum of multiples of 7 between 1 and 50");
        System.out.println(assignment.sumOfMultiples(1,50));

        // Homework - 3. Binary Searching Function
        int [] array1 = {1,2,3,4,5,6,7,8,9,10}; // example array used
        int key = 7; // searching for
        System.out.println("Homework 03 - Binary search for 7 in example array:");
        System.out.println(assignment.binarySearch(array1, 0, array1.length - 1, key));
    }
}
