<%@ page contentType="text/html;charset=gbk" 
	import="java.util.*,wyf.zrk.UserBean,wyf.zrk.ConsumerBack,
			wyf.zrk.ConsumerInfo,wyf.zrk.SellInfo,wyf.zrk.DButil,
			org.springframework.web.context.*,org.springframework.web.context.support.*"
%>
<% 
	List<ConsumerBack> list = (List<ConsumerBack>)request.getAttribute("goodslist");
		//��ȡWebApplicationContext
		WebApplicationContext wac=
		   WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		DButil db = (DButil)wac.getBean("DButil");
 %>
<html>
  <head>
    <title>�ͻ��˻�����</title>
	<link rel=stylesheet href="css/general.css" type="text/css">
    <script language="JavaScript" src="script/trim.js"></script>
    <script language="JavaScript">
      function check(){
      	var key = document.all.key.value.trim();
      	if(key==""){
			alert("�ؼ���Ϊ��,����������!!!");
			return;
      	}
      	document.all.smf.submit();
      }
      function checkPage(temp){
      	var page = document.all.page.value.trim();
  		var reg = /^[1-9][0-9]*$/;
		if((reg.test(page.trim()))&&(page<=temp)){
			document.all.mf.submit();
		}
		else{
			alert("���벻�Ϸ�,����������!!!");
			return;
		}
      }
    </script>    
  </head>
  <body bgcolor="#EBF5FD">
  	<jsp:useBean id="userBean" class="wyf.zrk.UserBean" scope="session"/>
	<table width="100%" height="44" bgcolor="#206AB3">
      <tr align="center"><td><font color="#FFFFFF" size="5">�ͻ��˻�����</font></td></tr>
	</table>
	<table>
	<form action="ManageServlet" method="post" id="smf">
	  <tr>	    
		<td>
		<table height="42" style="background:url(img/add_sear.jpg) no-repeat">
		  <tr>
		    <td>
		      &nbsp;<img src="img/log.gif" border="0" style="cursor:hand" onclick="document.all.key.focus()"/>
		    </td>
		    <td>
		      <input name="key" id="key" value="������Ҫ�����ı�����" style="border:0"
		      		 size="28"	onfocus="document.all.key.value=''"/>		    
		    </td>
		    <td width="85" align="right">
		    <img src="img/sear.jpg" id="mg" border="0"
		      style="cursor:hand"
		      onclick="JavaScript:check()"
		      onmousedown="document.all.mg.src='img/sear1.jpg'"
		      onmouseup="document.all.mg.src='img/sear.jpg'"/>
		    </td>
	    	<td width="90" align="center"><a href="addconsumerback.jsp" target="mainFrame"><font color="white" size="2">�����˻�</font></a></td>
		  </tr>
		</table>
	    </td>
	    <td>
	      <input type="hidden" name="action" value="search" />
	      <input type="hidden" name="type" value="consumerback"/>
	    </td>	   
	  </tr>
	</form>
	</table>
	<hr size="1" width="100%" color="black"/>
  
	<% 
		if(list.isEmpty()){
			out.println("<br/><br/><br/><center><h2>û����������Ҫ���˻���!!!</h2></center>");
		}
		else{
	 %>	
	<table width="100%" border="0" cellspacing="1" bgcolor="black">
	  <tr bgcolor="#D1F1FE" align="center">
	    <th>������</th>
	    <th>�ͻ�����</th>
	    <th>���۱���</th>
	  	<th>�˻�ʱ��</th>
	  	<th>�鿴</th>
	  	<th>�޸�</th>
	  	<th>ɾ��</th>
	  	<th>������ϸ</th>
	  </tr>
	  <% 
	  	int i = 0;
		for(ConsumerBack cb:list){
		ConsumerInfo ci = (ConsumerInfo)db.getObject("ConsumerInfo",cb.getCid());
		if(i%2==0){
			i++;
			out.println("<tr bgcolor='white' align='center'>");
		}
		else{
			i++;
			out.println("<tr bgcolor='#EBF5FD' align='center'>");
		}
	   %>
	     <td><%= cb.getCbid() %></td>
	     <td><%= new String(ci.getCname().getBytes("ISO-8859-1"),"gbk") %></td>
	     <td><%= cb.getEid() %></td>
	     <td><%= (cb.getCbdate().getYear()+1900)+"-"+
	     		(cb.getCbdate().getMonth()+1)+"-"+(cb.getCbdate().getDate()) %></td>
	     <td width="60"><a href="ManageServlet?action=lookConsumerBack&cbid=<%= cb.getCbid() %>&type=look" target="mainFrame"><img border="0" src="img/file.gif"/>�鿴</a></td>
	     <td width="60"><a href="ManageServlet?action=lookConsumerBack&cbid=<%= cb.getCbid() %>&type=modify" target="mainFrame"><img border="0" src="img/mod.gif" height="16" width="16"/>�޸�</a></td>
	     <td width="60"><a href="JavaScript:delete_sure('ManageServlet?action=deleteConsumerBack&cbid=<%= cb.getCbid() %>')" target="mainFrame"><img border="0" src="img/del.gif"/>ɾ��</a></td>
	     <td width="100"><a href="ManageServlet?action=lookConsumerBack&cbid=<%= cb.getCbid() %>&type=lookdetail" target="mainFrame"><img border="0" src="img/det.gif"/>������ϸ</a></td>
	  </tr>
	  <% 
	  	}
	   %>
	</table>  
 	<table width="100%">
	<form method="post" action="ManageServlet" id="mf">
	  <tr>
	    <td align="left">
	      <font size="2">��<%= userBean.getTotalPage() %>ҳ&nbsp;&nbsp;��ǰҳ:<%= userBean.getNowPage() %></font>
	    </td>
	    <td align="right">
	      <% 
	      	if(userBean.getNowPage()>1){
	       %>
	      <a href="ManageServlet?action=changePage&pagename=/consumerbackmanage.jsp&page=<%= userBean.getNowPage()-1 %>" target="mainFrame"><img src="img/prev.gif" border="0"/></a>
	      <% 
	      	}
	      	if(userBean.getNowPage()<userBean.getTotalPage()){
	       %>	       
	      <a href="ManageServlet?action=changePage&pagename=/consumerbackmanage.jsp&page=<%= userBean.getNowPage()+1 %>" target="mainFrame"><img src="img/next.gif" border="0"/></a>
	      <% 
	      	}
	      	else{
	      		out.println("<img src='img/next.gif' style='visibility:hidden'/>");
	      	}
	       %>
	      <font size="2">��<input name="page" id="page" size="2" value="<%= userBean.getNowPage() %>" onfocus="document.all.page.value=''"/>ҳ</font>
	      <input type="hidden" name="action" value="changePage" />
	      <input type="hidden" name="pagename" value="/consumerbackmanage.jsp"/>
	    </td>
	    <td width="10">
	      <img src="img/go.gif" border="0" style="cursor:hand" onclick="JavaScript:checkPage(<%= userBean.getTotalPage() %>)">
	    </td>
	  </tr>	
	</form>
	</table>
  	<% 
  		}
  	 %>
  </body>
</html>