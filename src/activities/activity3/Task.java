package activities.activity3;

public class Task implements ObjRankInterface {
	private String taskName;
	private int priority;
	
	public Task() {
		this.taskName = "No assigned name";
	}
	
	public Task(String userTaskName) {
		this.taskName = userTaskName;
	}
	
	public void setName(String userInp) {
		taskName = userInp;
	}
	
	public String getName() {
		return this.taskName;
	}
	
	public String toString() {
			return taskName + " has a priority level: " + priority;
	}

	@Override
	public void setPriority(int userInp) {
		this.priority = userInp;
	}

	@Override
	public int getPriority() {
		return priority;
	}




}
