
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	//Code Re-Use
	public String toString(){
		String info = super.toString();
		return String.format("%-65s %-20s", info, this.os);
	}
}


