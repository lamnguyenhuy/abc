<%-- 
    Document   : view
    Created on : 3 thg 11, 2024, 12:09:19
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

        <form action="search" >
            
            <table border="0">

                <tbody>
                    <tr>
                        <td>Choose an option</td>
                                <td><select name="opt">
                                        <option value="-1">All type</option>
                                        <c:forEach items="${li}" var="a">
                                            <option value="${a.id}">${a.name}</option>
                                        </c:forEach>
                            </select>
                            
                        </td>
                        <td><input type="submit" value="Filter"></td>
                    </tr>
                    <tr>
                        <td>Enter a string</td>
                        <td><input type="text" name="str"</td>
                        <td><input type="submit" value="SEARCH"></td>
                    </tr>
                </tbody>
            </table>

        </form>
        <br><!-- comment -->
        Result of Filter/Search:
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>String str</th>
                    <th> Option</th>
                    <th>Result</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
