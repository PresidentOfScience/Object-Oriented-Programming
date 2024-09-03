
public class StudentCourseManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentA = new Student();
		studentA.setName("Iqbal");
		Course courseA = new Course();
		courseA.setCourseName("IPA");
		Course courseB = new Course();
		courseB.setCourseName("IPS");
		
		Course[] takenCourse = {courseA, courseB};
		
		studentA.setTakenCourse(takenCourse);
		
		System.out.println("Siswa " + studentA.getName() + " takes Course : " + studentA.getTakenCourseDesc());
		
		
		// Pemilu
		Partai pdip = new Partai();
		pdip.setNamaPartai("PDIP");
		
		Partai gerindra = new Partai();
		gerindra.setNamaPartai("Gerindra");
		
		Partai nasdem = new Partai();
		nasdem.setNamaPartai("NASDEM");
		
		Person capres1 = new Person();
		Person capres2 = new Person();
		Person capres3 = new Person();
		
		capres1.setPersonName("Ganjar");
		capres2.setPersonName("Prabowo");
		capres3.setPersonName("Anies");
		
		// Pendaftaran
		pdip.setCapres(capres1);
		gerindra.setCapres(capres2);
		nasdem.setCapres(capres3);
		
		System.out.println("Capres Partai " + pdip.getNamaPartai() + " adalah " + pdip.getCapres().personName);
		System.out.println("Capres Partai " + gerindra.getNamaPartai() + " adalah " + gerindra.getCapres().personName);
		System.out.println("Capres Partai " + nasdem.getNamaPartai() + " adalah " + nasdem.getCapres().personName);
	}

}
