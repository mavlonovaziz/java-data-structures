public class User {
    private int age;
    private String shortName;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", shortName='" + shortName + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public User(int age, String shortName) {
        this.age = age;
        this.shortName = shortName;
    }
}
