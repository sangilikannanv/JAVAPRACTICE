package com.fss.test;

import com.fss.authverify.HttpAuthOkayConnect;
import com.fss.check.authstatus.CheckOkayAuthorizationStatus;
import com.fss.link.user.HttpOkayConnect;
public class Driver {

	public static void main(String[] args) throws Exception {
		
		//HttpOkayConnect.sendPushMsgToOkay();//first run this method  and comment others method
		HttpAuthOkayConnect.sendAuthPushMsgToOkay();//2nd run this and comments other method
		//CheckOkayAuthorizationStatus.checkOkayAuthStatus();//in last run this comment others
	}
}
