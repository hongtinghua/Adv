package com.fanli.mall.framework.util;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.fanli.mall.framework.mallLogger.MallLogger;

public class XMLUtil {
	/**
	 * 将MAP转为XML
	 * @param map
	 * @return
	 */
	public static String mapToXML(Map<String,String> map){
		if(map == null){
			return null;
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<xml>");
		for(String key : map.keySet()){
			sb.append("<");
			sb.append(key);
			sb.append(">");
			sb.append("<![CDATA[");
			sb.append(map.get(key));
			sb.append("]]>");
			sb.append("</");
			sb.append(key);
			sb.append(">");
		}
		sb.append("</xml>");
		
		return sb.toString();  
	}
	
	
	
	public static String mapToXML(Map<String,String> map,String charest){
		if(map == null){
			return null;
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<xml>");
		for(String key : map.keySet()){
			sb.append("<");
			sb.append(key);
			sb.append(">");
			sb.append("<![CDATA[");
			sb.append(map.get(key));
			sb.append("]]>");
			sb.append("</");
			sb.append(key);
			sb.append(">");
		}
		sb.append("</xml>");
		try {
			return new String(sb.toString().getBytes(), charest);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;  
	}
	
	
	
	
	/**
	 * 解决微信回调结果以GBK编码问题
	 * @param xml
	 * @return
	 */
	public static Map<String,String> XmlToMapForGBK(String xml){
		try{
			// 解析结果存储在HashMap
		    Map<String, String> map = new HashMap<String, String>();
		    // 读取输入流
		    SAXReader reader = new SAXReader();
		    reader.setEncoding("GBK");
		    Document document = reader.read(new ByteArrayInputStream(xml.getBytes("GBK")));
		    // 得到xml根元素
		    Element root = document.getRootElement();
		    // 得到根元素的所有子节点
		    @SuppressWarnings("unchecked")
			List<Element> elementList = root.elements();
		 
		    // 遍历所有子节点
		    for (Element e : elementList)
		        map.put(e.getName(), e.getText());
		    return map;
		}
		catch(Exception ex){
			MallLogger.error("反解析XML出错",xml, ex, null);
			ex.printStackTrace();
			return null;
		}
		 
	}
	
	/**
	 * 将XML转为MAP
	 * @param xml
	 * @return
	 */
	public static Map<String,String> XmlToMap(String xml){
		try{
			// 解析结果存储在HashMap
		    Map<String, String> map = new HashMap<String, String>();
		    // 读取输入流
		    SAXReader reader = new SAXReader();
		    Document document = reader.read(new ByteArrayInputStream(xml.getBytes()));
		    // 得到xml根元素
		    Element root = document.getRootElement();
		    // 得到根元素的所有子节点
		    @SuppressWarnings("unchecked")
			List<Element> elementList = root.elements();
		 
		    // 遍历所有子节点
		    for (Element e : elementList)
		        map.put(e.getName(), e.getText());
		    return map;
		}
		catch(Exception ex){
			MallLogger.error("反解析XML出错",xml, ex, null);
			ex.printStackTrace();
			return null;
		}
		 
	}
	
	
	public static void main(String[] args){
		Map<String, String> params = XmlToMap("<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[发放成功]]></return_msg><result_code><![CDATA[SUCCESS]]></result_code><err_code><![CDATA[SUCCESS]]></err_code><err_code_des><![CDATA[发放成功]]></err_code_des><mch_billno><![CDATA[2017060306041100000000000003]]></mch_billno><mch_id><![CDATA[1379507002]]></mch_id><wxappid><![CDATA[wx04d2ebea57e28699]]></wxappid><re_openid><![CDATA[oP3WWww99zaNxVeTYswJs8gUAc0Y]]></re_openid><total_amount>100</total_amount><send_listid><![CDATA[1000041701201706033000079865191]]></send_listid></xml>");
		
		System.out.println(params.get("return_code"));
		System.out.println(params.get("result_code"));
		System.out.println(params.get("out_trade_no"));
	}
	
	
}
