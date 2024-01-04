package hospital;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BranchDriver {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Hospital hospital = new Hospital();
		hospital.setId(1);
		hospital.setName("Appolo");
		hospital.setCeo("Prathap C Reddy");

		Branch branch1 = new Branch();
		branch1.setId(1);
		branch1.setName("Appolo Marathalli");
		branch1.setYoe(2016);

		Branch branch2 = new Branch();
		branch2.setId(2);
		branch2.setName("Appolo Kadugudi");
		branch2.setYoe(2018);

		Manager manager1 = new Manager();
		manager1.setId(1);
		manager1.setName("Prasanth");
		manager1.setQualifiation("10th");
		manager1.setYoe(2015);

		Manager manager2 = new Manager();
		manager2.setId(2);
		manager2.setName("Ravan");
		manager2.setQualifiation("12th");
		manager2.setYoe(2016);

		Address address1 = new Address();
		address1.setId(1);
		address1.setStreetname("Tulsi Theater road");
		address1.setLandmark("jspiders");
		address1.setCity("Bengaluru");
		address1.setPincode(560037);
		address1.setState("Karnataka");

		Address address2 = new Address();
		address2.setId(2);
		address2.setStreetname("Tulsi Cinemas");
		address2.setLandmark("jspider");
		address2.setCity("Bengaluru");
		address2.setPincode(560038);
		address2.setState("Karnatakaa");

		Doctor doctor1 = new Doctor();
		doctor1.setId(1);
		doctor1.setName("Raveesh");
		doctor1.setSpecialization("Mtech");
		doctor1.setYoe(2003);

		Doctor doctor2 = new Doctor();
		doctor2.setId(2);
		doctor2.setName("VaraPrasad");
		doctor2.setSpecialization("Multiple Degree holder");
		doctor2.setYoe(2009);

		Patient patient1 = new Patient();
		patient1.setId(1);
		patient1.setName("kishor");
		patient1.setAge(22);
		patient1.setMobileno(989898988);
		patient1.setBloodgroup("b-ve");

		Patient patient2 = new Patient();
		patient2.setId(2);
		patient2.setName("Santu");
		patient2.setAge(23);
		patient2.setMobileno(989777988);
		patient2.setBloodgroup("AB+ve");

		Diseases diseases1 = new Diseases();
		diseases1.setId(1);
		diseases1.setName("Matimarpu");
		diseases1.setSymptoms("he forgots everything like Ghajini");

		Diseases diseases2 = new Diseases();
		diseases2.setId(2);
		diseases2.setName("Corona");
		diseases2.setSymptoms("Cold, fever");

		List<Branch> branch = new ArrayList<Branch>();
		branch.add(branch1);
		branch.add(branch2);

		List<Patient> patient = new ArrayList<Patient>();
		patient.add(patient1);
		patient.add(patient2);

		List<Doctor> doctor = new ArrayList<Doctor>();
		doctor.add(doctor1);
		doctor.add(doctor2);

		
		List<Diseases> diseases = new ArrayList<Diseases>();
		diseases.add(diseases1);
		diseases.add(diseases2);

		

		branch1.setAddress(address1);
		branch2.setAddress(address2);

		branch1.setManager(manager1);
		branch2.setManager(manager2);

		branch1.setDoctor(doctor);
		branch1.setDoctor(doctor);

		patient1.setDiseases(diseases);
		patient2.setDiseases(diseases);
		
		branch1.setPatient(patient);
		branch1.setPatient(patient);

		
		
		hospital.setBranch(branch);
		hospital.setBranch(branch);

		et.begin();
		em.persist(hospital);
		
		em.persist(branch1);
		em.persist(branch2);

		em.persist(manager1);
		em.persist(manager2);

		em.persist(address1);
		em.persist(address2);

		em.persist(doctor1);
		em.persist(doctor2);

		em.persist(patient1);
		em.persist(patient2);

		em.persist(diseases1);
		em.persist(diseases2);

		et.commit();

	}

}
