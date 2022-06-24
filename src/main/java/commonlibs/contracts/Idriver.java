package commonlibs.contracts;

public interface Idriver {

	public void gotofirsturl(String url) throws Exception;
	public String gettitile() throws Exception;
	public String getcurrenturl() throws Exception;
	public String getpagesource() throws Exception;
	public void gotourl(String url) throws Exception;
	public void goforward() throws Exception;
	public void goback() throws Exception;
	public void refresh() throws Exception;
	public void closebrowser() throws Exception;
	public void closeallbrowsers() throws Exception;
	
	
}
