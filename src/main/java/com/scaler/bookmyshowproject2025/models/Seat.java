package com.scaler.bookmyshowproject2025.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{

    private String seatName;
    private int rowVal;
    private int columnVal;
    @ManyToOne
    private SeatType seatType;

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

    public int getRowVal() {
        return rowVal;
    }

    public void setRowVal(int rowVal) {
        this.rowVal = rowVal;
    }

    public int getColumnVal() {
        return columnVal;
    }

    public void setColumnVal(int columnVal) {
        this.columnVal = columnVal;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }
}
