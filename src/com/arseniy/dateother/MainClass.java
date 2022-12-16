package com.arseniy.dateother;

import static com.arseniy.dateother.solution.SolutionClass.checkNumber;
import static com.arseniy.dateother.solution.SolutionClass.getCircleSquare;
import static com.arseniy.dateother.solution.SolutionClass.getMaxNumber;
import static com.arseniy.dateother.solution.SolutionClass.getMinNumber;

public class MainClass {
    private static String initialString = "0.1, 0.15, 0.25";
    private static double circleRadius = 3.859864312;
    private static double firstNumber = 5;
    private static double secondNumber = 25.444;
    private static double thirdNumber = 0.569;

    public static void main(String[] args) {
        checkNumber(initialString);
        getCircleSquare(circleRadius);
        getMaxNumber(firstNumber, secondNumber, thirdNumber);
        getMinNumber(firstNumber, secondNumber, thirdNumber);
    }
}
