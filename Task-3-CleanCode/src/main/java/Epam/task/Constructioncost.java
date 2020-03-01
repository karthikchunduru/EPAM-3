package Epam.task;

public class Constructioncost {
	int standard_materials=12000;
	int high_standard_materials=18000;
	int above_standard_materials=15000;
	int high_standard_materials_automated=25000;
	

		double caluculateCost(int std,double area,boolean automated)
		{
		double amt=0;
		
		if(std==1) {
		amt=amt+(standard_materials*area);
		}
		
		else if(std==2){
		amt=amt+(above_standard_materials*area);
		}
		
		else if(std==3 && !automated){
		amt=amt+(high_standard_materials*area);
		}
		
		else{
		amt=amt+(high_standard_materials_automated*area);
		}
		return amt;
}
}
