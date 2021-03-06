package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.sapient.Item;
import com.sapient.DataAccessObject;

public final class single_002dproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Product Page - Ustora Demo</title>\r\n");
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
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
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
      out.write("                        <li><a href=\"shop.jsp\">Shop page</a></li>\r\n");
      out.write("                        <li class=\"active\"><a href=\"single-product.jsp\">Single product</a></li>\r\n");
      out.write("                        <li><a href=\"cart.html\">Cart</a></li>\r\n");
      out.write("                        <li><a href=\"checkout.jsp\">Checkout</a></li>\r\n");
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
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"single-sidebar\">\r\n");
      out.write("                        <h2 class=\"sidebar-title\">Search Products</h2>\r\n");
      out.write("                        <form action=\"\">\r\n");
      out.write("                            <input type=\"text\" placeholder=\"Search products...\">\r\n");
      out.write("                            <input type=\"submit\" value=\"Search\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <!-- <div class=\"single-sidebar\">\r\n");
      out.write("                        <h2 class=\"sidebar-title\">Products</h2>\r\n");
      out.write("                        <div class=\"thubmnail-recent\">\r\n");
      out.write("                            <img src=\"img/product-thumb-1.jpg\" class=\"recent-thumb\" alt=\"\">\r\n");
      out.write("                            <h2><a href=\"\">Sony Smart TV - 2015</a></h2>\r\n");
      out.write("                            <div class=\"product-sidebar-price\">\r\n");
      out.write("                                <ins>$700.00</ins> <del>$100.00</del>\r\n");
      out.write("                            </div>                             \r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"single-sidebar\">\r\n");
      out.write("                        <h2 class=\"sidebar-title\">Recent Posts</h2>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"\">Sony Smart TV - 2015</a></li>\r\n");
      out.write("                            <li><a href=\"\">Sony Smart TV - 2015</a></li>\r\n");
      out.write("                            <li><a href=\"\">Sony Smart TV - 2015</a></li>\r\n");
      out.write("                            <li><a href=\"\">Sony Smart TV - 2015</a></li>\r\n");
      out.write("                            <li><a href=\"\">Sony Smart TV - 2015</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div> -->\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <div class=\"product-content-right\">\r\n");
      out.write("                        <div class=\"product-breadcroumb\">\r\n");
      out.write("                            <a href=\"\">Home</a>\r\n");
      out.write("                            <a href=\"\">Category Name</a>\r\n");
      out.write("                            <a href=\"\">Sony Smart TV - 2015</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        ");
 	if(request.getParameter("name")==null || request.getParameter("name").isEmpty())
                        		request.getRequestDispatcher("/shop.jsp").forward(request, response);
                       
                        	   String productName = request.getParameter("name");
                               DataAccessObject dao = new DataAccessObject();
                               Item item = dao.getItem(productName);
                               String imageName="";
                               if(Integer.parseInt(item.getU_ID())<9)
                            		imageName = "Image0";
                            	else
                            		imageName = "Image";
                            
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <div class=\"product-images\">\r\n");
      out.write("                                    <div class=\"product-main-img\">\r\n");
      out.write("                                        <img src=\"");
 out.println("img/Indoor/"+imageName+(Integer.parseInt(item.getU_ID()))+".jpg"); 
      out.write("\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <!-- <div class=\"product-gallery\">\r\n");
      out.write("                                        <img src=\"img/product-thumb-1.jpg\" alt=\"\">\r\n");
      out.write("                                        <img src=\"img/product-thumb-2.jpg\" alt=\"\">\r\n");
      out.write("                                        <img src=\"img/product-thumb-3.jpg\" alt=\"\">\r\n");
      out.write("                                    </div> -->\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <div class=\"product-inner\">\r\n");
      out.write("                                    <h2 class=\"product-name\">");
out.println(item.getMODEL_NAME());
      out.write("</h2>\r\n");
      out.write("                                    <div class=\"product-inner-price\">\r\n");
      out.write("                                        <ins>");
out.println("Rs. "+item.getCOST());
      out.write("</ins> <del>");
out.println("Rs. "+(item.getCOST()+25));
      out.write("</del>\r\n");
      out.write("                                    </div>    \r\n");
      out.write("                                    \r\n");
      out.write("                                    <form action=\"\" class=\"cart\">\r\n");
      out.write("                                        <div class=\"quantity\">\r\n");
      out.write("                                            <input type=\"number\" size=\"4\" class=\"input-text qty text\" title=\"Qty\" value=\"1\" name=\"quantity\" min=\"1\" step=\"1\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <button class=\"add_to_cart_button\" type=\"submit\">Add to cart</button>\r\n");
      out.write("                                    </form>   \r\n");
      out.write("                                    \r\n");
      out.write("                                    <!-- <div class=\"product-inner-category\">\r\n");
      out.write("                                        <p>Category: <a href=\"\">Summer</a>. Tags: <a href=\"\">awesome</a>, <a href=\"\">best</a>, <a href=\"\">sale</a>, <a href=\"\">shoes</a>. </p>\r\n");
      out.write("                                    </div>  -->\r\n");
      out.write("                                    \r\n");
      out.write("                                    <div role=\"tabpanel\">\r\n");
      out.write("                                        <ul class=\"product-tab\" role=\"tablist\">\r\n");
      out.write("                                            <li role=\"presentation\" class=\"active\"><a href=\"#home\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\">Description</a></li>\r\n");
      out.write("                                            <li role=\"presentation\"><a href=\"#profile\" aria-controls=\"profile\" role=\"tab\" data-toggle=\"tab\">Reviews</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                        <div class=\"tab-content\">\r\n");
      out.write("                                            <div role=\"tabpanel\" class=\"tab-pane fade in active\" id=\"home\">\r\n");
      out.write("                                                <h2>Product Description</h2>  \r\n");
      out.write("                                                <p>");
