package com.yhj.beanFactory;

public class SimplePostProcessor {

	private String maskString;
	private String account;
	private String password;


	public String getMaskString() {
		return maskString;
	}

	public void setMaskString(String maskString) {
		this.maskString = maskString;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("SimplePostProcessor{");
		sb.append("maskString='").append(maskString).append('\'');
		sb.append(", account='").append(account).append('\'');
		sb.append(", password='").append(password).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
