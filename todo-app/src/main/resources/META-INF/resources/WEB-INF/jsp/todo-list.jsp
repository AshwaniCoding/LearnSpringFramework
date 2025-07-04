<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
    <p>Welcome! ${username}</p>
    <hr>
    <div><h1>Your Todos</h1></div>
    <table class="table">
        <thead>
            <tr>
                <th>Description</th>
                <th>Target Date</th>
                <th>Is Done?</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                    <td><a class="btn btn-warning" href="delete-todo?id=${todo.id}">Delete</a></td>
                    <td><a class="btn btn-success" href="update-todo?id=${todo.id}">Update</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a class="btn btn-success" href="add-todo">Add Todo</a>
</div>
<%@ include file="common/footer.jspf" %>