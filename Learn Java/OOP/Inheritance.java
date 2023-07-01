class People{
    String name;
}

class GoodPeople extends People{
    String deeds;
    public void showInfo(){
        System.out.println(this.name + " "+ this.deeds);
    }
}

public class Inheritance {
   public static void main(String args[]){
    GoodPeople g1 = new GoodPeople();
    g1.name = "Tanvir Tonoy";
    g1.deeds = "fucking innocent girls";
   
    g1.showInfo();
}
}
