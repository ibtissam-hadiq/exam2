<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Affecter Employé</title>
</head>
<body>
<h1>Employe Affectation</h1>
<form action="${pageContext.request.contextPath}/manager/affecter" method="post">
    <label for="employe">Employé:</label>
    <select name="employeId" id="employe">
        <c:forEach var="employe" items="${employes}">
            <option value="${employe.id}">${employe.name}</option>
        </c:forEach>
    </select>
    <label for="projet">Projet:</label>
    <select name="projetId" id="projet">
        <c:forEach var="projet" items="${projets}">
            <option value="${projet.id}">${projet.name}</option>
        </c:forEach>
    </select>
    <button type="submit">Affecter</button>
</form>
</body>
</html>

