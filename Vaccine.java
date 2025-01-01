abstract public class Vaccine {

   int age;
   String nationality;
   int dose = 0;

   public Vaccine(int age, String nationality) {
      this.age = age;
      this.nationality = nationality;
   }

   void firstDose() {
      //String user;
      if (age >= 18 && nationality == "indian") {
         System.out.println("you are eligible ");
         System.out.println("after vaccine you have to pay 250rs");
         dose = 1;

      } else {
         System.out.println("not eligible");
      }

   }

   void secondDose() {

      if (dose == 1) {
         System.out.println("you can take 2nd dose");
      } else {
         System.out.println("take 1st dose firstly...");
      }

   }

   abstract public void boosterDose();
}

class VaccinationSuccesful extends Vaccine {

   
   public VaccinationSuccesful(int age, String nationality) {
      super(age, nationality);

   }

   public void boosterDose() {

      if (dose == 1) {
         System.out.println("you can take booster Dose");
      } else {
         System.out.println("take 1st and 2nd  first");
      }
   }

}

class  Vaccination{

   public static void main(String[] args) {
      
      VaccinationSuccesful user = new VaccinationSuccesful(21,"indian");
      user.firstDose();
      user.secondDose();
      user.boosterDose();
   }
}