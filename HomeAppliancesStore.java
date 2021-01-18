import javax.print.attribute.standard.OutputDeviceAssigned;
import java.awt.*;
import java.awt.print.Printable;
import java.util.Scanner;
public class HomeAppliancesStore {
    /**variable statements*/
    static String company;
    static String adress;
    static int employees;
    protected static int Counter=0;

    /** Getters and Setters*/

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String newcompany) {
        this.company = newcompany;
    }

    public String getAddress() {
        return this.adress;
    }

    public void setAddress(String newaddress) {
        this.adress = newaddress;
    }

    public int getEmployees() {
        return this.employees;
    }

    public void setEmployees(int newemployees) {
        this.employees = newemployees;
    }
    public static void main(String[] args) {

        /**user add's company,adress,employees information*/

        Scanner myObj = new Scanner(System.in);
        System.out.println("what's the company's name: ");
        String company = myObj.nextLine();
        if (company == null) {
            System.out.println("there is no company name");
        } else {
            System.out.println("The company's name is: " + company);
        }

        {
            Scanner myObj2 = new Scanner(System.in);
            System.out.println("What's the company's adress: ");
            String adress = myObj2.nextLine();
            if (adress == null) {
                System.out.println("there is no company adress");
            } else {
                System.out.println("the adress is : " + adress);
            }
        }

        {
            Scanner myObj3 = new Scanner(System.in);
            System.out.println("How many people work in the company: ");
            int employees = myObj3.nextInt();
            if (employees == 0) {
                System.out.println("there is no employees");
            } else {
                System.out.println("There are: " + employees + " employees");
            }
        }
        /** here we give info for the device Fridge and call its function to print the info*/
        Fridge fridge = new Fridge(70, 190, 70, "Bosch", "KB90 AA","Fridge",120,110,112,114,false,true);
        fridge.PrintFridge();
        /** here we give info for the device Air Condition and call its function to print the info*/
        AirCondition AC= new AirCondition(777, 250, 200, "Tesla", "TT34X81-1232IAW","Air Condition",255,11942,12010,true,true,true);
        AC.PrintAirCondition();
        /** here we give info for the device Washing Machine and call its function to print the info*/
        WashineMachine WM= new WashineMachine(85,60,60,"Pitsos","WNP1200D8","Washing Machine",175,8,55,false,14,1200);
        WM.PrintWashineMchine();
        /** here we give info for the device Oven and call its function to print the info*/
        Oven O=new Oven(81,60,60,"AEG","CCB6442ABM","Oven",140,75,7,true,true,"Immersed");
        O.PrintOven();
        /** Here is the counter for every device connected*/
        Counter = fridge.getCounterFridge() +WM.getCounterWashineMachine() + O.getCounterOven() + AC.getCounterAirCondition();
        System.out.println("There are: " + Counter  +" Devices connected");

    }

}
