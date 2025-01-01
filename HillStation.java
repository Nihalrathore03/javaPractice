public class HillStation{
    void Location(){
        System.out.println("At Mountains");
    }

    void famousFor(){
        System.out.println(" beauty of the MOuntains");
    }

}

class Manali extends HillStation{

    void Location(){
        System.out.println("At Himachal Pradesh");
    }

    void famousFor(){
        System.out.println(" Famous for Snow ");
    }

}
class Mussoorie extends HillStation{
    void Location(){
        System.out.println("At Uttrakhand");
    }

    void famousFor(){
        System.out.println(" beauty of the MOuntains And Treking");
    }


}
class Gulmarg extends HillStation{
    void Location(){
        System.out.println("At Jammu & kashmir");
    }

    void famousFor(){
        System.out.println(" Famous For The  Skiing");
    }

}

 class M{

    public static void main(String[] args) {
        HillStation hillStation;
        hillStation=new Manali();
        hillStation.Location();



        hillStation = new Mussoorie();
        hillStation.Location();
        hillStation.famousFor();


        hillStation=new Gulmarg();
        hillStation.Location();
        hillStation.famousFor();


        System.out.println("///////////////////////////////////////////////");

        Manali m1 = new Manali();
        m1.Location();
        m1.famousFor();


        Mussoorie m2 = new Mussoorie();
        m2.Location();
        m2.famousFor();


        Gulmarg g1 = new Gulmarg();
        g1.Location();
        g1.famousFor();

    }
}