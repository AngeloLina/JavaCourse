package telran.data;

public class Dog {
    private String nickName;
    private int age;
    private String breed;
    private double weight;
    public boolean dogStatus;


    public Dog(){}

    public Dog(String nickName, int age, String breed, double weight) {
        this.nickName = nickName;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
    }

    public void dogSleep(){
        dogStatus = true;
    }

    public void dogRun(){
        dogStatus = false;
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void display(){
        System.out.println("Nickname: " + nickName);
        System.out.println("Breed: " + breed);
        System.out.println("Weight: " + nickName + "is: " + weight);
        System.out.println("Age: " + age);
        System.out.println(nickName + "  " + (dogStatus? "sleep":"run"));
    }

    @Override
    public String toString() {
        return "Dog: " +
                "nickName: " + nickName + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", dogStatus=" + dogStatus +
                '}';
    }
}
