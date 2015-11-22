<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Product's List</h1>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
		</tr>

		<c:forEach items="${products}" var="p">

			<tr>

				<td>${p.id }</td>
				<td>${p.name }</td>
				<td>${p.price }</td>





			</tr>

		</c:forEach>




	</table>

</body>
</html>