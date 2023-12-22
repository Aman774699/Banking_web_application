/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class Home extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Bank Portal</title>");
        out.println("<style>");
        out.println("body {");
        out.println("    font-family: Arial, sans-serif;");
        out.println("    background-color: #f0f0f0;");
        out.println("}");
        out.println(".container {");
        out.println("    width: 400px;");
        out.println("    margin: 0 auto;");
        out.println("    background-color: #fff;");
        out.println("    padding: 20px;");
        out.println("    border-radius: 5px;");
        out.println("    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);");
        out.println("}");
        out.println(".info {");
        out.println("    text-align: center;");
        out.println("    margin-bottom: 20px;");
        out.println("}");
        out.println("button {");
        out.println("    display: block;");
        out.println("    width: 100%;");
        out.println("    padding: 10px;");
        out.println("    margin-bottom: 10px;");
        out.println("    background-color: #007bff;");
        out.println("    color: #fff;");
        out.println("    border: none;");
        out.println("    border-radius: 5px;");
        out.println("    cursor: pointer;");
        out.println("}");
        out.println("button:hover {");
        out.println("    background-color: #0056b3;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"container\">");
        out.println("<div class=\"info\">");
        out.println("<h1>Bank Portal</h1>");
        out.println("<p>Account Owner: John Doe</p>");
        out.println("<p>Account Number: 1234567890</p>");
        out.println("<p>Balance: $10,000</p>");
        out.println("</div>");
        out.println("<button>Send Money</button>");
        out.println("<button>Apply for Loan</button>");
        out.println("<button>Receive Money</button>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
