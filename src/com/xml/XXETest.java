package com.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class XXETest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xml =readFileByLines(XXETest.class.getResource("").getPath()+"NewFile.xml");
		System.out.println(xml);
		Map<String, String> params = XMLUtil.XmlToMap(xml.toString());
		  
		  
	}
	
	
	
	 public static  String readFileByLines(String fileName) {
	        File file = new File(fileName);
	        StringBuffer sb = new StringBuffer();
	        BufferedReader reader = null;
	        try {
	            System.out.println("以行为单位读取文件内容，一次读一整行：");
	            reader = new BufferedReader(new FileReader(file));
	            String tempString = null;
	            int line = 1;
	            // 一次读入一行，直到读入null为文件结束
	            while ((tempString = reader.readLine()) != null) {
	                // 显示行号
	            	sb = sb.append(tempString);
	                line++;
	            }
	            reader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e1) {
	                }
	            }
	        }
			return sb.toString();
	    }

}
