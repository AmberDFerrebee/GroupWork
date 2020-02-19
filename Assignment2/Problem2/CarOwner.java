package Cars;



/**
 *
 * @author adferrebee
 * 2/09/2020
 */
public class CarOwner {
    private String ownerName;
    private String address;
   
    
//No-args constructor
    public CarOwner(){
    }
  
//constructor to initialize with known information
    public CarOwner (String newOwnerName, String newAddress){
      this.ownerName = newOwnerName;
      this.address = newAddress;
    }
               
// setters for all variables        
    public void setOwnerName(String newOwnerName){
        this.ownerName = newOwnerName;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;
    }
    
// getters for all variables    
    public String getOwnerName(){
        return ownerName;
    }

    public String getAddress(){
        return address;
   }      
   



}
