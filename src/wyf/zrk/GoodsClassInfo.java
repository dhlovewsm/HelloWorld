package wyf.zrk;

public class GoodsClassInfo {
	private String gcid;				/*商品类别ID*/
	private String gcname;				/*商品名称*/
	
	public GoodsClassInfo(){}
	/**
	 * 构造方法
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
