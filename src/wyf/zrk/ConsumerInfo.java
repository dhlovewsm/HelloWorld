package wyf.zrk;

public class ConsumerInfo {
	private String cid;                 /*客户ID*/
	private String cname;				/*客户姓名*/
	private String clinkman;			/*联系人*/
	private String caddress;			/*公司地址*/
	private String ctel;				/*电话*/
	private String cemail;				/*E-mail*/
	private String cremark;				/*备注*/
	
	public ConsumerInfo(){}
	/**
	 * 构造方法
	 */
	public ConsumerInfo(String cid,String cname,String clinkman,
		String caddress,String ctel,String cemail,String cremark){
		this.cid = cid;
		this.cname = cname;
		this.clinkman = clinkman;
		this.caddress = caddress;
		this.ctel = ctel;
		this.cemail = cemail;
		this.cremark = cremark;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getClinkman() {
		return clinkman;
	}
	public void setClinkman(String clinkman) {
		this.clinkman = clinkman;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCtel() {
		return ctel;
	}
	public void setCtel(String ctel) {
		this.ctel = ctel;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCremark() {
		return cremark;
	}
	public void setCremark(String cremark) {
		this.cremark = cremark;
	}
}
