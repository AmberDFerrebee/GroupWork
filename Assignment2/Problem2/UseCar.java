import Cars.Car;
import java.util.*;
import Cars.CarOwner;


        
/**
 *
 * @author adferrebee
 * 2/13/2020
 */
public class UseCar {

    public static void displayInfo(ArrayList<Car> list){     
        System.out.println("_______________________________________________________________________________________________________");
        System.out.println("Make     Model         Year      Price            Owner Information                              ");
        System.out.println("_______________________________________________________________________________________________________");
             
        for(Car a : list){
            System.out.printf("%-8s %-12s  %-8s  %-15s  %-8s  \n",a.getMake(),a.getModel(), a.getYear(), a.getPrice(),a.getOwnerInfo());
            System.out.println();
        }
    }  
    public static void main(String[] args) {
        
        CarOwner owner1 = new CarOwner ("John Smith", "156 Tardis Way, Galifrey, IN 93418");
        CarOwner owner2 = new CarOwner ("River Solo", "9393 Tattooine Lane, Skywalker, WV 26662");
        
        Car car1 = new Car ("Chevy", "Camero", "1968", "$12,390.57", owner1);
        Car car2 = new Car ("DMC", "DeLorean", "1981", "$3,455.60", owner2);
        Car car3 = new Car ("Chevy", "Impala", "1967", "$15,000.74", owner1);
        

        
       ArrayList<Car> carList = new ArrayList<Car>();
         carList.add(car1);
         carList.add(car2);
         carList.add(car3);
         
       displayInfo(carList); 
       
       owner1.setOwnerName("Bob Ross");
       CarOwner owner3 = new CarOwner ("Sherlock McGee", "418 Baker St, Butte, MT 15693");
       Car car4 = new Car ("Renault", "LeCar", "1986", "$500.00", owner3);
       carList.add(car4);
       
       
        displayInfo(carList);
         
    }    
    
}
    


   
    
    

 