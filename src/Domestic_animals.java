public class Domestic_animals {
    private int weight;
    private int age;
    private String gender;
    private String nickName;

    public Domestic_animals(int weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return "Domestic_animals{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender +
                ", nickName='" + nickName +
                '}';
    }
}
