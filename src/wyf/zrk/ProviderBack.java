package wyf.zrk;

import java.util.*;

public class ProviderBack {
	private String pbid;				/*�˻�ID*/
	private String pid;					/*��Ӧ��ID*/	
	private String sid;					/*�ɹ�ID*/
	private Date pbdate;				/*�˻�ʱ��*/
	public ProviderBack(){}
	/**
	 * ���췽��
	 */
	public ProviderBack(String pbid,String pid,String sid,Date pbdate){
		this.pbid = pbid;
		this.pid = pid;
		this.sid = sid;
		this.pbdate = pbdate;
	}
	public String getPbid() {
		return pbid;
	}
	public void setPbid(String pbid) {
		this.pbid = pbid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public Date getPbdate() {
		return pbdate;
	}
	public void setPbdate(Date pbdate) {
		this.pbdate = pbdate;
	}
}
