package gr.hua.dit.ds.tsidimaempena.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Request {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer Id;

    @Column
    private String appointmentDate;

    public Integer getId() {
        return Id;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Request() {
    }

    public Request(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "Request{" +
                "Id=" + Id +
                ", appointmentDate=" + appointmentDate +
                '}';
    }
}
