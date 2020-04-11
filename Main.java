
import java.util.Scanner;

public class Main {
static Scanner s=new Scanner(System.in);
static double save;
static double spend;
static double income(){
    double job ,anyother,totalincome;
    System.out.println("monthly calculator");
    System.out.println("enter how much money you are earning");
    job=s.nextDouble();
    System.out.println("enter your other soource income money");
    anyother=s.nextDouble();
    System.out.println("total amount of money you earn this month");
    totalincome=job+anyother;
    return totalincome;
}
static double essentialtotalcost(){
    double rent,travel,insurance,grocerry,totalbill,mobilerecharge;
    System.out.println("MONTHLY COST");
    System.out.println("enter your rent ");
    rent=s.nextDouble();
    System.out.println("enter your insurance kharcha ");
    insurance=s.nextDouble();
    System.out.println("enter your travel kharcha of this month");
    travel=s.nextDouble();
    System.out.println("enter how much money you spend on groccery");
    grocerry=s.nextDouble();

    System.out.println("how much you spend on mobile recharge");
    mobilerecharge=s.nextDouble();
    System.out.println("you total essential cost of this month");
    totalbill=rent+travel+grocerry+mobilerecharge+insurance;
    return totalbill;


}
static double otherstuff(){
    double clothing, party,socialactivities,total;
    System.out.println("enter the money which you spend on clothing");
    clothing=s.nextDouble();
    System.out.println("enter the money you spend with chilling with friend");
    party=s.nextDouble();
    System.out.println("enter the money you spend on socialactivities");
    socialactivities =s.nextDouble();
    System.out.println("other stuff is ");
    total=clothing+party+socialactivities;
    return total;

}
    public static void main(String[] args) {
       double totalIncome,esentialkharcha,otherkharcha, budget,outofbudget;
        System.out.println("************WELCOME TO HOME BUDGET MANAGEMENT SYSTEM  **********");
        System.out.println("enter your budget you want to fix for this month");
        budget=s.nextDouble();
        totalIncome=income();
        System.out.println("you total income is" +totalIncome);
        esentialkharcha=essentialtotalcost();
        System.out.println("your essential kharcha of this month is " +esentialkharcha);
        otherkharcha=otherstuff();
        System.out.println("your other kharcha is"+otherkharcha);
        save=totalIncome-(esentialkharcha+otherkharcha);
        System.out.println("you have save this month" + save);
        spend=esentialkharcha+otherkharcha;
        outofbudget=spend-budget;
        if (budget > spend){
            System.out.println("your budget is "+budget+"you have spend money is "+spend);
        }
        else{
            System.out.println("the amount of money you spend after fixing your budget"+outofbudget);
        }


    }
}
