public class Employee {
    private String name;
    private String juicyInfo;
    private String telephone;


    @Override
    public String toString() {
        return "Employee [name=" + name + ", juicyInfo=" + juicyInfo + ", telephone=" + telephone
                + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJuicyInfo() {
        return juicyInfo;
    }

    public void setJuicyInfo(String juicyInfo) {
        this.juicyInfo = juicyInfo;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
