package Array.entity;

public class starSign {
	
	//field
	 private String type;
	 private String sign;
	
	 //constructor
	 public starSign(String type, String sign) {
			this.type = type;
			this.sign = sign;
		}

	 //method
	 public String show() {
		 return "種類:"+type+",星座:"+sign;
	 }

	



	

}
