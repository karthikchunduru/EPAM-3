package Epam.task;

public class Interest {
	float principal;
	float time;
	float rate_of_interest;
	
	public float simpleInterest(float principal,float time,float rate_of_interest)
	{
		return (principal*time*rate_of_interest)/100;
	}
	public float compoundInterest(float principal,float time,float rate_of_interest)
	{
		float amt=(float)(principal*(Math.pow((1+(rate_of_interest/100)), time)));
		amt=amt-principal;
		return amt;
	}
}
