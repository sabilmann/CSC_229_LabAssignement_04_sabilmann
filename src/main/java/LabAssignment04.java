public class LabAssignment04 {

    // Task 01 - The output of this code will be num "...", followed by one "Blastoff!"
   public void countDown(int num)
    {
        if (num == 0) // test
            System.out.println("Blastoff!");
        else {
            System.out.println("...");
            countDown(num-1); // recursive call
        }
    }
    // Task 01 - This is the modified code, so it only prints even numbers.
    public void countDownEven(int num) {
        if (num == 0) {
            System.out.println("Blastoff!");
        } else
        {
            if (num % 2 == 0) System.out.println(num); // Print if even
            countDownEven(num-1); // recursive call
        }
    }
    // Task 01 - The time complexity of this algorithm is O(n).

    // Task 02 - The output here will be the gcd of two numbers, x+y
    public int gcd(int x, int y)
    {
        if (x%y==0)
        {
            return  y;
        }
        else {
            return gcd(y,x % y);
        }
    }
    // Task 02 This is the modified code, using subtraction instead of %
    public int gcdSubtraction(int x, int y)
    {
        if (x==y) {
            return x;
        }
        else if (x>y) {
            return gcdSubtraction(x-y,y);
        } else {
            return gcdSubtraction(y-x,x);
        }
    }
    /*Task 03 - The time complexity of this Fibonacci method is 0(2^n),
     because there are two calls for each non-base case. */
    public int fib(int n)
    {
        if (n <= 0) //base case
            return 0;
        else if (n==1)  // base case
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
    // Homework - 1. Hello World recursive function:
    public void HelloWorld(int n)
    {
        if (n <= 0) return;
        System.out.println("Hello World");
        HelloWorld(n-1);
    }
    // Homework - 2. This function returns sum of multiples of 7 between two numbers:
    public int sumOfMultiples(int n1, int n2)
    {
        if (n1 > n2) return 0; //base case
        if (n1 % 7 == 0) return n1 + sumOfMultiples(n1 + 7, n2);
        return sumOfMultiples(n1 + 1, n2); // changes n1 to next number
    }
    // Homework - 3. This functions uses the binary search algorithm with recursion.
    public int binarySearch(int [] array, int low, int high, int key)
    {
        if (high < low) return -1; // base case
        int mid = low + (high - low) / 2; // middle index of range
        if (array[mid] == key) return mid; // key is mid
        else if (array[mid] > key) return binarySearch(array, low, mid - 1, key); // if key is smaller
        else return binarySearch(array, mid+1,high,key); // if key is higher than mid
    }
}
