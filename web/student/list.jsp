<%@ page import="java.util.List" %>
<%@ page import="com.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: ccc
  Date: 2017/9/21
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
   .t{
       border-collapse: collapse;
       width: 100%;
   }
    .t th,.t td{
        border: 1px solid#ccc;
        text-align: center;
        padding: 10px;
    }

</style>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>第二学期学生成绩</h1>
 <fieldset style="width: 90%">
  <table class="t">
      <tr>
          <th>编号</th>
          <th>姓名</th>
          <th>性别</th>
          <th>年龄</th>
          <th>生日</th>
      </tr>
      <%
          List<Student> stulist = (List<Student>)request.getAttribute("stuList");
          for (Student s:stulist) {
      %>
      <tr>
          <%--<td><%=s.getStuId()%></td>--%>
          <td><%=s.getStuName()%></td>
          <td><%=s.getStuSex()%></td>
          <td><%=s.getStuAge()%></td>
          <td><%=s.getStiuBirth()%></td>
      </tr>
      <%
          }
      %>

  </table>



 </fieldset>
</body>
</html>
