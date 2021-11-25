package db4;

public class ProductDTO {
	private String prdNo;
	private String prdName;
	private int prdPrice;
	private String prdMaker;
	private String prdColor;
	private String ctgNo;
	
	// 매개변수가 있는 생성자
	public ProductDTO(String prdNo, String prdName, int prdPrice, String prdMaker, String prdColor, String ctgNo) {
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdMaker = prdMaker;
		this.prdColor = prdColor;
		this.ctgNo = ctgNo;
		
		
		}

	public String getPrdNo() {
		return prdNo;
	}

	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public int getPrdPrice() {
		return prdPrice;
	}

	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}

	public String getPrdMaker() {
		return prdMaker;
	}

	public void setPrdMaker(String prdMaker) {
		this.prdMaker = prdMaker;
	}

	public String getPrdColor() {
		return prdColor;
	}

	public void setPrdColor(String prdColor) {
		this.prdColor = prdColor;
	}

	public String getCtgNo() {
		return ctgNo;
	}

	public void setCtgNo(String ctgNo) {
		this.ctgNo = ctgNo;
	}
};
		
	//Setters/Getters
		// setxxx(): 멤버변수에 값을 저장할 때 사용
		// getxxx(): 멤버변수의 값을 반환해줄 때 사용

	
	