void main() {
    int[] scores = new int[7];
    float averagePerGame = 0;
    int totalScore = 0;
    int aboveAverageCount = 0;

    Scanner in = new Scanner(System.in);

    for (int i=0; i < 7; i++) {
        System.out.print("Enter score for game " + (i+1) + ": ");
        scores[i] = in.nextInt();
        totalScore += scores[i];
    }

    averagePerGame = (float)(totalScore / 7);

    for (int i=0; i<7; i++) {
        if (scores[i] > averagePerGame) {
            aboveAverageCount++;
        }
    }

    if(aboveAverageCount >= 4) {
        System.out.println("Consistent performance");
    } else {
        System.out.println("Need more consistency");
    }
}