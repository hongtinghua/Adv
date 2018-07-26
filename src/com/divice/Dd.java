package com.divice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	
public static String doPost(String url, Map params){
		
		BufferedReader in = null;  
        try {  
            // ����HttpClient  
            HttpClient client = new DefaultHttpClient();  
            // ʵ����HTTP����  
            HttpPost request = new HttpPost();  
            request.setURI(new URI(url));
            
            //���ò���
            List<NameValuePair> nvps = new ArrayList<NameValuePair>(); 
            for (Iterator iter = params.keySet().iterator(); iter.hasNext();) {
    			String name = (String) iter.next();
    			String value = String.valueOf(params.get(name));
    			nvps.add(new BasicNameValuePair(name, value));
    			
    			//System.out.println(name +"-"+value);
    		}
            request.setEntity(new UrlEncodedFormEntity(nvps,HTTP.UTF_8));
            
            HttpResponse response = client.execute(request);  
            int code = response.getStatusLine().getStatusCode();
            if(code == 200){	//����ɹ�
            	in = new BufferedReader(new InputStreamReader(response.getEntity()  
                        .getContent(),"utf-8"));
                StringBuffer sb = new StringBuffer("");  
                String line = "";  
                String NL = System.getProperty("line.separator");  
                while ((line = in.readLine()) != null) {  
                    sb.append(line + NL);  
                }
                
                in.close();  
                
                return sb.toString();
            }
            else{	//
            	System.out.println("״̬�룺" + code);
            	return null;
            }
        }
        catch(Exception e){
        	e.printStackTrace();
        	
        	return null;
        }
	}


}
