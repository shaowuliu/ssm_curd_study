package com.lsw.curd.bean;

public class Employee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_emp.enp_id
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    private Integer enpId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_emp.emp_name
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    private String empName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_emp.gender
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_emp.email
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_emp.d_id
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    private Integer dId;

    /*这里是id对应的部门*/

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    private String deptName;
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_emp.enp_id
     *
     * @return the value of tbl_emp.enp_id
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    public Integer getEnpId() {
        return enpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_emp.enp_id
     *
     * @param enpId the value for tbl_emp.enp_id
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    public void setEnpId(Integer enpId) {
        this.enpId = enpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_emp.emp_name
     *
     * @return the value of tbl_emp.emp_name
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_emp.emp_name
     *
     * @param empName the value for tbl_emp.emp_name
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_emp.gender
     *
     * @return the value of tbl_emp.gender
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_emp.gender
     *
     * @param gender the value for tbl_emp.gender
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_emp.email
     *
     * @return the value of tbl_emp.email
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_emp.email
     *
     * @param email the value for tbl_emp.email
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_emp.d_id
     *
     * @return the value of tbl_emp.d_id
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    public Integer getdId() {
        return dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_emp.d_id
     *
     * @param dId the value for tbl_emp.d_id
     *
     * @mbg.generated Thu Jan 07 10:32:54 CST 2021
     */
    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Employee(Integer enpId, String empName, String gender, String email, Integer dId) {
        this.enpId = enpId;
        this.empName = empName;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
    }

    public Employee() {
    }


}