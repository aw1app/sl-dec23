

<br>
<br>
Add a user:
<br>
<form action="add-user-with-degrees-simplified" method="POST">
	<br> User Name: <input name="name"> 
	<br> Aadhar No: <input name="aadharCard.number"> 
	
	<br>Mobiles:
	<br> Mobile No 1: <input name="phones[0].number">
	<br> Mobile No 2: <input name="phones[1].number"> <br>
	<br>
	
	<br>Degrees:<br>
	<br>Edu Degree No 1: <input name="degrees[0].name">
    <br>Edu Degree No 2: <input name="degrees[1].name">
	
	<input type=submit value="Add User">
</form>