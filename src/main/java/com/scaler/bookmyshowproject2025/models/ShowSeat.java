package com.scaler.bookmyshowproject2025.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {

    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    private ShowSeatStatus status;
    private Date blockedAt;
}
