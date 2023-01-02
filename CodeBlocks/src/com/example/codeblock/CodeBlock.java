package com.example.codeblock;

public class CodeBlock {
    public static void main(String[] args) {


        caluclateScore(true, 800, 99, 99);
        caluclateScore(true, 10000, 199, 299);
    }

        public static int caluclateScore(boolean gameOver, int score ,int levelCompleted , int bonus)
        {
            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 1000;
                System.out.println("final score is" + finalScore);
                return finalScore;
            }
            else {
                return -1;
            }

        }



}
