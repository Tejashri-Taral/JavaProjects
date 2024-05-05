public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to ATM");
        MachineFeatures machine=new MachineFeatures();
        Location location=new Location("India", "431606", "Maharashtra", "Nanded", "APZone", "Vishnupuri");
        CurrencyComposition composition=new CurrencyComposition(500, 500, 1000, 5000, 100000);
        User user=new User("Jannat", "431600", "9456721975", 25000, 436, 7, 2026);
        ATM atm=new ATM("3451286", location, composition);

        machine.checkUserBalance(user);
        machine.seeComposition(composition);
        machine.createATM(location,composition);
        composition=new CurrencyComposition(5, 10, 120, 100, 500);
        machine.updateATMLocation(atm,location);
        machine.updateATMComposition(atm,composition);
        machine.seeComposition(composition);

        machine.withdraw(3500,user,atm);
    }
    
}
