
public class BudgetCalculator {
    private int age;
    private boolean marital;
    private boolean dependent;
    private boolean carownership;
    
    //Constructor
    public BudgetCalculator(){
        age=0;
        marital=true;
        dependent=true;
        carownership=true;
    }
    
    public BudgetCalculator(int age,boolean marital,boolean dependent,boolean carownership){
        this.age=age;
        this.marital=marital;
        this.dependent=dependent;
        this.carownership=carownership;
    }
    
    //Get Method
    public int getAge(){
        return age;
    }
    public boolean getMarital(){
        return marital;
    }
    public boolean getDependent(){
        return dependent;
    }
    public boolean getCarownership(){
        return carownership;
    }
    
    //Set Method
    public void setAge(int age){
        this.age=age;
    }
    public void setMarital(boolean marital){
        this.marital=marital;
    }
    public void setDependent(boolean dependent){
        this.dependent=dependent;
    }
    public void setCarownership(boolean carownership){
        this.carownership=carownership;
    }
    
    @Override
    public String toString(){
        return("\nYour age:"+age+
                "\nMarital Status:"+marital+
                "\nDependent Status:"+dependent+
                "\nCar Ownership:"+carownership);
    }
    public void budgetc(){
        System.out.print("Your Budget Expenses is ");
    }
}

class singlePTU extends BudgetCalculator{
    public void budgetc(){
        System.out.println("RM 1760");
    }
}

class singleCO extends BudgetCalculator{
    public void budgetc(){
        System.out.println("RM 2290");
    }
}

class marriedwithoutchild extends BudgetCalculator{
    public void budgetc(){
        System.out.println("RM 4110");
    }
}

class marriedwithchild extends BudgetCalculator{
    public void budgetc(){
        System.out.println("RM 5360");
    }
}

class seniorsingle extends BudgetCalculator{
    public void budgetc(){
        System.out.println("RM 2330");
    }
}

class seniorcouple extends BudgetCalculator{
    public void budgetc(){
        System.out.println("RM 3020");
    }
}

class singleparent extends BudgetCalculator{
    public void budgetc(){
        System.out.println("RM 4200");
    }
}


class BudgetAllocation extends BudgetCalculator{
    private int income;
    private int budget;

    //Constructor
    public BudgetAllocation(int income,int budget){
        this.income=income;
        this.budget=budget;
    }
    
    //Get Method
    public int getIncome(){
        return income;
    }
    public int getBudget(){
        return budget;
    }
    
    //Set Method
    public void setIncome(int income){
        this.income=income;
    }
    public void setBudget(int budget){
        this.budget=budget;
    }
    
    public void allocation(){
        double shortterm,midterm,longterm,wants,needs,wantsandneeds;
        shortterm=income/10;
        midterm=income/10;
        longterm=income/10;
        wants=income/4;
        needs=income*45/100;
        wantsandneeds=wants+needs;
        System.out.println("\n"+super.toString()+
                "\nYour short-term savings:"+shortterm+
                "\nYour mid-term savings:"+midterm+
                "\nYour long-term savings:"+longterm+
                "\nYour wants and needs:"+wantsandneeds+
                "\nYour Budget:"+budget);
        if(wantsandneeds>=budget){
            System.out.println("You have exceeded your budget");
        }
        else if(wantsandneeds<budget){
            System.out.println("You are within the budget");
        }
    }
    
    
}
