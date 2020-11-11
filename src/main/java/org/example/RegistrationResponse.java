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

@WebServlet("/registrationresponse")
public class RegistrationResponse extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("hello.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ContactDao contactDao = new ContactDao();
        List<Contact> contact = contactDao.contacts;

        for(Contact contact1 : contact){
            req.setAttribute("contact", contact1);
        }
        req.getRequestDispatcher("hello.jsp").forward(req,resp);
    }
}
