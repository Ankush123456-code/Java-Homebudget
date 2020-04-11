import java.util.Scanner;
	/*Name :- Ankush Kunwar
	        Rollno. :- 45
	        section:-K18TM
	        concept use
	        1-inheritance
	        2-nested class
	        3-execption handling
	*/
	

	

	

	

	

	

	

	class income{
	    static int days;
	    static double income1(){
	        Scanner s=new Scanner(System.in);
	        double job ,anyother,totalincome;
	        System.out.println("monthly calculator");
	        System.out.println("enter how much money you are earn in this "+days+"days");
	        job=s.nextDouble();
	        System.out.println("enter your other soource income money in this  "+days +"days ");
	        anyother=s.nextDouble();
	        System.out.println("total amount of money you earned in this "+days +"days");
	        totalincome=job+anyother;
	        return totalincome;
	    }
	    static  class Days	/// NESTED CLASS
	    {
	        Scanner input = new Scanner(System.in);
	

	        void dayINPUT()
	        {
	            System.out.println("Enter how many  days of budget u want to calculate\n");
	            days=input.nextInt();
	        }
	        void display(){
	            System.out.println("the day you Enter for your Income Calculation : "+days);
	        }
	    }
	

	

	

	}
	public class Main extends income {
	    static Scanner s=new Scanner(System.in);
	    static double save;
	    static double save1;
	    static double spend;
	    static double essentialtotalcost(){
	        double rent,travel,insurance,grocerry,totalbill,mobilerecharge;
	        System.out.println("MONTHLY COST");
	        System.out.println("enter your rent for the "+days +"days");
	        rent=s.nextDouble();
	        System.out.println("enter your insurance kharcha for  ");
	        insurance=s.nextDouble();
	        System.out.println("enter your travel kharcha of the  "+days +"days");
	        travel=s.nextDouble();
	        System.out.println("enter how much money you spend on groccery of the  "+days + "days");
	        grocerry=s.nextDouble();
	

	        System.out.println("how much you spend on mobile recharge");
	        mobilerecharge=s.nextDouble();
	        System.out.println("you total essential cost of this  "+days  +"days");
	        totalbill=rent+travel+grocerry+mobilerecharge+insurance;
	        return totalbill;
	

	

	    }
	    static double otherstuff(){
	        double clothing, party,socialactivities,total;
	        System.out.println("enter the money which you spend on clothing");
	        clothing=s.nextDouble();
	        System.out.println("enter the money you spend with chilling with friend in this " +days  +"days");
	        party=s.nextDouble();
	        System.out.println("enter the money you spend on socialactivities in "+days +"days");
	        socialactivities =s.nextDouble();
	        System.out.println("other stuff is "+days +"days");
	        total=clothing+party+socialactivities;
	        return total;
	

	    }
	    public static void main(String[] args) {
	        double totalIncome,esentialkharcha,otherkharcha, budget,outofbudget;
	        System.out.println("************WELCOME TO HOME BUDGET MANAGEMENT SYSTEM  **********");
	income.Days nestedObject = new income.Days(); /// NESTED CLASS CALL
	        nestedObject.dayINPUT();//
	        nestedObject.display();
	

	

	        totalIncome=income.income1();
	        System.out.println("you total income is" +totalIncome);
	        System.out.println("Enter how much budget you want to fix for this  "+days + " days");
	        budget=s.nextDouble();
	

	

	        try
	        {
	            if (budget<totalIncome && budget>0){
	                System.out.println("Your budget in with in your salary");
	                System.out.println("your budget is for this "+budget);
	            }
	            else
	            {
	                throw new strings("Your budget Exceeding the limit");
	            }
	        }
	        catch(strings e)
	        {
	            System.out.println(e);
	        }
	

	

	

	        esentialkharcha=essentialtotalcost();
	        System.out.println("your essential kharcha of this" + days + " days is " +esentialkharcha);
	        otherkharcha=otherstuff();
	        System.out.println("your other kharcha is"+otherkharcha);
	

	        save=totalIncome-(esentialkharcha+otherkharcha);
	        save1=(esentialkharcha+otherkharcha)-totalIncome;
	

	

	        if (save >0){
	

	            System.out.println("you have save this" +days+ "days" + save);
	        }
	        else {
	            System.out.println("extra money you spend in this"+days+ "days is"+save1);
	        }
	

	        spend=esentialkharcha+otherkharcha;
	        outofbudget=spend-budget;
	

	

	        if (budget > spend){
	            System.out.println("your budget is "+budget+"you have spend money is "+spend);
	        }
	        else{
	            System.out.println("the amount of money you spend after fixing your budget for this " +days+ "days"+outofbudget);
	        }
	

	

	

	    }
	}
	class strings extends Exception  /// EXCEPTION HANDLING
	{
	    strings(String msg)
	    {
	        super(msg);
	    }
	}

