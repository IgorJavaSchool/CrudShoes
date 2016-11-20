<%--
  Created by IntelliJ IDEA.
  User: MM
  Date: 20.11.2016
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
  <title>Shoes Page</title>

  <style type="text/css">
    .tg {
      border-collapse: collapse;
      border-spacing: 0;
      border-color: #ccc;
    }

    .tg td {
      font-family: Arial, sans-serif;
      font-size: 14px;
      padding: 10px 5px;
      border-style: solid;
      border-width: 1px;
      overflow: hidden;
      word-break: normal;
      border-color: #ccc;
      color: #333;
      background-color: #fff;
    }

    .tg th {
      font-family: Arial, sans-serif;
      font-size: 14px;
      font-weight: normal;
      padding: 10px 5px;
      border-style: solid;
      border-width: 1px;
      overflow: hidden;
      word-break: normal;
      border-color: #ccc;
      color: #333;
      background-color: #f0f0f0;
    }

    .tg .tg-4eph {
      background-color: #f9f9f9
    }
  </style>
</head>
<body>
<a href="../../index.jsp">Back to main menu</a>

<br/>
<br/>

<h1>Shoes List</h1>

<c:if test="${!empty listShoes}">
  <table class="tg">
    <tr>
      <th width="80">ID</th>
      <th width="120">Article</th>
      <th width="120">Type</th>
      <th width="120">Model</th>
      <th width="120">Price</th>
      <th width="60">Edit</th>
      <th width="60">Delete</th>
    </tr>
    <c:forEach items="${listShoes}" var="shoes">
      <tr>
        <td>${shoes.id}</td>
        <td><a href="/shoesData/${shoes.id}" target="_blank">${shoes.shoesArt}</a></td>
        <td>${shoes.shoesType}</td>
        <td>${shoes.shoesModel}</td>
        <td>${shoes.price/100}${shoes.price%100}</td>
        <td><a href="<c:url value='/edit/${shoes.id}'/>">Edit</a></td>
        <td><a href="<c:url value='/remove/${shoes.id}'/>">Delete</a></td>
      </tr>
    </c:forEach>
  </table>
</c:if>


<h1>Add a Shoes</h1>

<c:url var="addAction" value="/shoes/add"/>

<form:form action="${addAction}" commandName="shoes">
  <table>
    <c:if test="${!empty shoes.shoesArt}">
      <tr>
        <td>
          <form:label path="id">
            <spring:message text="ID"/>
          </form:label>
        </td>
        <td>
          <form:input path="id" readonly="true" size="8" disabled="true"/>
          <form:hidden path="id"/>
        </td>
      </tr>
    </c:if>
    <tr>
      <td>
        <form:label path="shoesArt">
          <spring:message text="Article"/>
        </form:label>
      </td>
      <td>
        <form:input path="shoesArt"/>
      </td>
    </tr>
    <tr>
      <td>
        <form:label path="shoesType">
          <spring:message text="Type"/>
        </form:label>
      </td>
      <td>
        <form:input path="shoesType"/>
      </td>
    </tr>    <tr>
      <td>
        <form:label path="shoesModel">
          <spring:message text="Model"/>
        </form:label>
      </td>
      <td>
        <form:input path="shoesModel"/>
      </td>
    </tr>
    <tr>
      <td>
        <form:label path="price">
          <spring:message text="Price"/>
        </form:label>
      </td>
      <td>
        <form:input path="price"/>
      </td>
    </tr>
    <tr>
      <td colspan="2">
        <c:if test="${!empty shoes.shoesArt}">
          <input type="submit"
                 value="<spring:message text="Edit Shoes"/>"/>
        </c:if>
        <c:if test="${empty shoes.shoesType}">
          <input type="submit"
                 value="<spring:message text="Add Shoes"/>"/>
        </c:if>
      </td>
    </tr>
  </table>
</form:form>
</body>
</html>
