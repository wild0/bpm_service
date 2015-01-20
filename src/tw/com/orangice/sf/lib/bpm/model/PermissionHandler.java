package tw.com.orangice.sf.lib.bpm.model;

public class PermissionHandler {
	int roleType = -1;
	String roleCode = "";
	int status = -1;
	int action = -1;
	String label = "";
	
	final static int ACTION_EXECUTE = 10;
	final static int ACTION_VIEW = 11;
	final static int ACTION_MODIFY = 11;
}
