package jsf.entidades;

// Generated 10-jul-2015 18:56:30 by Hibernate Tools 4.3.1

/**
 * EmpDetailsViewId generated by hbm2java
 */
public class EmpDetailsViewId implements java.io.Serializable {

	private int employeeId;
	private String jobId;
	private int managerId;
	private int departmentId;
	private int locationId;
	private String countryId;
	private String firstName;
	private String lastName;
	private int salary;
	private int commissionPct;
	private String departmentName;
	private String jobTitle;
	private String city;
	private String stateProvince;
	private String countryName;
	private String regionName;

	public EmpDetailsViewId() {
	}

	public EmpDetailsViewId(int employeeId, String jobId, String lastName,
			String departmentName, String jobTitle, String city) {
		this.employeeId = employeeId;
		this.jobId = jobId;
		this.lastName = lastName;
		this.departmentName = departmentName;
		this.jobTitle = jobTitle;
		this.city = city;
	}

	public EmpDetailsViewId(int employeeId, String jobId, int managerId,
			int departmentId, int locationId, String countryId,
			String firstName, String lastName, int salary, int commissionPct,
			String departmentName, String jobTitle, String city,
			String stateProvince, String countryName, String regionName) {
		this.employeeId = employeeId;
		this.jobId = jobId;
		this.managerId = managerId;
		this.departmentId = departmentId;
		this.locationId = locationId;
		this.countryId = countryId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.commissionPct = commissionPct;
		this.departmentName = departmentName;
		this.jobTitle = jobTitle;
		this.city = city;
		this.stateProvince = stateProvince;
		this.countryName = countryName;
		this.regionName = regionName;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getManagerId() {
		return this.managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getLocationId() {
		return this.locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommissionPct() {
		return this.commissionPct;
	}

	public void setCommissionPct(int commissionPct) {
		this.commissionPct = commissionPct;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return this.stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EmpDetailsViewId))
			return false;
		EmpDetailsViewId castOther = (EmpDetailsViewId) other;

		return (this.getEmployeeId() == castOther.getEmployeeId())
				&& ((this.getJobId() == castOther.getJobId()) || (this
						.getJobId() != null && castOther.getJobId() != null && this
						.getJobId().equals(castOther.getJobId())))
				&& (this.getManagerId() == castOther.getManagerId())
				&& (this.getDepartmentId() == castOther.getDepartmentId())
				&& (this.getLocationId() == castOther.getLocationId())
				&& ((this.getCountryId() == castOther.getCountryId()) || (this
						.getCountryId() != null
						&& castOther.getCountryId() != null && this
						.getCountryId().equals(castOther.getCountryId())))
				&& ((this.getFirstName() == castOther.getFirstName()) || (this
						.getFirstName() != null
						&& castOther.getFirstName() != null && this
						.getFirstName().equals(castOther.getFirstName())))
				&& ((this.getLastName() == castOther.getLastName()) || (this
						.getLastName() != null
						&& castOther.getLastName() != null && this
						.getLastName().equals(castOther.getLastName())))
				&& (this.getSalary() == castOther.getSalary())
				&& (this.getCommissionPct() == castOther.getCommissionPct())
				&& ((this.getDepartmentName() == castOther.getDepartmentName()) || (this
						.getDepartmentName() != null
						&& castOther.getDepartmentName() != null && this
						.getDepartmentName().equals(
								castOther.getDepartmentName())))
				&& ((this.getJobTitle() == castOther.getJobTitle()) || (this
						.getJobTitle() != null
						&& castOther.getJobTitle() != null && this
						.getJobTitle().equals(castOther.getJobTitle())))
				&& ((this.getCity() == castOther.getCity()) || (this.getCity() != null
						&& castOther.getCity() != null && this.getCity()
						.equals(castOther.getCity())))
				&& ((this.getStateProvince() == castOther.getStateProvince()) || (this
						.getStateProvince() != null
						&& castOther.getStateProvince() != null && this
						.getStateProvince()
						.equals(castOther.getStateProvince())))
				&& ((this.getCountryName() == castOther.getCountryName()) || (this
						.getCountryName() != null
						&& castOther.getCountryName() != null && this
						.getCountryName().equals(castOther.getCountryName())))
				&& ((this.getRegionName() == castOther.getRegionName()) || (this
						.getRegionName() != null
						&& castOther.getRegionName() != null && this
						.getRegionName().equals(castOther.getRegionName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEmployeeId();
		result = 37 * result
				+ (getJobId() == null ? 0 : this.getJobId().hashCode());
		result = 37 * result + this.getManagerId();
		result = 37 * result + this.getDepartmentId();
		result = 37 * result + this.getLocationId();
		result = 37 * result
				+ (getCountryId() == null ? 0 : this.getCountryId().hashCode());
		result = 37 * result
				+ (getFirstName() == null ? 0 : this.getFirstName().hashCode());
		result = 37 * result
				+ (getLastName() == null ? 0 : this.getLastName().hashCode());
		result = 37 * result + this.getSalary();
		result = 37 * result + this.getCommissionPct();
		result = 37
				* result
				+ (getDepartmentName() == null ? 0 : this.getDepartmentName()
						.hashCode());
		result = 37 * result
				+ (getJobTitle() == null ? 0 : this.getJobTitle().hashCode());
		result = 37 * result
				+ (getCity() == null ? 0 : this.getCity().hashCode());
		result = 37
				* result
				+ (getStateProvince() == null ? 0 : this.getStateProvince()
						.hashCode());
		result = 37
				* result
				+ (getCountryName() == null ? 0 : this.getCountryName()
						.hashCode());
		result = 37
				* result
				+ (getRegionName() == null ? 0 : this.getRegionName()
						.hashCode());
		return result;
	}

}
