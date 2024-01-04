package hospital;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Patient {

	@Id
	private int id;
	private String name;
	private int age;
	private long mobileno;
	private String bloodgroup;

	@ManyToMany
	private List<Diseases> diseases;

	public int getId() {
		return id;
	}

	public List<Diseases> getDiseases() {
		return diseases;
	}

	public void setDiseases(List<Diseases> diseases) {
		this.diseases = diseases;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

}
