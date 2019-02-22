package wyf.zrk;

import java.util.*;

public class ConsumerBack {
	private String cbid;          /*客户退货ID*/
	private String cid;           /*退货客户ID*/
	private String eid;           /*销售ID*/
	private Date cbdate;          /*退货时间*/
	public ConsumerBack(){}
	/**
	 * 构造方法
	 */
	public ConsumerBack(String cbid,String cid,String eid,Date cbdate){
		this.cbid = cbid;
		this.cid = cid;
		this.eid = eid;
		this.cbdate = cbdate;
	}
	public String getCbid() {
		return cbid;
	}
	public void setCbid(String cbid) {
		this.cbid = cbid;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public Date getCbdate() {
		return cbdate;
	}
	public void setCbdate(Date cbdate) {
		this.cbdate = cbdate;
	}
}
