package soal1;

public class Pet {
	private String name;
	private String breed;
	
	public Pet (String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public void display() {
		System.out.println("Detail Hewan Peliharaan:");
		System.out.println("Nama hewan peliharaanku adalah: " + name);
		System.out.println("Dengan ras: " + breed);
	}
}