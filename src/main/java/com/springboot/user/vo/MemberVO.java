package com.springboot.user.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@SequenceGenerator(
        name="MEMBER_SEQ_GEN",
        sequenceName="MEMBER_SEQ",
        initialValue=1,
        allocationSize=1
        )
@Data
@Entity
@Table(name="member")
public class MemberVO {
	  
	@Id
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="MEMBER_SEQ_GEN"        
			)
	
	@Column(name = "MEMBER_IDX")
	private int memberIdx;
	
	@Column(name = "MEMBER_ID")
	private String memberId;
	
	@Column(name = "MEMBER_PW")
	private String memberPw;
	
	@Column(name = "MEMBER_NAME")
	private String memberName;
	
	@Column(name = "MEMBER_EMAIL")
	private String memberEmail;

	public int getMemberIdx() {
		return memberIdx;
	}
	public void setMemberIdx(int memberIdx) {
		this.memberIdx = memberIdx;
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
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
    
    @Override
    public String toString() {
    	return "MemberVO [memberIdx=" + memberIdx + ", memberId=" + memberId + ", memberPw=" + memberPw
    			+ ", memberName=" + memberName + ", memberEmail=" + memberEmail + "]";
    }
}