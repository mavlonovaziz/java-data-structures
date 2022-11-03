package sort;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List list = new ArrayList();
        Contact[] contacts = new Contact[3];
        contacts[0] = new Contact("azziz","123");
        contacts[1] = new Contact("jahon","123");
        contacts[2] = new Contact("sharif","123");

        Arrays.sort(contacts,Comparator.comparing(Contact::getName));

        System.out.println(Arrays.deepToString(contacts));
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("azziz","123"));
        contactList.add(new Contact("jahon","123"));
        contactList.add(new Contact("sharif","123"));
        Collections.sort(contactList);

        System.out.println(contactList);
    }
}
