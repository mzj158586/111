
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
 <form action="student/login.do" method="post">
     <table border="1dx">
         <tr>
             <th>姓名</th>
             <th><input type="text" name="name" ></th>
         </tr>
         <tr>
             <th>密码</th>
             <th><input type="password" name="password" ></th>
         </tr>

         <tr>
             <th colspan="2"><input type="submit" value="登录"></th>
         </tr>

     </table>


 </form>

</body>
</html>
