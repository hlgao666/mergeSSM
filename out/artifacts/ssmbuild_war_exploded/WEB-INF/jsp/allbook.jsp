<%--
  Created by IntelliJ IDEA.
  User: Allen
  Date: 2020/12/2
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small><center>书籍列表 —— 显示所有书籍</center></small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/addBook">新增</a>
        </div>
        <div class="col-md-4 column"></div>
        <div class="col-md-8 column">
            <form action="${pageContext.request.contextPath}/book/queryBook" method="post" style="float: right">
                <input type="text" name="bookName" class="from-control" placeholder="请输入要查询的书籍名称">
                <input type="submit" value="查询" class="btn btn-primary">
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>书籍编号</th>
                        <th>书籍名字</th>
                        <th>书籍数量</th>
                        <th>书籍详情</th>
                        <th>操作</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach var="book" items="${requestScope.get('list')}">
                        <tr>
                            <td>${book.getBookId()}</td>
                            <td>${book.getBookName()}</td>
                            <td>${book.getBookCounts()}</td>
                            <td>${book.getDetail()}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/book/updateBook?id=${book.bookId}">更改</a>
                                &nbsp;| &nbsp;
                                <a href="${pageContext.request.contextPath}/book/deleteBook?id=${book.bookId}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>

            </table>
        </div>
    </div>
</div>
</body>
</html>
