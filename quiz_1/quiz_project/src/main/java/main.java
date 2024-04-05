import model.Contact;
import model.Email;
import model.PhoneNumber;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class main {


    public static void main(String[] args) throws JsonProcessingException {
        Contact contact = new Contact(1, "Tsogt", "Enkhbat", "TestCompany", "Front-End Developer");
        contact.addPhone(new PhoneNumber("641-555-9898", "Home"));
        contact.addPhone(new PhoneNumber("801-555-9999", "Work"));
        contact.addEmail(new Email("home.email@gmail.com", "Home"));
        contact.addEmail(new Email("work.email@gmail.com", "Work"));

        printContact(contact);
    }

    public static void printContact(Contact contact) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(contact);
        System.out.println(json);
    }
}
