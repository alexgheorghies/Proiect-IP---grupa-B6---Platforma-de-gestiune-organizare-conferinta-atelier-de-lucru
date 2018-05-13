package GPartPack;

import com.sun.org.apache.xpath.internal.operations.String;

public class Author {

    private String firstName,lastName,association,organization,university,faculty,email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAssociation() {
        return association;
    }

    public void setAssociation(String association) {
        this.association = association;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public java.lang.String toString() {
        return "Author{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", association=" + association +
                ", organization=" + organization +
                ", university=" + university +
                ", faculty=" + faculty +
                ", email=" + email +
                '}';
    }
}
