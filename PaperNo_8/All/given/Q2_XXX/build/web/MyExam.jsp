<%-- 
    Document   : MyExam.jsp
    Created on : 3 thg 11, 2024, 11:26:49
    Author     : lam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="execute" method="get">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Enter a string(str):</td>
                        <td><input type="text" name="str" value="${name}"></td>
                    </tr>
                    <tr>
                        <td>Choose an option:</td>
                                <td><select name="opt">
                                        <option value="Consonant characters">Consonant characters</option>
                                         <option value="Length of string">Length of string</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Result:</td>
                        <td><input type="text" name="result" value="${result}"></td>
                    </tr>
                     <tr>
                        <td><input type="submit" value="EXECUTE"></td>
                        <td>${msg}</td>
                    </tr>
                </tbody>
            </table>
            
            <table border="1">
                <thead>
                    <tr style="text-align: center">
                        <th>String str</th>
                        <th>Option</th>
                        <th> Result</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${li}" var="l">
                    <tr>
                        <td>${l.str}</td>
                        <td>${l.opt}</td>
                        <td>${l.result}</td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>

        </form>
    </body>
</html>
