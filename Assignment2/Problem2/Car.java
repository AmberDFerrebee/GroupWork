package Cars;



/**
 *
 * @author adferrebee
 * 2/09/2020
 */
public class Car {
    private String make;
    private String model;
    private String year;
    private String price;
    private CarOwner owner;
    
//No-args constructor
    public Car(){
    }
    
//constructor to initialize with known information
    public Car (String newMake, String newModel, String newYear, String newPrice, CarOwner newOwner){
      this.make = newMake;
      this.model = newModel;
      this.year = newYear;
      this.price = newPrice;
      this.owner = newOwner;
    }
    
// setters for all variables        
    public void setMake(String newMake){
        this.make = newMake;
    }
    public void setModel(String newModel){
        this.model = newModel;
    }
    public void setYear(String newYear){
        this.year = newYear;
    }
    public void setPrice(String newPrice){
        this.price = newPrice;
    }
    
    
//getters for all variables    
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getYear(){
        return year;
    }      
    public String getPrice(){
        return price;
    }
    
    public String getOwnerInfo(){
        String ownerInfo = (owner.getOwnerName() +" "+ owner.getAddress());
        
        return ownerInfo;
    }
}