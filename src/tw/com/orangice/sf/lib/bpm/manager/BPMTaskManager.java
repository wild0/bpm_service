package tw.com.orangice.sf.lib.bpm.manager;

import java.util.ArrayList;

import tw.com.orangice.sf.lib.bpm.model.BPMTask;
import tw.com.orangice.sf.lib.db.DatabaseManager;

public class BPMTaskManager {
	DatabaseManager dm = null;
	
	public BPMTaskManager(DatabaseManager dm){
		this.dm = dm;
	}
	public ArrayList<BPMTask> listOwnTasks(String ownerCode){
		return null;
		
	}
	public int modifyTask(BPMTask task){
		return 0;
		
	}
	public BPMTask addTask(BPMTask task){
		return task;
	}
	public int removeTask(long taskId){
		return 0;
	}
}
