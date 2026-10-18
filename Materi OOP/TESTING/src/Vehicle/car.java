package Vehicle;

public class car extends vehicle {
        private int seat;

        public car(String nameInput, int fuelInput, int kiloInput, int seat){
            super(nameInput, fuelInput, kiloInput);
            this.seat = seat;
        }

        public void display(){
            super.display();
            System.out.println("Seat : " + this.seat + " seat(s)");
        }

        public void setSeat(int newSeat){
            this.seat = newSeat;
        }
}
