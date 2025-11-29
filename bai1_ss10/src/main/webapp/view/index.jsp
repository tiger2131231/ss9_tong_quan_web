<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Danh sách khách hàng</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e3efff;
        }
        h1 {
            text-align: center;
            margin-top: 20px;
            font-size: 32px;
            color: #000;
        }
        table {
            width: 90%;
            margin: 30px auto;
            border-collapse: collapse;
            background: #fff;
            border-radius: 12px;
            overflow: hidden;
            box-shadow: 0 0 12px rgba(0,0,0,0.2);
        }
        th, td {
            padding: 14px;
            text-align: left;
            border-bottom: 1px solid #ddd;
            font-size: 18px;
        }
        th {
            background-color: #fff;
            font-weight: bold;
            font-size: 20px;
        }
        tr:hover {
            background-color: #f1f8ff;
        }
        img {
            width: 90px;
            height: 70px;
            object-fit: cover;
            border-radius: 6px;
        }
    </style>
</head>

<body>

<h1>Danh sách khách hàng</h1>

<table>
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>

    <c:forEach var="c" items="${customers}">
        <tr>
            <td>${c.name}</td>
            <td>${c.birthday}</td>
            <td>${c.address}</td>
            <td>
                <img src="${c.image}" alt="avatar">
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
