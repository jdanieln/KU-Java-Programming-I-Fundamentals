void main() {
    System.out.println("Hello, World!");

    //Declare an array of integers and initialize it with values
    int [] numbers = {1, 2, 3, 4, 5};
    int [] ages = new int[5]; // Declare an array of integers with a size of 5

    Scanner input = new Scanner(System.in);

    for (int i = 0; i < ages.length; i++) {
        System.out.print("Enter age for person " + (i + 1) + ": ");
        ages[i] = input.nextInt();
    }

    for (int age : ages) {
        System.out.println("Age for person: " + age);
    }

    for (int i = 0; i < numbers.length; i++) {
        System.out.println("Number at index " + i + ": " + numbers[i]);
    }
}