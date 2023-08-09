import java.util.Scanner;

public class VisitingHospital {
    static java.util.Scanner scan = null;
    public void visitingCounter () {
        scan = new Scanner(System.in);
        String disease; String name; Long age, mobnum;
        System.out.println("\t\t\t\t\t\tWelcome to Srinidhi Hospitals\n\t\t\t\t\t\tDestination for Good Health");
        System.out.println("Please Enter your Disease Name:: ");
        disease = scan.next();
        System.out.println("Your mentioned Disease is:: "+disease);
        System.out.println("Please fill the Form:-");
        System.out.println("Enter you Name::");
        name = scan.next();
        System.out.println("Enter your Age::");
        age = scan.nextLong();
        System.out.println("Enter your Mobile Number::");
        mobnum = scan.nextLong();
        System.out.println(name+"\t"+age+"\t"+mobnum);
        System.out.println("Thanks for Filling the Form::");
        System.out.println("\n");
        System.out.println("Let us align you with the availabel Doctor::");
        try {
        Thread.sleep(2200);
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
public static void visit() {
    int drnames;
    scan = new Scanner(System.in);
    System.out.println("PLEASE CHOOSE THE DOCTOR FROM YOU WANT TO CONSULT");
    System.out.println("1.DR.SHAH(MD)\t 2.DR.SAURAV(MD)\t 3.DR.AJAY(MD)");
    drnames=scan.nextInt();
    switch(drnames)
{
case 1:
System.out.println("APPPOINT IS AT 12.00 PM");
break;
case 2:
System.out.println("APPOINTMENT IS AT 4.00 PM");
break;
case 3:
System.out.println("APPOINTMENT IS AT 7.00PM");
break;
default:
System.out.println("CHOOSE CORRECT OPTIONS");
}
}
public void listforMediciens() {
		
    System.out.println("\nMediciens are as follows : ");
    try{
        Thread.sleep(2000);
    } catch (InterruptedException ie) {
        ie.printStackTrace();
    }
    
    System.out.println(" Acetaminophen ");
    System.out.println(" ibuprofen     ");
    System.out.println(" aspirin       ");
    System.out.println(" aspirin       ");

}
    public static void main(String[] args) {
        new VisitingHospital().visitingCounter();
        VisitingHospital.visit();
        new VisitingHospital().listforMediciens();

    }

}
//Get link of Resume in readme

