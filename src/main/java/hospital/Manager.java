package hospital;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manager {
	@Id
	private int id;
	private String name;
	private String Qualifiation;
	
	private int yoe;
	public int getId() {
		return id;
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
	public String getQualifiation() {
		return Qualifiation;
	}
	public void setQualifiation(String qualifiation) {
		Qualifiation = qualifiation;
	}
	public int getYoe() {
		return yoe;
	}
	public void setYoe(int yoe) {
		this.yoe = yoe;
	}

}
