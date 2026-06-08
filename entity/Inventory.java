
package entity;


public class Inventory {
    
    private String productId;
    private int currentStock;
    
    public Inventory(String productId, int currentStock){
    this.currentStock = currentStock;
    this.productId = productId;
   
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }
 
    public boolean checkStock(int quantity){
        return quantity > 0 && currentStock >= quantity;
    }

    public boolean reduceStock(int quantity) {
        if (quantity <= 0) {
            return false;
        }

        if (currentStock >= quantity) {
            currentStock -= quantity;
            return true;
        }

        return false;
    }

    public void addStock(int quantity){
        if(quantity > 0){
            currentStock += quantity;
        }
    }

     public void updateStock(int newStock) {

        if(newStock >= 0){
            currentStock = newStock;
        }
    }

    public String toString(){
        return toString.format("Product ID: " + productId + ", Stock: " + currentStock;)
    }
    
    
}