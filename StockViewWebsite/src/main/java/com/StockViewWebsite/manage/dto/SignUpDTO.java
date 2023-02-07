package com.StockViewWebsite.manage.dto;

import org.springframework.stereotype.Repository;

@Repository
public class SignUpDTO {
	private String memberId;
	private String memberPw;
	private String memberName;
	private Integer memberBirth;
	
	public SignUpDTO() {}
	
	public SignUpDTO(String memberId, String memberPw) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
	}

	public SignUpDTO(String memberId, String memberPw, String memberName, Integer memberBirth) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberBirth = memberBirth;
	}
	@Override
	public String toString() {
		return "SignUpDTO [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName
				+ ", memberBirth=" + memberBirth + "]";
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Integer getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(Integer memberBirth) {
		this.memberBirth = memberBirth;
	}
	
	
}
