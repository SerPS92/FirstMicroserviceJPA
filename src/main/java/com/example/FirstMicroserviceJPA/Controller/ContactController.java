package com.example.FirstMicroserviceJPA.Controller;

import com.example.FirstMicroserviceJPA.Model.Contact;
import com.example.FirstMicroserviceJPA.Service.IContactService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    private final IContactService contactService;

    public ContactController(IContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping(value = "contacts", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Contact> show(){
        return contactService.findAll();
    }

    @GetMapping(value = "contacts/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Contact show(@PathVariable(name = "id") int id){
        return contactService.showContact(id);
    }

    @PostMapping(value = "contacts",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String addContact(@RequestBody Contact contact){
        return String.valueOf(contactService.addContact(contact));
    }

    @PutMapping(value = "contacts", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Contact contact){
        contactService.updateContact(contact);
    }

    @DeleteMapping(value = "contacts/{id}")
    public void deleteById(@PathVariable(name = "id") int id){
        contactService.deleteContact(id);
    }

}
