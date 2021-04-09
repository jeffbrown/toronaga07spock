package toronaga07spock

class CalendarHelper {

    CalendarClient client

    void book(String message) {
        client.bookTimeSlot message
    }
}
