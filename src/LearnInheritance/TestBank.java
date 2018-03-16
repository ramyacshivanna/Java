package LearnInheritance;
//multiple inheritance through interface
public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HSBCBank hs=new HSBCBank();
		hs.Debit();
		hs.Credit();
		hs.TransferMoney();
		hs.HouseLoan();
		
		
		USBank ub=new HSBCBank();
		ub.Debit();
		ub.Credit();
		//ub.EducationLoan() parent can call only overridden method.
		
		System.out.println(hs.min_bal);
		System.out.println(USBank.min_bal);
		

	}

}
