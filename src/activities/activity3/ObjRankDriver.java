package activities.activity3;

import java.util.Random;

public class ObjRankDriver {
	
	public static void main(String[] args) {
		
		Task[] taskArr = new Task[4];
		Random ranPriority = new Random();
		
		System.out.println("\nInitializing generic task list");
		for (int ii =0; ii < taskArr.length; ii++) {
			taskArr[ii] = new Task();
			taskArr[ii].setName("Task " + String.valueOf(ii));
			taskArr[ii].setPriority(ii);
			System.out.println(taskArr[ii].toString());
		}
		
		
		System.out.println("\nRandomizing Priority!");
		for (int jj =0; jj<taskArr.length; jj++) {
			taskArr[jj].setPriority(ranPriority.nextInt(10));
			System.out.println(taskArr[jj].toString());
		}
		
	}
}
	
