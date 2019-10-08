<%--
  Created by IntelliJ IDEA.
  User: vv
  Date: 2019/9/21
  Time: 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
传入User对象
<form action="user/param1" method="post">
    姓名<input type="text" name="name"/><br/>
    年龄<input type="text" name="age"/><br/>
    出生日期<input type="text" name="brith"/><br/>
<input type="submit" value="提交"/>
</form>

把数据封装到account类中
<form action="user/param2" method="post">
    昵称<input type="text" name="name" /><br/>
    用户姓名<input type="text" name="user.name" /><br/>
    用户年龄<input type="text" name="user.age" /><br/>
    用户生日<input type="text" name="user.brith" /><br/>
    <input type="submit" value="提交">
</form>

把数据封装到account类中
<form action="user/param3" method="post">
    队伍ID<input type="text" name="name" /><br/>
    用户1姓名<input type="text" name="list[0].name" /><br/>
    用户1年龄<input type="text" name="list[0].age" /><br/>
    用户1生日<input type="text" name="list[0].brith" /><br/>
    用户2姓名<input type="text" name="list[1].name" /><br/>
    用户2年龄<input type="text" name="list[1].age" /><br/>
    用户2生日<input type="text" name="list[1].brith" /><br/>
    map1<input type="text" name="map['1']" /><br/>
    map2<input type="text" name="map['2']" /><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
