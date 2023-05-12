package com.example.demo.entity;
import javax.persistence.*;
@Entity
@Table(name = "Users")
public class Users {
    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "uid")
	    private int uid;
	    
	    @Column(name = "uname")
	    private String uname;
	    
	    @Column(name = "uemail")
	    private String uemail;
	    
	    @Column(name = "upassword")
	    private String upassword;
	    
	    @Column(name = "umobile")
	    private String umobile;
	    
	    @Column(name = "ucountry")
	    private String ucountry;

	    
		public Users() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Users(int uid, String uname, String uemail, String upassword, String umobile, String ucountry) {
			super();
			this.uid = uid;
			this.uname = uname;
			this.uemail = uemail;
			this.upassword = upassword;
			this.umobile = umobile;
			this.ucountry = ucountry;
		}


		public int getUid() {
			return uid;
		}


		public void setUid(int uid) {
			this.uid = uid;
		}


		public String getUname() {
			return uname;
		}


		public void setUname(String uname) {
			this.uname = uname;
		}


		public String getUemail() {
			return uemail;
		}


		public void setUemail(String uemail) {
			this.uemail = uemail;
		}


		public String getUpassword() {
			return upassword;
		}


		public void setUpassword(String upassword) {
			this.upassword = upassword;
		}


		public String getUmobile() {
			return umobile;
		}


		public void setUmobile(String umobile) {
			this.umobile = umobile;
		}


		public String getUcountry() {
			return ucountry;
		}


		public void setUcountry(String ucountry) {
			this.ucountry = ucountry;
		}


		@Override
		public String toString() {
			return "Users [uid=" + uid + ", uname=" + uname + ", uemail=" + uemail + ", upassword=" + upassword
					+ ", umobile=" + umobile + ", ucountry=" + ucountry + "]";
		}
		
		
}
