void main() {
  // Start the recursive sum at 5 and display the result.
  int sum = sumNumbers(5);
  System.out.println(sum);
}

public static int sumNumbers(int x) {
  // Recursive case: add the current number to the sum of all smaller numbers.
  if (x != 0)
    return (x + sumNumbers(x  - 1));
  // Base case: stop the recursion when the number reaches 0.
  else
    return x;
}
