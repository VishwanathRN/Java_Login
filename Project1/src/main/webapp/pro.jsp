<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>User Login</title>
 <link rel="icon" href="img_avatar2.png"type="image/x-icon">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="procss.css" type="text/css">
</head>
<body>

<form action="ServletPro" method="post">
  <h2>Login Form(id:demouserid pass:demo@123)</h2> 
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>
 

  <div class="container">
    <label for="uname"><b>User name</b></label>
    <input type="text" placeholder="Enter Username" name="usrname" >

    <label for="psw"><b>Password</b></label>
    <input type="text"  placeholder="Enter Password" name="password" >
        
    <button type="submit">Login</button>
   
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="pro.jsp">password?</a></span>
  </div>
</form>

</body>
</html>
