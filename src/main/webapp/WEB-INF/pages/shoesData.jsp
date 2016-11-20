<%--
  Created by IntelliJ IDEA.
  User: MM
  Date: 20.11.2016
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>ShoesData</title>

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
<h1>Shoes Details</h1>

<table class="tg">
  <tr>
    <th width="80">ID</th>
    <th width="120">Article</th>
    <th width="120">Type</th>
    <th width="120">Model</th>
    <th width="120">Price</th>
  </tr>
  <tr>
    <td>${shoes.id}</td>
    <td>${shoes.shoesArt}</td>
    <td>${shoes.shoesType}</td>
    <td>${shoes.shoesModel}</td>
    <td>${shoes.price/100}${shoes.price%100}</td>
  </tr>
</table>
</body>
</html>
