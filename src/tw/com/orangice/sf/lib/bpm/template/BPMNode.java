package tw.com.orangice.sf.lib.bpm.template;

import java.util.ArrayList;

import tw.com.orangice.sf.lib.bpm.model.PermissionHandler;

public class BPMNode {
	
	String code = "";//template code
	int status = -1;
	int type = -1;
	String label = "";
	String description = "";
	
	ArrayList<PermissionHandler> handlers = new ArrayList<PermissionHandler>();
	
	ArrayList<BPMNode> next = new ArrayList<BPMNode>();
	ArrayList<BPMNode> previous = new ArrayList<BPMNode>();
}
