package com.fss.authverify;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import com.fss.constant.OkayConstant;
import com.fss.hash.Hash256;

public class HttpAuthOkayConnect {

	
	
	public static String sendAuthPushMsgToOkay() throws ClientProtocolException, IOException, JSONException, NoSuchAlgorithmException
	{
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost("https://demostand.okaythis.com/gateway/auth");
		post.setHeader("Accept", "application/json");
		post.setHeader("Content-Type", "application/json");
		String uuid="5643212000000011";//need to replace ur linked user uuid value  5577882000000300
		String hashstr=OkayConstant.tenantId+uuid+OkayConstant.guiHeader+OkayConstant.guiText+OkayConstant.BIOMETRIC_OK+OkayConstant.secret;
		//String json="{\"tenantId\":"+id+",\"userExternalId\":"+uuid.toString()+",\"type\":"+OkayConstant.OK+",\"authParams\":{\"guiText\": \"Do you okay this transaction\",\"guiHeader\": \"Authorization requested\"},\"signature\": "+Hash256.createHash256(hashstr).toString()+"}";
		
		  
		 Map<String, Object> obj = new LinkedHashMap<String, Object>();
		 obj.put("tenantId", 90008); 
		 obj.put("userExternalId",uuid);
		 obj.put("type",OkayConstant.BIOMETRIC_OK);
		 obj.put("authParams",getAuthParam());
		 obj.put("signature",Hash256.createHash256(hashstr));
		 JSONObject message = new JSONObject(obj);
		 System.out.println("Auth Request" +message);
			
		  StringEntity entity = new StringEntity(message.toString(), "UTF-8");
		  post.addHeader("Content-type","application/x-www-form-urlencoded");
		  entity.setContentType(ContentType.APPLICATION_JSON.getMimeType());
		  
		  post.setEntity(entity);
		  post.setHeader("Content-type", "application/json");
		  
		  HttpResponse resp = client.execute(post); 
		  System.out.println(resp);
		  String messageres = EntityUtils.toString(resp.getEntity(),"UTF-8");
			System.out.println(messageres);
			System.out.println(message);
		return messageres;	
		 
	}
			
			private static JSONObject getAuthParam() throws JSONException {
			    JSONObject authparams = new JSONObject();
			    authparams.put("guiText",OkayConstant.guiText);
				authparams.put("guiHeader",OkayConstant.guiHeader);
			    return authparams;
			}


}
