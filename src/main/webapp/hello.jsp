<%@ page import="org.example.domain.Contact" %>

<% Contact contact = (Contact) request.getAttribute("contact"); %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p>Hello <%=contact.getName()%>, thank you for joining us with your email: <%=contact.getEmail()%></p>

</body>
</html>
