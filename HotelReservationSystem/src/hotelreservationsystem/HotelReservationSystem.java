/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservationsystem;

/**
 *
 * @author LOH JYH YEONG
 */
public class HotelReservationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is system.");
        Room room1 = new Room();
        // before are int roomNum = room1.returnRoomNo(1000); to 
        int roomNum = room1.returnRoomNo(2000);
        System.out.println(roomNum);
    }
    
}
