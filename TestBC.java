import java.util.*;
public class TestBC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BudgetCalculator person1 = new BudgetCalculator();
        BudgetAllocation person2 = new BudgetAllocation(0,0);
        
        try{
        System.out.print("Enter your age:");
        int age = input.nextInt();
        person1.setAge(age);
        
        System.out.print("Are you married?(true or false) ");  
        boolean marital = input.nextBoolean();
        person1.setMarital(marital);
        
        System.out.print("Are you dependent?(true or false) ");  
        boolean dependent = input.nextBoolean();
        person1.setDependent(dependent);
        
        System.out.print("Do you have a car?(true or false) ");  
        boolean carownership = input.nextBoolean();
        person1.setCarownership(carownership);
        
        if(age>0&&age<60){
            if(marital==true){
                if(dependent==true){
                        BudgetCalculator marriedwithoutchild = new marriedwithoutchild();
                        person1.budgetc();
                        marriedwithoutchild.budgetc();
                        person2.setBudget(4110);
                }
                else{                  
                        BudgetCalculator marriedwithchild = new marriedwithchild();
                        person1.budgetc();
                        marriedwithchild.budgetc();
                        person2.setBudget(5360);
                }
            }
            else{
                if(dependent==true){
                    if(carownership==true){
                        BudgetCalculator singleco = new singleCO();
                        person1.budgetc();
                        singleco.budgetc();
                        person2.setBudget(2290);
                    }
                    else{
                        BudgetCalculator singleptu = new singlePTU();
                        person1.budgetc();
                        singleptu.budgetc();
                        person2.setBudget(1760);
                    }
                }
                else{
                    BudgetCalculator singleparent = new singleparent();
                    person1.budgetc();
                    singleparent.budgetc();
                    person2.setBudget(4200);
                }
            }
        }
        else if(age>=60&&age<=120){
            if(marital==true){
                BudgetCalculator seniorcouple = new seniorcouple();
                person1.budgetc();
                seniorcouple.budgetc();
                person2.setBudget(3020);
            }
            else{
                BudgetCalculator seniorsingle = new seniorsingle();
                person1.budgetc();
                seniorsingle.budgetc();
                person2.setBudget(2330);
            }
        }
        else if(age>120&&age<=0){
            System.out.println("Age Error!");   //Error for age lower than 0 or higher than 120
        }
        
        System.out.print("Enter your income:");
        int income = input.nextInt();
        person2.setIncome(income);
        person2.allocation();
        }catch(java.util.InputMismatchException e){
            System.out.println("Input error");
        }
    }
}
