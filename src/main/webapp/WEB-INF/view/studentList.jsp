<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
      request.getServerPort() + request.getContextPath() + "/";
%>

<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">

        $(function () {

            $.ajax({
                url:"student/selectList.do",
                type:"post",
                dataType:"json",
                success:function (res) {
                    $("#tbody").append("")
                    var str ="";
                    $.each(res,function (i,n) {
                        var a = i+1;
                        str +='<tr id="'+n.id+'"  >';
                        str +='<th>'+a+'</th>';
                        str +='<th>'+n.name+'</th>';
                        str +='<th>'+n.age+'</th>';
                        str +='<th><button  onclick="remove(\''+n.id+'\')" >删除</button></th>';
                        str +='<th><button  id=>修改</button></th>';
                        str +='/tr>'
                    })

                    $("#tbody").append(str)
                }

            })


        })
        function remove(id) {
            if (window.confirm("你确定要删除吗？")) {
                alert(111)
                $.ajax({
                    url:"student/deleteStudentById.do",
                    data:{
                        id:id
                    },
                    type:"post",
                    dataType:"json",
                    success:function (res) {
                        alert(res)
                        $("#"+id).remove();
                    }
                })
            }

        }

    </script>
</head>
<body>
    <h1>欢迎${student.name}登录成功</h1>
    <div align="center">

        <table border="1dx">
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>年龄</th>
                <th colspan="2">操作</th>
            </tr>
            <tbody id="tbody">


            </tbody>

        </table>

    </div>

</body>
</html>
