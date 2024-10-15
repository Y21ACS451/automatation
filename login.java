
public class login {
public static void main(String args[]) {
	JspWriter pw=pageContext.getout();
	String name="srikanth";
	String pass="8124";
	String Name=req.getParameter("a");
	String password=req.getParameter("b");
	if(name.equals(Name) && pass.equals(password))
	{
		pw.println("Login Successfully...");
	}
	else{
		pw.println("Invalid username or password");
		pw.println("<a href='index.jsp'>Home page</a>");
	}
}
}