package org.example;

import org.example.domain.Contact;
import org.example.domain.ContactDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/register")
public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ContactDao contactDao = new ContactDao();

        String name = req.getParameter("name");
        String lastname = req.getParameter("lastname");
        String email = req.getParameter("email");

        Contact contact = new Contact(name, lastname, email);
        contactDao.add(contact);

        req.setAttribute("contact", contact);
        req.getRequestDispatcher("/registrationresponse").forward(req,resp);
    }
}
