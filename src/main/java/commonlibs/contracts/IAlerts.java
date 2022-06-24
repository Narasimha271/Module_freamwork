package commonlibs.contracts;

public interface IAlerts {

	public void acceptAlert() throws Exception;
	
	public void rejectAlert() throws Exception;
	public String getmessagefromAlert() throws Exception;
	public boolean checkAlertpresent(int timeoutinSeconds) throws Exception;
}
