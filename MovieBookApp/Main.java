package MovieBookApp;

class BookTheatreSeat{

    int totalSeats = 10;
    void bookseat(int seats){

        if(totalSeats >= seats){
            System.out.println("Seats booked succesfully");
            totalSeats = totalSeats - seats;
            System.out.println("Seats left" + totalSeats);
        }else{
            System.out.println("Seats can not be booked ");
            System.out.println("Seats left " + totalSeats);
        }
    }
}



class MovieBookApp extends Thread{
static BookTheatreSeat book;
int seats;
public void run(){
    book.bookseat(seats);
}
}

public class Main {
    public static void main(String[] args) {

        BookTheatreSeat book = new BookTheatreSeat();

        MovieBookApp usman = new MovieBookApp();
        usman.seats = 7; // it sets the value
        usman.start();

        MovieBookApp furqan = new MovieBookApp();
        furqan.seats = 6; // it sets the value
        furqan.start();

    }
}
