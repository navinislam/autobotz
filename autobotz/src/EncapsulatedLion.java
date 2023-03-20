
class EncapLion extends Animal  {
    //    Encapsulation begins here, every var is private and must have a getter and setter as seen below
    private String name;
    private int age;
    private String color;

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public int getAge(){
        return this.age;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public String getColor(){
        return this.color;
    }


}

class EncapMakeLion{
    public static void main(String[] args) {

        EncapLion mahir = new EncapLion();
        mahir.setName("Mahir Ahmed");
        mahir.setAge(28);
        mahir.setColor("Gold");
        System.out.println("Creating a lion named " + mahir.getName() + " of age " + mahir.getAge() + " of color " + mahir.getColor());

    }

}



