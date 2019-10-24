// Milos Njegovanovic
package mortgagecalculator;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static double calculateMortgage(int principal, int period, float rate) {
        double monthlyMortgage = (principal * (((rate/100)/12) * (Math.pow(1 + ((rate/100)/12), period*12)))) / (Math.pow(1 + ((rate/100)/12), period*12) - 1);

        return monthlyMortgage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        
        int principal;
        float rate;
        int period;
        double mortgage;
        
        while (true) {
            System.out.println("Principal ($1k - $1M):");
            principal = sc.nextInt();

            if (principal >= 1000 && principal <= 1000000) {
                break;
            }
            System.out.println("Principal must be between 1,000 and 1,000,000");
        }
        
        while (true) {
            System.out.println("Annual interest rate:");
            rate = sc.nextFloat();
            
            if (rate > 0 && rate <= 30) {
                break;
            }
            System.out.println("Rate must be greater than 0 and less or equal to 30");
        }
        
        while (true) {
            System.out.println("Period (Years):");
            period = sc.nextInt();
            
            if (period >= 1 && period <= 30) {
                break;
            }
            System.out.println("Period must be between 1 and 30, including those numbers");
        }
        
        mortgage = calculateMortgage(principal, period, rate);
        System.out.println("Monthly mortgage payment: " + "$" +df.format(mortgage));
    }
}
