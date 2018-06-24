package org.nc.school.model;

/**
 * @ClassName: Student
 * @Description: 学生实体类
 * @author nc
 * @date 2018/6/21 08:59
 */
public class Student implements java.io.Serializable {

    private String id;

    private String access;

    private String password;

    private String name;

    private String sex;

    private Integer telephone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access == null ? null : access.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }
}