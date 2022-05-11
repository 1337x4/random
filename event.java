public class Event {
    private String eCode;
    private int guest;
    private double price;

    public Event(String eCode, int guest){
        this.eCode = eCode;
        setGuest(guest);

    }
    
    public void setCode(String newCode, int price) {
        newCode = eCode;       
    }
    public void setGuest(int guest) {
         this.guest= guest;
         price = guest*10;
        if(guest>50){
            price  = price * 0.90;  
        }
        
    }
   public double getPrice() {
       return price;
   }
   public boolean isCrowded(int newGuest) {
       if (newGuest>100) {
        return true;
       }
        else return false;
    }
   public void printer() {
     System.out.println("The Event code is: "+eCode);
     System.out.println("The guest number is: "+guest);
     System.out.println("The price is: BD "+price);
   }  
    
}
