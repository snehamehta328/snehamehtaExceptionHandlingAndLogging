package snehaMehta;
//import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import java.util.Scanner;


public class constCostApp {
    public static void main(String[] args) {
//        BasicConfigurator.configure();
        final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(snehaMehta.App.class);
        Scanner sc = new Scanner(System.in);
        constCostt cost = new constCostt();
        int choice;
        do{
            Logger.info("Enter area of house: ");
            int area = sc.nextInt();
            Logger.info("**** Material Standards ****\n");
            Logger.info("1. Standard Material Rs.1200/sq feet\n");
            Logger.info("2. Above Standard Material Rs.1500/sq feet\n");
            Logger.info("3. High Standard Material Rs.1800/sq feet\n");
            Logger.info("4. High Standard Material and Fully Automated Rs.2500/sq feet\n");
            Logger.info("5. Exit\n");
            choice = sc.nextInt();
            switch (choice){
                case 1:  Logger.info("The total cost of standard material for house of area " + area +" sq feet is Rs." + cost.standardHouseCost(area));
                    break;
                case 2:  Logger.info("The total cost of above standard material for house of area " + area +" sq feet is Rs." + cost.aboveStandardHouseCost(area));
                    break;
                case 3:  Logger.info("The total cost of high standard material for house of area " + area +" sq feet is Rs." + cost.highStandardHouseCost(area,false));
                    break;
                case 4:  Logger.info("The total cost of high standard material and fully automated house of area " + area +" sq feet is Rs." + cost.highStandardHouseCost(area,true));
                    break;
                case 5:  Logger.info("Program Terminated!!");
                    System.exit(0);
                    break;
                default: Logger.info("Wrong choice!!");
            }
        }while(choice!=5);
    }
}
