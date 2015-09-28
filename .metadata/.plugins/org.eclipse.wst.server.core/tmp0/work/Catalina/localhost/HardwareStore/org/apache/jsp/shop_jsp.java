package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sapient.Item;
import java.util.List;
import com.sapient.DataAccessObject;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Shop Page- Ustora Demo</title>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Google Fonts -->\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("     \r\n");
      out.write("  \r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("function addCart(){\r\n");
      out.write("\tvar xmlHttp;\r\n");
      out.write("\ttry{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\txmlHttp=new XMLHttpRequest();\r\n");
      out.write("\t}\r\n");
      out.write("\tcatch(e){\r\n");
      out.write("\ttry{\r\n");
      out.write("\txmlHttp =new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n");
      out.write("\t}\r\n");
      out.write("\tcatch(e){\r\n");
      out.write("     try{\r\n");
      out.write("    \t \r\n");
      out.write("\txmlHttp =new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("     }catch(e){\r\n");
      out.write("    \t \r\n");
      out.write("    \r\n");
      out.write("\txmlHttp =new ActiveXObject(\"your browser does not support AJAX!\");\r\n");
      out.write("     }\r\n");
      out.write("     }\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("xmlHttp.onreadystatechange=function()\r\n");
      out.write("{\r\n");
      out.write("\tif(xmlHttp.readyState==4){\r\n");
      out.write("\t\t//document.getElementById(\"divHello\").innerHTML=xmlHttp.responseText;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("item=document.getElementsByName(\"name\");\r\n");
      out.write("xmlHttp.open(\"GET\",\"Cart.do?item=\"+item,true);\r\n");
      out.write("xmlHttp.send(null);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("    <div class=\"header-area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <div class=\"user-menu\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-user\"></i> My Account</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-heart\"></i> Wishlist</a></li>\r\n");
      out.write("                            <li><a href=\"cart.html\"><i class=\"fa fa-user\"></i> My Cart</a></li>\r\n");
      out.write("                            <li><a href=\"checkout.html\"><i class=\"fa fa-user\"></i> Checkout</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-user\"></i> Login</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"header-right\">\r\n");
      out.write("                        <ul class=\"list-unstyled list-inline\">\r\n");
      out.write("                            <li class=\"dropdown dropdown-small\">\r\n");
      out.write("                                <a data-toggle=\"dropdown\" data-hover=\"dropdown\" class=\"dropdown-toggle\" href=\"#\"><span class=\"key\">currency :</span><span class=\"value\">USD </span><b class=\"caret\"></b></a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li><a href=\"#\">USD</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">INR</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">GBP</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li class=\"dropdown dropdown-small\">\r\n");
      out.write("                                <a data-toggle=\"dropdown\" data-hover=\"dropdown\" class=\"dropdown-toggle\" href=\"#\"><span class=\"key\">language :</span><span class=\"value\">English </span><b class=\"caret\"></b></a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li><a href=\"#\">English</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">French</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">German</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End header area -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"site-branding-area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                    <div class=\"logo\">\r\n");
      out.write("                        <h1><a href=\"./\"><img src=\"img/logo.png\"></a></h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                    <div class=\"shopping-item\">\r\n");
      out.write("                        <a href=\"cart.html\">Cart - <span class=\"cart-amunt\">$100</span> <i class=\"fa fa-shopping-cart\"></i> <span class=\"product-count\">5</span></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End site branding area -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"mainmenu-area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div> \r\n");
      out.write("                <div class=\"navbar-collapse collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                        <li class=\"active\"><a href=\"shop.jsp\">Shop page</a></li>\r\n");
      out.write("                        <li><a href=\"single-product.jsp\">Single product</a></li>\r\n");
      out.write("                        <li><a href=\"cart.html\">Cart</a></li>\r\n");
      out.write("                        <li><a href=\"checkout.html\">Checkout</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Category</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Others</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>  \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End mainmenu area -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"product-big-title-area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"product-bit-title text-center\">\r\n");
      out.write("                        <h2>Shop</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"single-product-area\">\r\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("             <!--------------------------------- PRODUCTS ----------------------------------->\r\n");
      out.write("             ");
      com.sapient.DataAccessObject items = null;
      synchronized (request) {
        items = (com.sapient.DataAccessObject) _jspx_page_context.getAttribute("items", PageContext.REQUEST_SCOPE);
        if (items == null){
          items = new com.sapient.DataAccessObject();
          _jspx_page_context.setAttribute("items", items, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("            \t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <!----------------------------------------------------------------------------->\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <!-- <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"product-pagination text-center\">\r\n");
      out.write("                        <nav>\r\n");
      out.write("                          <ul class=\"pagination\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                              <a href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("                                <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("                              </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"#\">1</a></li>\r\n");
      out.write("                            <li><a href=\"#\">2</a></li>\r\n");
      out.write("                            <li><a href=\"#\">3</a></li>\r\n");
      out.write("                            <li><a href=\"#\">4</a></li>\r\n");
      out.write("                            <li><a href=\"#\">5</a></li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                              <a href=\"#\" aria-label=\"Next\">\r\n");
      out.write("                                <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("                              </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                          </ul>\r\n");
      out.write("                        </nav>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"footer-top-area\">\r\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-about-us\">\r\n");
      out.write("                        <h2>u<span>Stora</span></h2>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>\r\n");
      out.write("                        <div class=\"footer-social\">\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-youtube\"></i></a>\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-linkedin\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-menu\">\r\n");
      out.write("                        <h2 class=\"footer-wid-title\">User Navigation </h2>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"\">My account</a></li>\r\n");
      out.write("                            <li><a href=\"\">Order history</a></li>\r\n");
      out.write("                            <li><a href=\"\">Wishlist</a></li>\r\n");
      out.write("                            <li><a href=\"\">Vendor contact</a></li>\r\n");
      out.write("                            <li><a href=\"\">Front page</a></li>\r\n");
      out.write("                        </ul>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-menu\">\r\n");
      out.write("                        <h2 class=\"footer-wid-title\">Categories</h2>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"\">Mobile Phone</a></li>\r\n");
      out.write("                            <li><a href=\"\">Home accesseries</a></li>\r\n");
      out.write("                            <li><a href=\"\">LED TV</a></li>\r\n");
      out.write("                            <li><a href=\"\">Computer</a></li>\r\n");
      out.write("                            <li><a href=\"\">Gadets</a></li>\r\n");
      out.write("                        </ul>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-newsletter\">\r\n");
      out.write("                        <h2 class=\"footer-wid-title\">Newsletter</h2>\r\n");
      out.write("                        <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>\r\n");
      out.write("                        <div class=\"newsletter-form\">\r\n");
      out.write("                            <input type=\"email\" placeholder=\"Type your email\">\r\n");
      out.write("                            <input type=\"submit\" value=\"Subscribe\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer-bottom-area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <div class=\"copyright\">\r\n");
      out.write("                       <p>&copy; 2015 uCommerce. All Rights Reserved. <a href=\"http://www.freshdesignweb.com\" target=\"_blank\">freshDesignweb.com</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"footer-card-icon\">\r\n");
      out.write("                        <i class=\"fa fa-cc-discover\"></i>\r\n");
      out.write("                        <i class=\"fa fa-cc-mastercard\"></i>\r\n");
      out.write("                        <i class=\"fa fa-cc-paypal\"></i>\r\n");
      out.write("                        <i class=\"fa fa-cc-visa\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("    <!-- Latest jQuery form server -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap JS form CDN -->\r\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- jQuery sticky menu -->\r\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.sticky.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- jQuery easing -->\r\n");
      out.write("    <script src=\"js/jquery.easing.1.3.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Main Script -->\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /shop.jsp(189,13) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.items.productList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /shop.jsp(189,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
          out.write("                    <div class=\"single-shop-product\">\r\n");
          out.write("                        <div class=\"product-upper\">\r\n");
          out.write("                            <a href=\"single-product.jsp?name=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.MODEL_NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"><img src=\"img/Indoor/Image");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.nameId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(".jpg\" alt=\"\"></a>\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <h2><a href=\"single-product.jsp?name=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.MODEL_NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.MODEL_NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></h2>\r\n");
          out.write("                        <div class=\"product-carousel-price\">\r\n");
          out.write("                            <ins>Rs. \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.COST}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</ins> <del>Rs. ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.COST + 50}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</del>\r\n");
          out.write("                        </div>  \r\n");
          out.write("                        \r\n");
          out.write("                        <div class=\"product-option-shop\">\r\n");
          out.write("                            <button class=\"add_to_cart_button\" data-quantity=\"1\" data-product_sku=\"\" data-product_id=\"70\" rel=\"nofollow\" onclick=\"addCart()\">Add to cart</button>\r\n");
          out.write("                        </div>                       \r\n");
          out.write("                    </div>\r\n");
          out.write("                </div>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
