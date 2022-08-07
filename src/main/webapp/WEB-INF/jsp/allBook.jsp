<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Peggy
  Date: 2022/8/7
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        <%--按钮样式--%>
        .green {
            background-color: #4CAF50; /* 绿色 */
            border: none;
            color: white;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 15px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 12px;
        }
        .read {
            background-color: #f44336; /* 红色 */
            border: none;
            color: white;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 15px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 12px;
        }
    </style>
</head>
<body>
    <center>
        <h1>获取所有的图书</h1></br>
        <table bgcolor="#ffe4c4"  border="2" >
        <tr>
            <th>书籍编号</th>
            <th>书籍名</th>
            <th>数据数量</th>
            <th>用户描述</th>
        </tr>
        <c:forEach var="book" items="${list}">
            <tr>
                <td>${book.getBookID()}</td>
                <td>${book.getBookName()}</td>
                <td>${book.getBookCounts()}</td>
                <td>${book.getDetail()}</td>
            </tr>
        </c:forEach>
    </table>
    </center>
</body>
</br></br>
<center>
        <table>
            <tr>
                <th>
                    <a class="green" href="${pageContext.request.contextPath}/book/toAddBook">添加书籍</a>
                </th>
                <th>
                    <input type="button" value="删除书籍" name="delBook" class="read"/>
                </th>
            </tr>
        </table>
    </center>
</html>
