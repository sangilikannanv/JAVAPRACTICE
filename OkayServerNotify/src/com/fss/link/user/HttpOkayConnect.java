package com.fss.link.user;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import com.fss.constant.OkayConstant;
import com.fss.hash.Hash256;

public class HttpOkayConnect {

	public static String sendPushMsgToOkay() throws ClientProtocolException, IOException, JSONException, NoSuchAlgorithmException
	{
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost("https://demostand.okaythis.com/gateway/link");
		post.setHeader("Content-type", "application/json");

		//String uuid=UUID.randomUUID().toString();
		String uuid="5577882000000300";
		String hashstr=OkayConstant.tenantId+uuid+OkayConstant.secret;
		JSONObject message = new JSONObject();
		message.put("tenantId", OkayConstant.tenantId);
		message.put("userExternalId",uuid);
		message.put("signature", Hash256.createHash256(hashstr));
		

		post.setEntity(new StringEntity(message.toString(), "UTF-8"));
		HttpResponse response = client.execute(post);
		String messageres = EntityUtils.toString(response.getEntity(),"UTF-8");
		System.out.println(messageres);
		System.out.println(message);
		return messageres;
	}
}
