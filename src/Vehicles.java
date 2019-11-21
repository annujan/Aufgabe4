public class Vehicles {
    private int count=0 ;
    private Vehicle first;
    private Vehicle last;
    private Vehicle avtive;

    public void add (Vehicle vehicle) {
        if (count > 0 ) {

            last.setNext(vehicle);
            last = vehicle;
        } else {
            first= vehicle;
            last= vehicle;

        }
        count = count + 1 ;
    }
    public void reverse(){

    }




}


