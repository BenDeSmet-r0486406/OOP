package domain;

public class Fish {
	private String type;
	private String nickname;
	private double weight;
	private double length;
	
	public Fish(String type, double weight, double length) {
		this.setType(type);
		this.setWeight(weight);
		this.setLength(length);
	}
	
	public Fish(String type, String nickname, double weight, double length) {
		this.setType(type);
		this.setNickname(nickname);
		this.setWeight(weight);
		this.setLength(length);
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		if (type.trim().isEmpty()){
			throw new DomainException("fish type must not be empty");
		}
		this.type = type;
	}
	
	public String getNickname() {
		if(this.nickname== null){
			return "this fish has no nickname";
		}
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		if (0.001 > weight || weight > 2000){
			throw new DomainException("the weight must be between 0.001 kg and 2000 kg ");
		}
		this.weight = weight;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		if (1 > length || length > 10000){
			throw new DomainException("the length must be between 1 cm and 10000 cm ");
		}
		this.length = length;
	}
}
