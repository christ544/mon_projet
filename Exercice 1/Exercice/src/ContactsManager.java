public class ContactsManager {
    contact [] myFriends;
    int friendsCount;
    public ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new contact[500];
    }
    void addContact(contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++; }

    contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}
