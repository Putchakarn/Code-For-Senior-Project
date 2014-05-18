
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link rel="stylesheet" href="css/style.css" type="text/css">

<style type="text/css">
body {
	background-image: url(images/bg-pattern.jpg);
	background-repeat: repeat;
	background-color: #FFC;
	text-align: center;
}
#tableShowData table .selected td {
	font-family: Trebuchet MS, Arial, Helvetica, sans-serif;
	font-size: 18px;
}
</style>
</head>

<body>
<div class="header">
	
<table width="80%" height="735" border="0" align="center">
  <tr>
    <td height="152"><table width="100%" height="149" border="0">
      <tr>
        <td width="21%" height="145"><img src="images/logo.png" width="120" height="113" align="right" /></td>
        <td width="79%"><blockquote>&nbsp;</blockquote></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table width="100%" height="633" border="0">
      <tr>
        <td width="860" height="54">
        
        
    
        <div class="navigation" id="navigation" align="right">
        	<form id="searchForm" name="form1" method="post" action="">
          <select name="cateagory" id="cateagory">
            <option selected="selected">Category</option>
            <option>Hospital</option>
            <option>Police Station</option>
            <option>Highway Police Station</option>
            <option>Garage</option>
          </select>
          <label for="province"></label>
            <select name="province" id="province">
              <option selected="selected">Province</option>
              <option>Chiangmai</option>
              <option>Bangkok</option>
              <option>Phuket</option>
            </select>
            <input type="submit" name="search" id="search" value="Search" />
            </form>
        
        </div></td>
        </tr>
        
        
       
      <tr>
        <td height="573"><div class="tableShowData" id="tableShowData" align="center">
          <table width="100%" border="2" align="center" bordercolor="#000000">
            
            <tr class="selected">
              <td width="16%"><div align="center"><strong>Name</strong></div></td>
              <td width="24%"><div align="center"><strong>Province</strong></div></td>
              <td width="42%"><div align="center"><strong>Category</strong></div></td>
              <td width="9%"><div align="center"><strong>Edit</strong></div></td>
              <td width="9%"><div align="center"><strong>Remove</strong></div></td>
            </tr>
            
            
            <!--/////////////วนลูป////////////////-->
              <c:forEach items="${helpPlaces}" var="helpPlace" varStatus="status">
            <tr>
              <td class="selected">cxdvzdvv</td>
              <td>${helpPlace.name}</td>
              <td>&nbsp;</td>
              <td><table width="51%" height="47" border="0" align="center">
                <tr>
                    <td><img src="images/pen_paper_2-512.png" width="39" height="41" align="middle" /></td>
                </tr>
            	</table>
                </td>
              		<td><table width="76%" height="55" border="0" align="center">
                <tr>
                    <td><img src="images/Editing-Delete-icon.png" alt="" width="48" height="47" /></td>
                  </tr>
              </table></td>
            </tr>
            </c:forEach>
            
            
            
          </table>
      </div>
          
          <p>&nbsp;</p>
          <table width="15%" height="120" border="1" align="center">
            <tr>
              <td><img src="images/logo.png" width="118" height="112" /></td>
            </tr>
          </table>
          <p>&nbsp;</p>
          <p>&nbsp;</p>
          <p>&nbsp;</p>
          <p>&nbsp;</p>
          <p>&nbsp;</p>
          <p>&nbsp;</p>
          <p>&nbsp;</p>
          <p>&nbsp;</p>
          <p>&nbsp;</p>
          <p>&nbsp;</p>
          <p>&nbsp;</p></td>
        </tr>
    </table></td>
  </tr>
</table>

</body>
</html>