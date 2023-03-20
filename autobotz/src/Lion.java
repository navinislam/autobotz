


class Lion  extends Animal {
//CLASS WITH FORCED PARAMETER CONSTRUCTOR
    private String name;
    int age;
    String color = "blue";

    Lion(String name, int age, String color){
//        This is a constructor that forces you to input parameters
//        "this.blah" is a keyword in Java that says for "this" INSTANCE of the class you created, its parameters are x,y,z, etc
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void setName(String newname){
        this.name = newname;
    }

    public String getName(){
        return this.name;
    }

}

class MakeLion{

    public static void main(String[] args) {

        Lion mahir = new Lion("mahir",28,"yellow"); // reference to line 8-12
        System.out.println("Creating a lion named " + mahir.getName() + " of age " + mahir.age + " of color " + mahir.color);

        mahir.setName("Mahir Ahmed");
        System.out.println("Updated a lion named " + mahir.getName() + " of age " + mahir.age + " of color " + mahir.color);

    }

}

// OUTPUT
// Creating a lion named mahir of age 28 of color yellow
// You created an INSTANCE of a lion called "mahir" where you were REQUIRED by the Lion class to give some default parameters

// Updated a lion named Mahir Ahmed of age 28 of color yellow
// You updated the Lion INSTANCE to change its name to Mahir Ahmed using a SETTER (setName) and then got the updated name using a GETTER
// (getName)


class Wolf{
    private String name;
    int age;
    String color;
// There are no forced parameters, so when you create this new wolf it will dwfault to null or 0 for its values
    public void setName(String newname){
        this.name = newname;
    }

    public String getName(){
        return this.name;
    }
}



class MakeWolf{

    public static void main(String[] args) {

        Wolf mahir = new Wolf(); // reference to line 51
        System.out.println("Creating a lion named " + mahir.getName() + " of age " + mahir.age + " of color " + mahir.color);

        mahir.setName("Mahir Ahmed");
        System.out.println("Updated a lion named " + mahir.getName() + " of age " + mahir.age + " of color " + mahir.color);

    }

//    OUTPUT
//Creating a lion named null of age 0 of color null
//Updated a lion named Mahir Ahmed of age 0 of color null
// This is because in the Wolf class, there are no defaults set for what a wolf is and youre not forced to put defaults either
}