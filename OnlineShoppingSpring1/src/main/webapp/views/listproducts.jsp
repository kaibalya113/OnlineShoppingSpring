<div class="container">

	<div class="row">
		<!-- to display side bar  -->
		<div class="col-md-3">
		
			<%@include file="./shared/sidebar.jsp" %>
		
		</div>
	
	<!-- display the products -->
	
		<div class="col-md-9">
			<!-- Added breadcrumb -->
			<!-- example::   Home/Products/Laptop -->
			<div class="row">
			
				<div class ="col-lg-12">
					<c:if test = "${userclickallproducts == true}">
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home /</a></li>
						
						<li class="active"> All Products</li>
					
					
					</ol>
					</c:if>
					
					
					<c:if test = "${userclickcatagoryproducts == true}">
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home /</a></li>
						
						<li class="active">  Catagory</li>
						<li class="active"> / ${catagory.name}</li>
					
					
					</ol>
					</c:if>
				</div>
			
			</div>
		
		
		</div>
	
	
	</div>

</div>