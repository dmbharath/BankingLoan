import java.util.Scanner;
// if i didn't write the extends keyword here it means it is also inherited from the object 
class Loan 
{
    private String cusName;
    private String fatName;
    private int aadhNum;
    private float propRange;
    private float principalAmount;
    private float timeDuration;
    private float simpleInterest;
    private static float rateOfInterest;
    @SuppressWarnings("static-access")
    public Loan()
    {
        this.rateOfInterest = 2.5f; 
    }
    public String getCusName()
    {
        return cusName;
    }
    public void setCusName(String cusName)
    {
        this.cusName = cusName;
    }
    public String getFatName()
    {
        return fatName;
    }
    public void setFatName(String fatName)
    {
        this.fatName = fatName;
    }
    public int getAadharNum()
    {
        return aadhNum;
    }
    public void setAadharNum(int aadhNum)
    {
        this.aadhNum = aadhNum;
    }
    public float getPropRange()
    {
        return propRange;
    }
    public void setPropRange(float propRange)
    {
        this.propRange = propRange;
    }
    public float getRateOfInterest()
    {
        return rateOfInterest;
    }
    @SuppressWarnings("static-access")
    public void setRateOfInterest(float rateOfInterest)
    {
        this.rateOfInterest = rateOfInterest;
    }
    public void input()
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer name");
        cusName = sc.nextLine();
        System.out.println("Enter the father name");
        fatName = sc.nextLine();
        System.out.println("Enter the aadhar num");
        aadhNum = sc.nextInt();
        System.out.println("Enter the property range");
        propRange = sc.nextFloat();
    }
    public void display()
    {
        System.out.println("Customer name : "+cusName);
        System.out.println("Father name : "+fatName);
        System.out.println("Aadhar number : "+aadhNum);
        System.out.println("Property range : "+propRange);
    }
    static 
    {
        rateOfInterest = 2.5f;
    }
    public void input2()
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the principal amount");
        principalAmount = sc.nextFloat();
        System.out.println("Kindly mention the time duration");
        timeDuration = sc.nextFloat();
    }
    public void compute()
    {
        simpleInterest = ((principalAmount*timeDuration*rateOfInterest)/100);
    }
    public void display2()
    {
        System.out.println("Simple interest "+simpleInterest);
    }
}
class PersonalLoan extends Loan
{
    public PersonalLoan()
    {
        super();
        System.out.println("====== FOR PERSONAL LOAN======");
        setRateOfInterest(3.0f);
    }
}
class EducationalLoan extends Loan
{
    public EducationalLoan()
    {
        super();
        System.out.println("====== FOR EDUCATIONAL LOAN ======");
        setRateOfInterest(2.0f);
    }
}
class HomeLoan extends Loan 
{
    public HomeLoan()
    {
        super();
        System.out.println("====== FOR HOME LOAN ======");
        setRateOfInterest(2.8f);
    }
}
class CarLoan extends Loan
{
    public CarLoan()
    {
        super();
        System.out.println("====== FOR CAR LOAN ======");
        setRateOfInterest(4.0f);
    }
}
public class BankingLoan 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Loan selectedLoan = null;
        System.out.println("=======Available loans=======");
        System.out.println("1. Personal Loan ");
        System.out.println("2. Education Loan ");
        System.out.println("3. Home Loan ");
        System.out.println("4. Car Loan ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                selectedLoan = new PersonalLoan();
                break;
            }
            case 2:
            {
                selectedLoan = new EducationalLoan();
                break;
            }
            case 3:
            {
                selectedLoan = new HomeLoan();
                break;
            }
            case 4:
            {
                selectedLoan = new CarLoan();
                break;
            }
            default:
            {
                System.out.println("Invalid option!");
                System.out.println("We are sorry can't find the loan");
            }
        }
        if(selectedLoan != null)
        {
            selectedLoan.input();
            selectedLoan.display();
            selectedLoan.input2();
            selectedLoan.compute();
            selectedLoan.display2();
        }
        sc.close();
    }
}
