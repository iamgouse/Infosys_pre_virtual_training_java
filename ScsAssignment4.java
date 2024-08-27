class Tester{
    public static void main(String[] args){
        char foodType = 'V';
        int quantity = 1 ;
        int distance = 7 ;
        int billAmount = calculateBill(foodType, quantity, distance);
        System.out.println(billAmount);
    }
    public static int calculateBill(char foodType, int quantity, int distance){
        if ((foodType != 'V' && foodType != 'N') || quantity < 1 || distance <=0){
            return -1;
        }
        int costPerPlate = (foodType == 'V') ? 12:15;
        int totalFoodCost = costPerPlate * quantity;
        int deliveryCharges = 0;
        
        if (distance > 3){
            if (distance<=6){
                deliveryCharges = (distance - 3) *1;
            }
            else{
                deliveryCharges = 3*1 + (distance - 6 ) * 2;
            }
        }
        int finalBill =  totalFoodCost + deliveryCharges;
        return finalBill;
    }
}
