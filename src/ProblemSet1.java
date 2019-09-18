/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */
        final double PAGE_LENGTH = 11;
        final double PAGE_WIDTH = 8.5;
        final double IN_TO_MM = 25.4;
        double pageArea = (PAGE_WIDTH * IN_TO_MM) * (PAGE_LENGTH * IN_TO_MM);
        System.out.printf("\n%,.2f square millimeters \n", pageArea);


        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
         final double IN_TO_CM = 2.54;
         double pagePerimeter = (PAGE_WIDTH * IN_TO_CM * 2) + (PAGE_LENGTH * IN_TO_CM * 2);
         System.out.printf("\n%.2f square centimeters.\n", pagePerimeter);


        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
         double pageDiagonal = Math.hypot(PAGE_WIDTH, PAGE_LENGTH);
         System.out.printf("\n%.2f inches.\n", pageDiagonal);


        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;
        final double WEIGHT_HOMEWORK = .15;
        final double WEIGHT_QUIZ = .35;
        final double WEIGHT_TEST = .50;
        double homeworkGrade = (homework1 + homework2 + homework3) * WEIGHT_HOMEWORK / 3;
        double quizGrade = (quiz1 + quiz2 +quiz3) * WEIGHT_QUIZ / 3;
        double testGrade = (test1 + test2 + test3) * WEIGHT_TEST / 3;
        double finalGrade = homeworkGrade + quizGrade + testGrade;
        System.out.printf("\n%.2f%%.\n", finalGrade);


        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */
         final double HOURLY_WAGE = 12.5;
         double totalPay = (7.5 + 8 + 10.5 + 9.5 + 6 + 11.5) * HOURLY_WAGE;
         System.out.printf("\n$%.2f.\n", totalPay);

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */
         final double SALARY = 117000;
         final double FEDERAL_TAX = .24;
         final double STATE_TAX = .0637;
         final double RETIREMENT_FUND = .07;
         double paycheck = SALARY / 24;
         double takeHomePay = paycheck * (1 - FEDERAL_TAX) * (1 - STATE_TAX) * (1 - RETIREMENT_FUND);
         System.out.printf("\n$%.2f.\n", takeHomePay);


        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
         final double STUDENTS_ON_TRIP = 273;
         final double TEACHERS_ON_TRIP = 28;
         final double BUS_CAPACITY = 54;
         double amountOfBus = Math.ceil((STUDENTS_ON_TRIP + TEACHERS_ON_TRIP) / BUS_CAPACITY);
         double leftOver = (STUDENTS_ON_TRIP + TEACHERS_ON_TRIP) % BUS_CAPACITY;
         System.out.printf("\n%.0f busses are needed, with ", amountOfBus);
         System.out.printf("%.0f passengers on the last bus.\n" , leftOver);


        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */



        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */



        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */



    }
}
