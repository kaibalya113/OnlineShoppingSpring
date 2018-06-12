
<h1 class="my-4">Items Name</h1>

<div class="list-group">

	<c:forEach items="${catagories}" var="catagory">

		<a href="${contextRoot}/show/catagory/${catagory.id}/products" class="list-group-item">${catagory.name}</a>
	</c:forEach>
</div>