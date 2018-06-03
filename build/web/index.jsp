<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Form</title>
</head>
<body>
    <form action="Hello" method="post">
        <b style="color: deeppink;">Name : </b>
        <input type="text" name="name"  style="color: chocolate;"/>
        <input type="submit" value="Go" style="color: orangered; border-radius: 8px;"/>      

    </form>
    <br/>
    <form action="Calculate" method="get">
        <b style="color: violet;">Number 1 : </b>
        <input type="number" name="num1"  style="color: violet;"/>
        <br/>
        <b style="color: violet;">Number 2 : </b>
        <input type="number" name="num2"  style="color: violet"/>
        
        <input type="submit" value="Go" style="color: orangered; border-radius: 8px;"/>                         
    </form>
</body>
</html>
