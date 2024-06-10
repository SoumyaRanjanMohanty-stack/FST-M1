public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car(){
        tyres = 4;
        doors = 4;
    }

    public void displayCharacteristics(){
        System.out.println("The color of your car is: "+ color);
        System.out.println("The transmission of your car is: "+ transmission);
        System.out.println("Your car is produced in: "+ make);
        System.out.println("Number of tyres your have: "+ tyres);
        System.out.println("Number of doors your Car have: "+ doors);
    }

    public void accelerate(){
        System.out.println(" The Car is moving forward");
    }

    public void brake(){
        System.out.println("The Car is stopped");
    }
}
