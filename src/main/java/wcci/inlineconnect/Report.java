package wcci.inlineconnect;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Report {

	@Id
	@GeneratedValue
	private Long id;

	private String medicNum;
	private boolean hasChiefComplaint;
	private String report;

	private String bloodPressure;
	private String heartRate;
	private String spO2;
	private String respiratoryRate;
	private String GCS;
	private String bloodSugar;

	public Report(String medicNum, boolean hasChiefComplaint, String report, String bloodPressure, String heartRate,
			String spO2, String respiratoryRate, String gCS, String bloodSugar) {
		this.medicNum = medicNum;
		this.hasChiefComplaint = hasChiefComplaint;
		this.report = report;
		this.bloodPressure = bloodPressure;
		this.heartRate = heartRate;
		this.spO2 = spO2;
		this.respiratoryRate = respiratoryRate;
		GCS = gCS;
		this.bloodSugar = bloodSugar;
	}
	
	public Report() {
		
	}

	public Long getId() {
		return id;
	}

	public String getMedicNum() {
		return medicNum;
	}

	public boolean isHasChiefComplaint() {
		return hasChiefComplaint;
	}

	public String getReport() {
		return report;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public String getHeartRate() {
		return heartRate;
	}

	public String getSpO2() {
		return spO2;
	}

	public String getRespiratoryRate() {
		return respiratoryRate;
	}

	public String getGCS() {
		return GCS;
	}

	public String getBloodSugar() {
		return bloodSugar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Report other = (Report) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}