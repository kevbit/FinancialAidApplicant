
/**
 * Describes an applicant for financial aid.
 *
 * @author Kevin Lo
 * @version 2020-09-29
 */
public class FinancialAidApplicant
{
    public static final double LOWEST_THRESHOLD = 20000.0;
    public static final double MIDDLE_THRESHOLD = 60000.0;
    public static final double HIGHEST_THRESHOLD = 150000.0;
    public static final int FOUR_FAMILY_MEMBERS = 4;
    public static final int SIX_FAMILY_MEMBERS = 6;
    String applicantName;
    double applicantIncome;
    int applicantNumberOfPeople;

    /**
     * Constructor for objects of class FinancialAidApplicant
     * 
     * @param name applicant's name
     * @param income a double representing applicant's income
     * @param numberOfPeople an integer representing numberOfPeople in applicant's household
     */
    public FinancialAidApplicant(String name, double income, int numberOfPeople)
    {
        applicantName = name;
        applicantIncome = income;
        applicantNumberOfPeople = numberOfPeople;

    }

    /**
     * Gets the applicant's name
     *
     * @return the applicant's name
     */
    public String getName()
    {
        return applicantName;
    }

    /**
     * Sets the applicant's number of people in the household
     *
     * @param  people the new number of people in applicant's household
     */
    public void setNumberOfPeopleInHousehold(int people)
    {
        applicantNumberOfPeople = people;
    }

    /**
     * Sets a new household income
     *
     * @param income a double representing new household income
     * @return the sum of x and y
     */
    public void setHouseholdIncome(double income)
    {
        applicantIncome = income;
    }

    /**
     * Returns true if the applicant qualifies and false otherwise
     *
     * @return true if applicant qualifies and false otherwise
     */
    public boolean qualifies()
    {
        if (applicantIncome >= LOWEST_THRESHOLD && applicantIncome <= MIDDLE_THRESHOLD && applicantNumberOfPeople >= FOUR_FAMILY_MEMBERS) 
        {
            return true;
        }
        else if (applicantIncome > MIDDLE_THRESHOLD && applicantIncome <= HIGHEST_THRESHOLD && applicantNumberOfPeople >= SIX_FAMILY_MEMBERS)
        {
            return true;
        }
        else if (applicantIncome < 20000)
        {
            return true;
        }
        else
        {
            return false;
        }

            
        
    }
}
