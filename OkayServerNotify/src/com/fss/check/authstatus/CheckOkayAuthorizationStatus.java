package com.fss.check.authstatus;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
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

public class CheckOkayAuthorizationStatus {

	
	public static boolean checkOkayAuthStatus() throws JSONException, NoSuchAlgorithmException, ClientProtocolException, IOException
	{
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost("https://demostand.okaythis.com/gateway/check");
		post.setHeader("Accept", "application/json");
		post.setHeader("Content-Type", "application/json");
		JSONObject message=new JSONObject();
		String sessionExternalId="500186";//need to replace with ur sessionexternalid
	    String hashstr=OkayConstant.tenantId+sessionExternalId+OkayConstant.secret;
	    message.put("tenantId",OkayConstant.tenantId);
		message.put("sessionExternalId",sessionExternalId);
		message.put("signature",Hash256.createHash256(hashstr));
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
		if(resp.getStatusLine().getStatusCode()==HttpStatus.SC_OK)
		{
			return true;
		}
		else
			return false;
		
	}
}
