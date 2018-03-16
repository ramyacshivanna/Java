package LearnInheritance;

public class HSBCBank implements USBank, UKBank{

	public void Credit()
	{
		System.out.println("HSBC Credit for US");
	}
	
	public void Debit()
	{
		System.out.println("HSBC Debit for US");
	}
	
	public void TransferMoney()
	{
		System.out.println("HSBC transfer money in US");
	}
	
	public void EducationLoan()
	{
		System.out.println("HSBC Education loan");
	}
	
	public void CarLoan()
	{
		System.out.println("HSBC Car loan for US");
	}
	
	public void HouseLoan()
	{
		System.out.println("HSBC House loan in UK");
	}
}
