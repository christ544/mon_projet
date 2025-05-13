public class Main {
    public static void main(String [] args) {
        ContactsManager myContactsManager = new
                ContactsManager();
        contact cc1 = new contact();
        cc1.name = "Tyler";
        cc1.phonename = "01040708";
        myContactsManager.addContact(cc1);

        contact cc2 = new contact();
        cc2.name = "chase";
        cc2.phonename = "01040709";
        myContactsManager.addContact(cc2);

        contact cc3 = new contact();
        cc3.name = "koda";
        cc3.phonename = "01040748";

        contact cc4 = new contact();
        cc4.name = "Ryley";
        cc2.phonename = "01020709";
        myContactsManager.addContact(cc4);

        contact cc5 = new contact();
        cc5.name = "shelby";
        cc2.phonename = "01040707";
        myContactsManager.addContact(cc5);

        myContactsManager.addContact(cc3);
        System.out.println("le nom est : " + myContactsManager.searchContact("Tyler").name);
        System.out.println("son numero est : " + myContactsManager.searchContact("Tyler").phonename);
    }

}
