package wyf.zrk;

public class GoodsClassInfo {
	private String gcid;				/*��Ʒ���ID*/
	private String gcname;				/*��Ʒ����*/
	
	public GoodsClassInfo(){}
	/**
	 * ���췽��
	 */
	public GoodsClassInfo(String gcid,String gcname){
		this.gcid = gcid;
		this.gcname = gcname;
	}
	public String getGcid() {
		return gcid;
	}
	public void setGcid(String gcid) {
		this.gcid = gcid;
	}
	public String getGcname() {
		return gcname;
	}
	public void setGcname(String gcname) {
		this.gcname = gcname;
	}
}
