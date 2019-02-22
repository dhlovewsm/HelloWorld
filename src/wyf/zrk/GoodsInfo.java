package wyf.zrk;

public class GoodsInfo {
	private String gid;						/*商品ID*/
	private String gname;					/*商品名称*/	
	private String gcid;					/*商品类别ID*/
	private String gunit;					/*单位*/
	private double gpin;					/*进价*/
	private double gpout;					/*售价*/
	private int gamount;					/*库存*/
	public GoodsInfo(){}
	/**
	 * 构造方法
	 */
	public GoodsInfo(String gid,String gname,String gcid,
		String gunit,double gpin,double gpout,int gamount){
		this.gid = gid;
		this.gname = gname;
		this.gcid = gcid;
		this.gunit = gunit;
		this.gpin = gpin;
		this.gpout = gpout;
		this.gamount = gamount;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGcid() {
		return gcid;
	}
	public void setGcid(String gcid) {
		this.gcid = gcid;
	}
	public String getGunit() {
		return gunit;
	}
	public void setGunit(String gunit) {
		this.gunit = gunit;
	}
	public double getGpin() {
		return gpin;
	}
	public void setGpin(double gpin) {
		this.gpin = gpin;
	}
	public double getGpout() {
		return gpout;
	}
	public void setGpout(double gpout) {
		this.gpout = gpout;
	}
	public int getGamount() {
		return gamount;
	}
	public void setGamount(int gamount) {
		this.gamount = gamount;
	}
	public String toString(){
		return this.gname;
	}	
}
