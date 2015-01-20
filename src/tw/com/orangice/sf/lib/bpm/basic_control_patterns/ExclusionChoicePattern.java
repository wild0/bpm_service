package tw.com.orangice.sf.lib.bpm.basic_control_patterns;

import java.util.ArrayList;

import tw.com.orangice.sf.lib.bpm.model.BPMModel;
import tw.com.orangice.sf.lib.bpm.model.BPMMonitor;
import tw.com.orangice.sf.lib.bpm.model.BPMProcess;
import tw.com.orangice.sf.lib.bpm.model.BPMTask;



public class ExclusionChoicePattern  extends BPMModel{
	
	BPMTask currentTask = null;
	ArrayList<BPMTask> candidateTasks = new ArrayList<BPMTask>(); 
	
	public ExclusionChoicePattern(BPMTask currentTask){
		this.currentTask = currentTask;
	}
	public void addTask(BPMTask task){
		candidateTasks.add(task);
	}
	public void execute(){
		
	}
}
