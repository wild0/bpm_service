package tw.com.orangice.sf.lib.bpm.model;

import java.util.ArrayList;

import tw.com.orangice.sf.lib.bpm.callback.TaskCallBack;

public class BPMTask {
	final static int STATUS_READY = 10;
	final static int STATUS_EXECUTE = 11;
	final static int STATUS_DONE_SUCCESS = 12;
	final static int STATUS_DONE_FAIL = 13;
	final static int STATUS_EXCEPTION = 14;
	
	ArrayList<PermissionHandler> handlers = new ArrayList<PermissionHandler>();
	
	String projectCode = "";
	String strategyCode = "";
	String templateCode = "";
	
	
	int result = -1;
	int status  = 0;
	int type = 0;
	int id = 0;
	String code = "";
	TaskCallBack callback = null;
	
	public void BPMTask(TaskCallBack callback){
		this.callback = callback;
		status = STATUS_READY;
	}
	public boolean checkPermission(String code){
		
	}
	
	public void execute(){
		Runnable r = new Runnable(){

			@Override
			public void run() {
				status = STATUS_EXECUTE;
				// TODO Auto-generated method stub
				result = callback.execute();
				
				status = STATUS_DONE_SUCCESS;
				
			}
			
		};
		
		Thread t = new Thread(r);
		t.start();
		
	}
	public int getResult(){
		return result;
	}
	
}
