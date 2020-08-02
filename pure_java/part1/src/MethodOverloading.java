public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calcScore("Mojtaba", 500);
        int newScore2 = calcScore(100);

        System.out.println("New score is: " + newScore);
        System.out.println("New score is: " + newScore2);
    }

    public static int calcScore(String playerName, int score) {
        System.out.println("player "+playerName + ", Score: " + score + " points");
        return score * 1000;
    }

    //an overloaded method:
    public static int calcScore(int score) {
        System.out.println("Score: " + score);
        return score * 300 + calcScore(); // nested usage of overloaded methods
    }

    public static int calcScore() {
        return 3;
    }
}
