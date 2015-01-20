package tw.com.orangice.sf.lib.bpm.basic_control_patterns;

import java.util.ArrayList;

import tw.com.orangice.sf.lib.bpm.model.BPMModel;
import tw.com.orangice.sf.lib.bpm.model.BPMTask;


public class SequencePattern extends BPMModel {
	int currentIndex = 0;
	ArrayList<BPMTask> tasks = new ArrayList<BPMTask>();
	
	public SequencePattern(){
		
	}
	public void addTask(BPMTask task){
		tasks.add(task);
	}
	public BPMTask getCurrentTask(){
		return tasks.get(currentIndex);
		
	}
	
	
}
