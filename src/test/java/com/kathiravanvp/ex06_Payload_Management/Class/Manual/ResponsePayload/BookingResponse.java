package com.kathiravanvp.ex06_Payload_Management.Class.Manual.ResponsePayload;

import com.kathiravanvp.ex06_Payload_Management.Class.Manual.RequestPayload.Booking;

public class BookingResponse {
    private Integer bookingid;
    private Booking booking;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
