package com.internousdev.ecsite.dto;

public class LoginDTO {

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private boolean loginFlg = false;

	public String getLoginId() {
		return loginUserId;
	}

	public void setLoginId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public boolean getLoginFlg(){
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}

}

//3h-20p-22p