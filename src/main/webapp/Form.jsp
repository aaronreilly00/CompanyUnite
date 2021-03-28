<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="include/header.jsp">
	<c:param name="title" value="Home" />
</c:import>
<div class="container mtb">
	<div class="row">
		<div class="col-lg-6">
			<form action="<%=request.getContextPath()%>/Controller" method="get">
				Full name:<input type="text" name="name" required /><br /> Gender: <input
					type="radio" name="gender" value="male" checked="checked">
				Male <input type="radio" name="gender" value="female">
				Female <br /> Languages Know: <input type="checkbox" name="language"
					value="English"> English <input type="checkbox"
					name="language" value="Hindi"> Hindi <input type="checkbox"
					name="language" value="French"> French <br /> Country: <select
					name="country">
					<option value="India">India</option>
					<option value="USA">USA</option>
					<option value="UK">UK</option>
					<option value="Finland">Finland</option>
					<option value="Fiji">Fiji</option>
				</select><br /> <input type="submit" value="Submit">
			</form>
		</div>
	</div>
</div>
<c:import url="include/footer.jsp" />