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
	            System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");
	            reader = new BufferedReader(new FileReader(file));
	            String tempString = null;
	            int line = 1;
	            // һ�ζ���һ�У�ֱ������nullΪ�ļ�����
	            while ((tempString = reader.readLine()) != null) {
	                // ��ʾ�к�
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
