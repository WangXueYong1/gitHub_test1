package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class monitor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"#\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/echarts.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t/*$(\"#main1\").hide();*/\r\n");
      out.write("\t\t$(\"#main2\").hide();\r\n");
      out.write("\t\t$(\"#main3\").hide();\r\n");
      out.write("\t\t/*$(\"#main4\").hide();*/\r\n");
      out.write("\t\t$(\"#main5\").hide();\r\n");
      out.write("\t\t$(\"#main6\").hide();\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#li1\").mouseenter(function() {\r\n");
      out.write("\t\t\t$(\".chatMap\").hide();\r\n");
      out.write("\t\t\t$(\"#main1\").show();\r\n");
      out.write("\t\t\tf1();\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#li2\").mouseenter(function() {\r\n");
      out.write("\t\t\t$(\".chatMap\").hide();\r\n");
      out.write("\t\t\t$(\"#main2\").show();\r\n");
      out.write("\t\t\tf2();\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#li3\").mouseenter(function() {\r\n");
      out.write("\t\t\t$(\".chatMap\").hide();\r\n");
      out.write("\t\t\t$(\"#main3\").show();\r\n");
      out.write("\t\t\tf3();\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#li4\").mouseenter(function() {\r\n");
      out.write("\t\t\t$(\".chatMap\").hide();\r\n");
      out.write("\t\t\t$(\"#main4\").show();\r\n");
      out.write("\t\t\tf4();\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#li5\").mouseenter(function() {\r\n");
      out.write("\t\t\t$(\".chatMap\").hide();\r\n");
      out.write("\t\t\t$(\"#main5\").show();\r\n");
      out.write("\t\t\tf5();\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#li6\").mouseenter(function() {\r\n");
      out.write("\t\t\t$(\".chatMap\").hide();\r\n");
      out.write("\t\t\t$(\"#main6\").show();\r\n");
      out.write("\t\t\tf6();\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction findFloor(){\r\n");
      out.write("\t        var $buildId=$(\"#buildingList\").val();\r\n");
      out.write("\t        $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/DeviceInformation/findFloorByBuilding.action\",{\"buildingId\":$buildId},function(obj){\r\n");
      out.write("\t           var $city=$(\"#floorList\");\r\n");
      out.write("\t            $city.html(\"\");\r\n");
      out.write("\t            if(obj!=null){\r\n");
      out.write("\t                $(obj).each(function(){\r\n");
      out.write("\t                    $city.append($(\"<option value='\"+this+\"'>第\"+this+\"层</option>\"));\r\n");
      out.write("\t                });\r\n");
      out.write("\t            } \r\n");
      out.write("\t        },\"json\");\r\n");
      out.write("\t    }\r\n");
      out.write("\t\tfunction findRoom(){\r\n");
      out.write("\t\t\t var $buildId=$(\"#buildingList\").val();\r\n");
      out.write("\t\t     var $floor=$(\"#floorList\").val();\r\n");
      out.write("\t\t     $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/DeviceInformation/findRoomByBuildingFloor.action\",{\"buildingId\":$buildId,\"floor\":$floor},function(obj){\r\n");
      out.write("\t\t        var $city=$(\"#roomList\");\r\n");
      out.write("\t\t         $city.html(\"\");\r\n");
      out.write("\t\t         if(obj!=null){\r\n");
      out.write("\t\t             $(obj).each(function(){\r\n");
      out.write("\t\t                 $city.append($(\"<option value='\"+this+\"'>\"+this+\"房间</option>\"));\r\n");
      out.write("\t\t             });\r\n");
      out.write("\t\t         } \r\n");
      out.write("\t\t     },\"json\");\r\n");
      out.write("\t    }\r\n");
      out.write("\r\n");
      out.write("\t         $(\"#buildingList\").click(findFloor);\t\t \r\n");
      out.write("\t\t\t $(\"#floorList\").click(findRoom);\r\n");
      out.write("\t\t\t/*  $(\"#roomList\").click(findRoom);\r\n");
      out.write("\t\t\t $(\"#floorList\").click(findFloor); */\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t $(\"#roomList\").change(function(){\r\n");
      out.write("\t\t\t var buildId=$(\"#buildingList\").val();\r\n");
      out.write("             var floor=$(\"#floorList\").val();\r\n");
      out.write("             var room=$(\"#roomList\").val();\r\n");
      out.write("             $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/DeviceInformation/findDeviceByDeviceInformation.action\",{\"buildingId\":buildId,\"floor\":floor,\"room\":room},function(obj){\r\n");
      out.write("                var $device=$(\"#deviceList\");\r\n");
      out.write("                 $device.html(\"<option>-请选择-</option>\");\r\n");
      out.write("                 if(obj!=null){\r\n");
      out.write("                     $(obj).each(function(){\r\n");
      out.write("                         $device.append($(\"<option value='\"+this.deviceId+\"'>\"+this.name+\"</option>\"));\r\n");
      out.write("                     });\r\n");
      out.write("                 } \r\n");
      out.write("             },\"json\");\r\n");
      out.write("         });\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t var dataLegend = [ '空调1' ];\r\n");
      out.write("\t\t\tvar xAxisData ={};\r\n");
      out.write("\t\t\tvar data ={};        \t\t\t\t\r\n");
      out.write("\t\t\tvar myChart =echarts.init(document.getElementById('main0'));\r\n");
      out.write("\t\t\tvar option = {\r\n");
      out.write("\t\t\t\t\ttitle : {\r\n");
      out.write("\t\t\t\t\t\ttext : '各电器功耗状态（功率kw/h）'\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\ttooltip : {\r\n");
      out.write("\t\t\t\t\t\ttrigger : 'axis'\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tlegend : {\r\n");
      out.write("\t\t\t\t\t\tdata : dataLegend\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\txAxis : {\r\n");
      out.write("\t\t\t\t\t\tname: '时间',\r\n");
      out.write("\t\t\t\t\t\ttype : 'category',\r\n");
      out.write("\t\t\t\t\t\tboundaryGap : false,\r\n");
      out.write("\t\t\t\t\t\tdata : xAxisData\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tyAxis : {\r\n");
      out.write("\t\t\t\t\t\tname: '功耗(kw•h)',\r\n");
      out.write("\t\t\t\t\t\ttype : 'value'\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tseries :[{\r\n");
      out.write("\t\t\t\t\t\tname : '窗帘1',\r\n");
      out.write("\t\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t\t\t\t\t\tdata : data\r\n");
      out.write("\t\t\t\t\t}]\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\tmyChart.setOption(option);\t\r\n");
      out.write("\t\t\t$(\"#main3\").show();\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t\t//按小时查看\r\n");
      out.write("\t\t $(\"#button1\").click(function(){\r\n");
      out.write("\t\t\tvar deviceId=$(\"#deviceList\").val();\r\n");
      out.write("            var startTime=$(\"#startTime\").val();           \r\n");
      out.write("            var endTime=$(\"#endTime\").val();            \r\n");
      out.write("            var data={\"startTime\":startTime,\"endTime\":endTime,\"deviceId\":deviceId};\r\n");
      out.write("            $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/deviceStatus/findDeviceStatusByDeviceInformation.action\"\r\n");
      out.write("           \t\t\t  ,data,function(obj){\r\n");
      out.write("           \t\t\t\toption.title= {text : '实际功耗'},\r\n");
      out.write("           \t\t\t\toption.legend={data:['实际功耗']};\r\n");
      out.write("           \t\t\t\toption.xAxis.data =obj.xAxisData;\r\n");
      out.write("           \t\t\t\toption.series[0]={\r\n");
      out.write("\t    \t\t\t\t\t\tname : '实际功耗',\r\n");
      out.write("\t    \t\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t    \t\t\t\t\t\tdata : obj.data\r\n");
      out.write("\t    \t\t\t\t}\r\n");
      out.write("           \t\t\t\toption.series[1]={\r\n");
      out.write("    \t\t\t\t\t\tname : '预测功耗',\r\n");
      out.write("    \t\t\t\t\t\ttype : 'line',\r\n");
      out.write("    \t\t\t\t\t\tdata : []\r\n");
      out.write("    \t\t\t\t\t}\r\n");
      out.write("           \t\t\t\t//option.series[1].data =obj.data2;\r\n");
      out.write("           \t\t\t\tmyChart.clear();\r\n");
      out.write("        \t\t\t\tmyChart.setOption(option);\t\r\n");
      out.write("        \t\t\t\t$(\"#main0\").show();\r\n");
      out.write("                     },\"json\");\r\n");
      out.write("         });\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t//按天查看\r\n");
      out.write("\t\t $(\"#button2\").click(function(){\r\n");
      out.write("\t\t\t\tvar deviceId=$(\"#deviceList\").val();\r\n");
      out.write("\t            var startTime=$(\"#startTime\").val();           \r\n");
      out.write("\t            var endTime=$(\"#endTime\").val();            \r\n");
      out.write("\t            var data={\"startTime\":startTime,\"endTime\":endTime,\"deviceId\":deviceId};\r\n");
      out.write("\t            $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/deviceStatus/findDeviceStatusByDeviceInformation2.action\"\r\n");
      out.write("\t           \t\t\t  ,data,function(obj){\r\n");
      out.write("\t           \t\t\t\t/* myChart =echarts.init(document.getElementById('main0'));\r\n");
      out.write("\t           \t\t\t\tvar dataLegend = [ '空调1' ];\r\n");
      out.write("\t           \t\t\t\toption.xAxis.data =obj.xAxisData;\r\n");
      out.write("\t           \t\t\t\toption.series[0].data =obj.data;\r\n");
      out.write("\t           \t\t\t\toption.series[1].data ={};\r\n");
      out.write("\t           \t\t\t\tmyChart.clear();        \t\t\t\t\r\n");
      out.write("\t        \t\t\t\tmyChart.setOption(option);\t\r\n");
      out.write("\t        \t\t\t\t$(\"#main0\").show(); */\r\n");
      out.write("\t        \t\t\t\t\r\n");
      out.write("\t           \t\t\t\toption.title= {text : '实际功耗'},\r\n");
      out.write("\t           \t\t\t\toption.legend={data:['实际功耗']};\r\n");
      out.write("\t           \t\t\t\toption.xAxis.data =obj.xAxisData;\r\n");
      out.write("\t           \t\t\t\toption.series[0]={\r\n");
      out.write("\t\t    \t\t\t\t\t\tname : '实际功耗',\r\n");
      out.write("\t\t    \t\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t\t    \t\t\t\t\t\tdata : obj.data\r\n");
      out.write("\t\t    \t\t\t\t}\r\n");
      out.write("\t           \t\t\t\toption.series[1]={\r\n");
      out.write("\t    \t\t\t\t\t\tname : '预测功耗',\r\n");
      out.write("\t    \t\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t    \t\t\t\t\t\tdata : []\r\n");
      out.write("\t    \t\t\t\t\t}\r\n");
      out.write("\t           \t\t\t\t//option.series[1].data =obj.data2;\r\n");
      out.write("\t           \t\t\t\tmyChart.clear();\r\n");
      out.write("\t        \t\t\t\tmyChart.setOption(option);\t\r\n");
      out.write("\t        \t\t\t\t$(\"#main0\").show();\r\n");
      out.write("\t                     },\"json\");\r\n");
      out.write("\t     });\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//按月查看\r\n");
      out.write("\t\t $(\"#button3\").click(function(){\r\n");
      out.write("\t\t\t\tvar deviceId=$(\"#deviceList\").val();\r\n");
      out.write("\t            var startTime=$(\"#startTime\").val();           \r\n");
      out.write("\t            var endTime=$(\"#endTime\").val();            \r\n");
      out.write("\t            var data={\"startTime\":startTime,\"endTime\":endTime,\"deviceId\":deviceId};\r\n");
      out.write("\t            $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/deviceStatus/findDeviceStatusByDeviceInformation3.action\"\r\n");
      out.write("\t           \t\t\t  ,data,function(obj){\r\n");
      out.write("\t           \t\t\t\t/* myChart =echarts.init(document.getElementById('main0'));\r\n");
      out.write("\t           \t\t\t\toption.series[0].data =obj.data;\r\n");
      out.write("\t           \t\t\t\toption.series[1].data ={};\r\n");
      out.write("\t           \t\t\t\toption.xAxis.data =obj.xAxisData;\r\n");
      out.write("\t           \t\t\t\tmyChart.clear();      \t\t\t\t\r\n");
      out.write("\t        \t\t\t\tmyChart.setOption(option);\t\r\n");
      out.write("\t        \t\t\t\t$(\"#main0\").show(); */\r\n");
      out.write("\t        \t\t\t\t\r\n");
      out.write("\t        \t\t\t\t\r\n");
      out.write("\t        \t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t           \t\t\t\toption.title= {text : '实际功耗'},\r\n");
      out.write("\t           \t\t\t\toption.legend={data:['实际功耗']};\r\n");
      out.write("\t           \t\t\t\toption.xAxis.data =obj.xAxisData;\r\n");
      out.write("\t           \t\t\t\toption.series[0]={\r\n");
      out.write("\t\t    \t\t\t\t\t\tname : '实际功耗',\r\n");
      out.write("\t\t    \t\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t\t    \t\t\t\t\t\tdata : obj.data\r\n");
      out.write("\t\t    \t\t\t\t}\r\n");
      out.write("\t           \t\t\t\toption.series[1]={\r\n");
      out.write("\t    \t\t\t\t\t\tname : '预测功耗',\r\n");
      out.write("\t    \t\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t    \t\t\t\t\t\tdata : []\r\n");
      out.write("\t    \t\t\t\t\t}\r\n");
      out.write("\t           \t\t\t\t//option.series[1].data =obj.data2;\r\n");
      out.write("\t           \t\t\t\tmyChart.clear();\r\n");
      out.write("\t        \t\t\t\tmyChart.setOption(option);\t\r\n");
      out.write("\t        \t\t\t\t$(\"#main0\").show();\r\n");
      out.write("\t        \t\t\t\t\r\n");
      out.write("\t        \t\t\t\t\r\n");
      out.write("\t                     },\"json\");\r\n");
      out.write("\t     });\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//当天预测功耗查看\r\n");
      out.write("\t\t $(\"#button4\").click(function(){\r\n");
      out.write("\t\t\t\tvar deviceId=$(\"#deviceList\").val();\r\n");
      out.write("\t            var startTime=$(\"#startTime\").val();           \r\n");
      out.write("\t            var endTime=$(\"#endTime\").val();            \r\n");
      out.write("\t            var data={\"startTime\":startTime,\"endTime\":endTime,\"deviceId\":deviceId};\r\n");
      out.write("\t            $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/deviceStatus/findDeviceStatusByDeviceInformation4.action\"\r\n");
      out.write("\t           \t\t\t  ,data,function(obj){\r\n");
      out.write("\t           \t\t\t\toption.title= {text : '实际功耗预测功耗对比'},\r\n");
      out.write("\t           \t\t\t\toption.legend={data:['实际功耗','预测功耗']};\r\n");
      out.write("\t           \t\t\t\toption.xAxis.data =obj.xAxisData;\r\n");
      out.write("\t           \t\t\t\toption.series[0]={\r\n");
      out.write("\t\t    \t\t\t\t\t\tname : '实际功耗',\r\n");
      out.write("\t\t    \t\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t\t    \t\t\t\t\t\tdata : obj.data\r\n");
      out.write("\t\t    \t\t\t\t}\r\n");
      out.write("\t           \t\t\t\toption.series[1]={\r\n");
      out.write("\t    \t\t\t\t\t\tname : '预测功耗',\r\n");
      out.write("\t    \t\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t    \t\t\t\t\t\tdata : obj.data2\r\n");
      out.write("\t    \t\t\t\t\t}\r\n");
      out.write("\t           \t\t\t\t//option.series[1].data =obj.data2;\r\n");
      out.write("\t           \t\t\t\tmyChart.clear();\r\n");
      out.write("\t        \t\t\t\tmyChart.setOption(option);\t\r\n");
      out.write("\t        \t\t\t\t$(\"#main0\").show();\r\n");
      out.write("\t                     },\"json\");\r\n");
      out.write("\t     });\r\n");
      out.write("\t});\t\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\" style=\"width: 100%\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"header\" style=\"background-color: #FFA;\">\r\n");
      out.write("\t\t\t<h1 align=\"center\" style=\"margin-bottom: 0;\">杭州电子科技大学写字楼能耗管理系统</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"menu\"\r\n");
      out.write("\t\t\tstyle=\"background-color: #bae5ff; height: 700px; width: 120px; float: left;\">\r\n");
      out.write("\t\t\t<ul class=\"nav nav-tabs\">\r\n");
      out.write("\t\t\t\t<li id=\"li1\"><a href=\"#\">耗电比重</a></li>\r\n");
      out.write("\t\t\t\t<li id=\"li2\"><a href=\"#\">灯具状态</a></li>\r\n");
      out.write("\t\t\t\t<li id=\"li3\"><a href=\"#\">空调状态</a></li>\r\n");
      out.write("\t\t\t\t<li id=\"li4\"><a href=\"#\">窗帘状态</a></li>\r\n");
      out.write("\t\t\t\t<li id=\"li5\"><a href=\"#\">温度</a></li>\r\n");
      out.write("\t\t\t\t<li id=\"li6\"><a href=\"#\">光照</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"content\"\r\n");
      out.write("\t\t\tstyle=\"background-color: #CCC; height: 700px; width: 100%; position: relative;; margin-left: 120px\">\r\n");
      out.write("\t\t\t<span>位置：</span> \r\n");
      out.write("\t\t\t<select>\r\n");
      out.write("\t\t\t\t<option>杭州电子科技大学</option>\r\n");
      out.write("\t\t\t</select> \r\n");
      out.write("\t\t\t<select id=\"buildingList\">\r\n");
      out.write("\t\t\t\t<option value=\"2\">第二教学楼</option>\r\n");
      out.write("\t\t\t\t<option value=\"1\">第一教学楼</option>\r\n");
      out.write("\t\t\t\t<option value=\"3\">第三教学楼</option>\r\n");
      out.write("\t\t\t</select> \r\n");
      out.write("\t\t\t<select id=\"floorList\">\t\t\t\t\r\n");
      out.write("\t\t\t</select> \r\n");
      out.write("\t\t\t<select id=\"roomList\">\r\n");
      out.write("\t\t\t</select>  \r\n");
      out.write("\t\t\t<select id=\"deviceList\">\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t<span> 时间:</span> \r\n");
      out.write("\t\t\t<input type=\"datetime-local\" id=\"startTime\" value=\"2018-07-05T00:00\">\r\n");
      out.write("\t\t\t<span>~</span> \r\n");
      out.write("\t\t\t<input type=\"datetime-local\" id=\"endTime\" value=\"2018-08-07T00:00\">\r\n");
      out.write("\t\t\t<button id=\"button1\">按小时查看</button>\r\n");
      out.write("\t\t\t<button id=\"button2\">按天查看</button>\r\n");
      out.write("\t\t\t<button id=\"button3\">按月查看</button>\r\n");
      out.write("\t\t\t<button id=\"button4\">查看当天预测功耗</button>\r\n");
      out.write("\t\t\t<div id=\"main0\" class=\"chatMap\" display=\"none\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 700px; height: 300px;\"></div>\r\n");
      out.write("\t\t\t<div id=\"main1\" class=\"chatMap\" display=\"none\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 700px; height: 300px;\"></div>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\tfunction f1() {\r\n");
      out.write("\t\t\t\t\tvar data = [ {\r\n");
      out.write("\t\t\t\t\t\tname : '灯具耗电',\r\n");
      out.write("\t\t\t\t\t\tvalue : 1212\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\tname : '空调耗电',\r\n");
      out.write("\t\t\t\t\t\tvalue : 2323\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\tname : '其他',\r\n");
      out.write("\t\t\t\t\t\tvalue : 1919\r\n");
      out.write("\t\t\t\t\t} ];\r\n");
      out.write("\t\t\t\t\tvar myChart = echarts\r\n");
      out.write("\t\t\t\t\t\t\t.init(document.getElementById('main1'));\r\n");
      out.write("\t\t\t\t\tmyChart.setOption({\r\n");
      out.write("\t\t\t\t\t\tseries : {\r\n");
      out.write("\t\t\t\t\t\t\ttype : 'pie',\r\n");
      out.write("\t\t\t\t\t\t\tdata : data\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"main2\" class=\"chatMap\" display=\"none\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 700px; height: 500px;\"></div>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\tfunction f2() {\r\n");
      out.write("\t\t\t\t\tvar data = [ 120, 200, 150, 80, 70, 110, 130 ];\r\n");
      out.write("\t\t\t\t\tvar myChart = echarts\r\n");
      out.write("\t\t\t\t\t\t\t.init(document.getElementById('main2'));\r\n");
      out.write("\t\t\t\t\tmyChart.setOption({\r\n");
      out.write("\t\t\t\t\t\txAxis : {\r\n");
      out.write("\t\t\t\t\t\t\ttype : 'category',\r\n");
      out.write("\t\t\t\t\t\t\tdata : [ 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'Sun' ]\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tyAxis : {\r\n");
      out.write("\t\t\t\t\t\t\ttype : 'value'\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tseries : [ {\r\n");
      out.write("\t\t\t\t\t\t\tdata : data,\r\n");
      out.write("\t\t\t\t\t\t\ttype : 'bar'\r\n");
      out.write("\t\t\t\t\t\t} ]\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"main3\" class=\"chatMap\" display=\"none\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 700px; height: 500px;\"></div>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\tvar dataLegend = [ '空调1', '空调2' ];\r\n");
      out.write("\t\t\t\tvar data24h = [ '0时', '1时', '2时', '3时', '4时', '5时', '6时', '7时',\r\n");
      out.write("\t\t\t\t\t\t'8时', '9时', '10时', '11时', '12时', '13时', '14时', '15时',\r\n");
      out.write("\t\t\t\t\t\t'16时', '17时', '18时', '19时', '20时', '21时', '22时', '23时',\r\n");
      out.write("\t\t\t\t\t\t'24时' ];\r\n");
      out.write("\t\t\t\tvar data = [ {\r\n");
      out.write("\t\t\t\t\tname : '空调1',\r\n");
      out.write("\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t\t\t\t\tdata : [ 120, 132, 101, 134, 90, 230, 210 ]\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tname : '空调2',\r\n");
      out.write("\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t\t\t\t\tdata : [ 220, 182, 191, 234, 290, 330, 310 ]\r\n");
      out.write("\t\t\t\t} ];\r\n");
      out.write("\t\t\t\tfunction f3() {\r\n");
      out.write("\t\t\t\t\techarts.init(document.getElementById('main3')).setOption({\r\n");
      out.write("\t\t\t\t\t\ttitle : {\r\n");
      out.write("\t\t\t\t\t\t\ttext : '各电器功耗状态（功率kw/h）'\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\ttooltip : {\r\n");
      out.write("\t\t\t\t\t\t\ttrigger : 'axis'\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tlegend : {\r\n");
      out.write("\t\t\t\t\t\t\tdata : dataLegend\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\txAxis : {\r\n");
      out.write("\t\t\t\t\t\t\ttype : 'category',\r\n");
      out.write("\t\t\t\t\t\t\tboundaryGap : false,\r\n");
      out.write("\t\t\t\t\t\t\tdata : data24h\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tyAxis : {\r\n");
      out.write("\t\t\t\t\t\t\ttype : 'value'\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tseries : data\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"main4\" class=\"chatMap\" display=\"none\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 700px; height: 500px;\"></div>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\tfunction f4() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\techarts.init(document.getElementById('main4')).setOption(\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttext : '窗帘状态（功率kw/h）'\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\ttooltip : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttrigger : 'axis'\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tlegend : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata : [ '窗帘1', '窗帘2' ]\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tgrid : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tleft : '3%',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tright : '4%',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tbottom : '3%',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcontainLabel : true\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\ttoolbox : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfeature : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsaveAsImage : {}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\txAxis : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype : 'category',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tboundaryGap : false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata : [ '0时', '1时', '2时', '3时', '4时',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'5时', '6时', '7时', '8时', '9时',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'10时', '11时', '12时', '13时', '14时',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'15时', '16时', '17时', '18时', '19时',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'20时', '21时', '22时', '23时', '24时' ]\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tyAxis : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype : 'value'\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tseries : [\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname : '窗帘1',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata : [ 120, 132, 101, 134, 90,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t230, 210, 132, 101, 134,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t90, 230, 210 ]\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname : '窗帘2',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata : [ 220, 182, 191, 234, 290,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t330, 310, 132, 101, 134,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t90, 230, 210 ]\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t} ]\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"main5\" class=\"chatMap\" display=\"none\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 700px; height: 500px;\"></div>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\tfunction f5() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\techarts.init(document.getElementById('main5')).setOption(\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttext : '光照强度（  ）'\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\ttooltip : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttrigger : 'axis'\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tlegend : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata : [ '光照强度' ]\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tgrid : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tleft : '3%',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tright : '4%',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tbottom : '3%',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcontainLabel : true\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\ttoolbox : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfeature : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsaveAsImage : {}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\txAxis : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype : 'category',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tboundaryGap : false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata : [ '0时', '1时', '2时', '3时', '4时',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'5时', '6时', '7时', '8时', '9时',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'10时', '11时', '12时', '13时', '14时',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'15时', '16时', '17时', '18时', '19时',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'20时', '21时', '22时', '23时', '24时' ]\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tyAxis : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype : 'value'\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tseries : [ {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname : '光照强度',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata : [ 120, 132, 101, 134, 90, 230, 210,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t182, 191, 234, 290, 330, 310 ]\r\n");
      out.write("\t\t\t\t\t\t\t\t} ]\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"main6\" class=\"chatMap\" display=\"none\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 700px; height: 500px;\"></div>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\tfunction f6() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\techarts.init(document.getElementById('main6')).setOption(\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttext : '温度（摄氏度）'\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\ttooltip : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttrigger : 'axis'\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tlegend : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata : [ '温度' ]\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tgrid : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tleft : '3%',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tright : '4%',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tbottom : '3%',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcontainLabel : true\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\ttoolbox : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfeature : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsaveAsImage : {}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\txAxis : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype : 'category',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tboundaryGap : false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata : [ '0时', '1时', '2时', '3时', '4时',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'5时', '6时', '7时', '8时', '9时',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'10时', '11时', '12时', '13时', '14时',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'15时', '16时', '17时', '18时', '19时',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'20时', '21时', '22时', '23时', '24时' ]\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tyAxis : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype : 'value'\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tseries : [ {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname : '温度',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype : 'line',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata : [ 120, 132, 101, 134, 90, 230, 210 ]\r\n");
      out.write("\t\t\t\t\t\t\t\t} ]\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"footer\"\r\n");
      out.write("\t\t\tstyle=\"background-color: #FFA500; clear: both; text-align: center;\">\r\n");
      out.write("\t\t\t版权 © 杭州电子科技大学</div>\r\n");
      out.write("\r\n");
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
}
