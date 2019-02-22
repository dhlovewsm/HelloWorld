package wyf.zrk;

import java.util.*;

public class StockInfo {
	private String sid;					/*采购ID*/
	private String pid;					/*供应商ID*/
	private Date sdate;					/*采购时间*/
	private double stotalprice;			/*总价*/
	private String sbuyer;				/*采购人*/
	public StockInfo(){}
	/**
	 * 构造方法
	 */
	public StockInfo(String sid,String pid,Date sdate,double stotalprice,String sbuyer){
		this.sid = sid;
		this.pid = pid;
		this.sdate = sdate;
		this.stotalprice = stotalprice;
		this.sbuyer = sbuyer;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public double getStotalprice() {
		return stotalprice;
	}
	public void setStotalprice(double stotalprice) {
		this.stotalprice = stotalprice;
	}
	public String getSbuyer() {
		return sbuyer;
	}
	public void setSbuyer(String sbuyer) {
		this.sbuyer = sbuyer;
	}
}
