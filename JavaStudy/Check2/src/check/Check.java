package check;

import constants.Constants;

public class Check {
	  private static String firstName="倫大";
	  private static String lastName="大塚";
	  
	  private static void  printName(String first,String last) {
		System.out.println("printNameメソッド→"+last+first);
	  }

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		printName(firstName, lastName);
		
		Constants a = new Constants();
		Pet pet = new Pet(a.CHECK_CLASS_JAVA, a.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robot = new RobotPet(a.CHECK_CLASS_R2D2, a.CHECK_CLASS_LUKE);
		robot.introduce();				
	}   
	

}