out.println(item.getDESCRIPTION());
      out.write("</p>\r\n");
      out.write("                                                <!-- <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tristique, diam in consequat iaculis, est purus iaculis mauris, imperdiet facilisis ante ligula at nulla. Quisque volutpat nulla risus, id maximus ex aliquet ut. Suspendisse potenti. Nulla varius lectus id turpis dignissim porta. Quisque magna arcu, blandit quis felis vehicula, feugiat gravida diam. Nullam nec turpis ligula. Aliquam quis blandit elit, ac sodales nisl. Aliquam eget dolor eget elit malesuada aliquet. In varius lorem lorem, semper bibendum lectus lobortis ac.</p>\r\n");
      out.write("\r\n");
      out.write("                                                <p>Mauris placerat vitae lorem gravida viverra. Mauris in fringilla ex. Nulla facilisi. Etiam scelerisque tincidunt quam facilisis lobortis. In malesuada pulvinar neque a consectetur. Nunc aliquam gravida purus, non malesuada sem accumsan in. Morbi vel sodales libero.</p> -->\r\n");
      out.write("                                                \r\n");
      out.write("                                             </div>\r\n");
      out.write("                                            <div role=\"tabpanel\" class=\"tab-pane fade\" id=\"profile\">\r\n");
      out.write("                                                <h2>Reviews</h2>\r\n");
      out.write("                                                <div class=\"submit-review\">\r\n");
      out.write("                                                    <p><label for=\"name\">Name</label> <input name=\"name\" type=\"text\"></p>\r\n");
      out.write("                                                    <p><label for=\"email\">Email</label> <input name=\"email\" type=\"email\"></p>\r\n");
      out.write("                                                    <div class=\"rating-chooser\">\r\n");
      out.write("                                                        <p>Your rating</p>\r\n");
      out.write("\r\n");
      out.write("                                                        <div class=\"rating-wrap-post\">\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <p><label for=\"review\">Your review</label> <textarea name=\"review\" id=\"\" cols=\"30\" rows=\"10\"></textarea></p>\r\n");
      out.write("                                                    <p><input type=\"submit\" value=\"Submit\"></p>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"related-products-wrapper\">\r\n");
      out.write("                            <h2 class=\"related-products-title\">Related Products</h2>\r\n");
      out.write("                            <div class=\"related-products-carousel\">\r\n");
      out.write("                            <!-- -------------------------------------------------------------- --> \r\n");
      out.write("                            ");

				             	List<Item> items = dao.getProductList();
                            	int oldPrice=0;
                            	for (int i = 0; i < items.size(); i++){ 
                            	if(i<9)
                            		imageName = "Image0";
                            	else
                            		imageName = "Image";
                            	oldPrice = items.get(i).getCOST()+25;				             	
				             
      out.write("\r\n");
      out.write("                                <div class=\"single-product\">\r\n");
      out.write("                                    <div class=\"product-f-image\">\r\n");
      out.write("                                        <img src=\"");
 out.println("img/Indoor/"+imageName+(i+1)+".jpg"); 
      out.write("\" alt=\"\">\r\n");
      out.write("                                        <div class=\"product-hover\">\r\n");
      out.write("                                            <a href=\"\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\r\n");
      out.write("                                            <a href=\"single-product.jsp?name=");
out.println(items.get(i).getMODEL_NAME());
      out.write("\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <h2><a href=\"single-product.jsp?name=");
out.println(items.get(i).getMODEL_NAME());
      out.write('"');
      out.write('>');
out.println(items.get(i).getMODEL_NAME());
      out.write("</a></h2>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"product-carousel-price\">\r\n");
      out.write("                                        <ins>");
 out.print("Rs. "+items.get(i).getCOST()); 
      out.write("</ins> <del>");
 out.print("Rs. "+oldPrice); 
      out.write("</del>\r\n");
      out.write("                                    </div> \r\n");
      out.write("                                </div> \r\n");
      out.write("                                <!-- -------------------------------------------------------------- -->  \r\n");
      out.write("                                ");
} 
      out.write("                          \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
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
}
