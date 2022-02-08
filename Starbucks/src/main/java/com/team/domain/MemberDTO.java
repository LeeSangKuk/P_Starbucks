package com.team.domain;

public class MemberDTO {
	String userId;
	String userPw;
	String userName;
	String userGender;
	String userBirthYear;
	String userBirthMonth;
	String userBirthDay;
	String userBirthFlag;
	String userPhone;
	String userEmail;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserBirthYear() {
		return userBirthYear;
	}
	public void setUserBirthYear(String userBirthYear) {
		this.userBirthYear = userBirthYear;
	}
	public String getUserBirthMonth() {
		return userBirthMonth;
	}
	public void setUserBirthMonth(String userBirthMonth) {
		this.userBirthMonth = userBirthMonth;
	}
	public String getUserBirthDay() {
		return userBirthDay;
	}
	public void setUserBirthDay(String userBirthDay) {
		this.userBirthDay = userBirthDay;
	}
	public String getUserBirthFlag() {
		return userBirthFlag;
	}
	public void setUserBirthFlag(String userBirthFlag) {
		this.userBirthFlag = userBirthFlag;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "MemberDTO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userGender="
				+ userGender + ", userBirthYear=" + userBirthYear + ", userBirthMonth=" + userBirthMonth
				+ ", userBirthDay=" + userBirthDay + ", userBirthFlag=" + userBirthFlag + ", userPhone=" + userPhone
				+ ", userEmail=" + userEmail + "]";
	}

}
