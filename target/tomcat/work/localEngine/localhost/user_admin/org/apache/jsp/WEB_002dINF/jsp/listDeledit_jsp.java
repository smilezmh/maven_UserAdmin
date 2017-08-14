package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listDeledit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tld/commons.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsmilezmh_005fpage_0026_005furl_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsmilezmh_005fpage_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fsmilezmh_005fpage_0026_005furl_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!-- 自定义标签库 -->\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("<script src=\"js/jquery-1.8.3.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.validate.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/messages_zh.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.8.3.js\"></script>\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/* 批量删除 */\r\n");
      out.write("\tfunction deleteUsers(){\r\n");
      out.write("\t\tvar list=new Array();//数组存放选中的id\r\n");
      out.write("\t\t$(\"input:checkbox[name='usersSelect']:checked\").each(function(){\r\n");
      out.write("\t\t\tlist.push($(this).val());\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/deleteMany.action\",\r\n");
      out.write("\t\t\ttraditional: true, //这个设置为true，data:{\"steps\":[\"qwe\",\"asd\",\"zxc\"]}会转换成steps=qwe&steps=asd&...\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\tdata:{\"list\":list},\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\talert(\"删除成功\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t//全选/全不选\r\n");
      out.write("\tfunction selectAll(){\r\n");
      out.write("\t\tif($(\"#usersSelectAll\").is(\":checked\"))\r\n");
      out.write("\t\t$(\"input:checkbox[name='usersSelect']\").prop(\"checked\", true); \r\n");
      out.write("\t\telse {\r\n");
      out.write("\t\t$(\"input:checkbox[name='usersSelect']\").prop(\"checked\", false);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t      \r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t/* function editUsers(){\r\n");
      out.write("\t\tvar list=new Array();\r\n");
      out.write("\t\tvar v=new Array();\r\n");
      out.write("\t\t$(\"input:checkbox[name='usersSelect']:checked\").each(function(){\r\n");
      out.write("\t\t\tlist.push($(this).val());\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/editMany.action\",\r\n");
      out.write("\t\t\ttraditional: true, //这个设置为true，data:{\"steps\":[\"qwe\",\"asd\",\"zxc\"]}会转换成steps=qwe&steps=asd&...\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\tdata:{\"users\":vo[list]},\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\talert(\"删除成功\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t} */\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<title>账户管理</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<div class=\"page-header\">\r\n");
      out.write("\t\t\t<h1 align=\"center\">\r\n");
      out.write("\t\t\t\t用户查询管理<span>&nbsp;&nbsp;</span><small>USER SEARCH&ADMIN</small>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<form id=\"itemsearch\" cellpadding=\"2px\" cellspacing=\"2px\"\r\n");
      out.write("\t\t\t\talign=\"center\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/editMany.action\" method=\"post\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t\t<!--批量修改  -->\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-default\"  onclick=\"window.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/search.action'\">home</button>\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-default navbar-btn\">修改</button>\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-default navbar-btn\" onclick=\"deleteUsers()\">刪除</button>\r\n");
      out.write("\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t<thead style=\"font-weight: bold;\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>全选/全不选<input type=\"checkbox\" id=\"usersSelectAll\" name=\"usersSelectAll\" onclick=\"selectAll()\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>用户id</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>用户名</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>用户电话</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>用户密码</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>邮箱</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>国别</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>职业</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"haha\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_smilezmh_005fpage_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/listDeledit.jsp(113,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/listDeledit.jsp(113,7) '${page.rows}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${page.rows}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/listDeledit.jsp(113,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("row");
    // /WEB-INF/jsp/listDeledit.jsp(113,7) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("v");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"checkbox\"  name=\"usersSelect\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"list[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\treadonly></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"list[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v.index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].username\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"list[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].telephone\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.telephone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" /></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"list[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].password\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.password}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"list[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].email\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"list[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].home\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.home}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"list[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].pro\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.pro}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_smilezmh_005fpage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  smilezmh:page
    smilezmh.register.common.utils.NavigationTag _jspx_th_smilezmh_005fpage_005f0 = (smilezmh.register.common.utils.NavigationTag) _005fjspx_005ftagPool_005fsmilezmh_005fpage_0026_005furl_005fnobody.get(smilezmh.register.common.utils.NavigationTag.class);
    _jspx_th_smilezmh_005fpage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_smilezmh_005fpage_005f0.setParent(null);
    // /WEB-INF/jsp/listDeledit.jsp(138,5) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_smilezmh_005fpage_005f0.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/deleteManyJsp.action", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_smilezmh_005fpage_005f0 = _jspx_th_smilezmh_005fpage_005f0.doStartTag();
    if (_jspx_th_smilezmh_005fpage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsmilezmh_005fpage_0026_005furl_005fnobody.reuse(_jspx_th_smilezmh_005fpage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsmilezmh_005fpage_0026_005furl_005fnobody.reuse(_jspx_th_smilezmh_005fpage_005f0);
    return false;
  }
}
