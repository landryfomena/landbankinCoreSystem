package com.example.landbanking.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ManyToAny;

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId ;
	private String userName;
	private String userEmail;
	private String userIdCard;
	private String userPicture;
	private String userIdpicture;
	private String userPhoneNumber;
	private UserStatus userStatus ;
	
	@ManyToAny( fetch =  FetchType.EAGER, metaColumn = @Column)
	private List<Transaction> userTransactions; 

	public User(Long userId, String userName, String userEmail, String userIdCard, String userPicture,
			String userIdpicture, String userPhoneNumber, UserStatus userStatus, List<Transaction> userTransactions) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userIdCard = userIdCard;
		this.userPicture = userPicture;
		this.userIdpicture = userIdpicture;
		this.userPhoneNumber = userPhoneNumber;
		this.userStatus = userStatus;
		this.userTransactions = userTransactions;
	}

	public User() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserIdCard() {
		return userIdCard;
	}

	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}

	public String getUserPicture() {
		return userPicture;
	}

	public void setUserPicture(String userPicture) {
		this.userPicture = userPicture;
	}

	public String getUserIdpicture() {
		return userIdpicture;
	}

	public void setUserIdpicture(String userIdpicture) {
		this.userIdpicture = userIdpicture;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public UserStatus getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}

	public List<Transaction> getUserTransactions() {
		return userTransactions;
	}

	public void setUserTransactions(List<Transaction> userTransactions) {
		this.userTransactions = userTransactions;
	}
	
	
	
	
	
	
	
	


}
