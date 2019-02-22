package wyf.zrk;

public class ProviderBackDetail {
	private String pbdid;					/*退货明细ID*/
	private String pbid;					/*退货表ID*/
	private String gid;						/*商品ID*/
	private int pbdamount;					/*商品数量*/
	private double pbdprice;				/*商品单价*/
	private double pbdtotalprice;			/*总价*/
	public ProviderBackDetail(){}
	/**
	 * 构造方法
	 */
	public ProviderBackDetail(String pbdid,String pbid,String gid,int pbdamount,double pbdprice,double pbdtotalprice){
		this.pbdid = pbdid;
		this.pbid = pbid;
		this.gid = gid;
		this.pbdamount = pbdamount;
		this.pbdprice = pbdprice;
		this.pbdtotalprice = pbdtotalprice;
	}
	public String getPbdid() {
		return pbdid;
	}
	public void setPbdid(String pbdid) {
		this.pbdid = pbdid;
	}
	public String getPbid() {
		return pbid;
	}
	public void setPbid(String pbid) {
		this.pbid = pbid;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public int getPbdamount() {
		return pbdamount;
	}
	public void setPbdamount(int pbdamount) {
		this.pbdamount = pbdamount;
	}
	public double getPbdprice() {
		return pbdprice;
	}
	public void setPbdprice(double pbdprice) {
		this.pbdprice = pbdprice;
	}
	public double getPbdtotalprice() {
		return pbdtotalprice;
	}
	public void setPbdtotalprice(double pbdtotalprice) {
		this.pbdtotalprice = pbdtotalprice;
	}
}
