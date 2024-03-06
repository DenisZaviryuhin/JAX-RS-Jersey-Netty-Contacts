package org.example.app.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "contact_name")
    private String contactName;
    @Column(name = "phone")
    private String phone;

    public Contact() {
    }

    public Contact(Long id, String contactName, String phone) {
        this.id = id;
        this.contactName = contactName;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\" : " + id +
                ", \"contact_name\" : \"" + contactName + "\"" +
                ", \"phone\" : \"" + phone + "\"" +
                "}";
    }
}
