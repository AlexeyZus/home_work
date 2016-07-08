package full_work.home_work_1;

import java.util.ArrayList;

/**
 * Task6_object
 * class NoteBook -
 *
 */
public class Task6_object {

    public static void main(String[] args) {
        NoteBook noteBook = new Task6_object().new NoteBook();

        noteBook.addNote("asd");
        noteBook.addNote("qwe");
        noteBook.addNote("ert");
        noteBook.addNote("sdf");

        noteBook.removeNote(2);

        noteBook.lookAllNote();
    }

    /**
     * class Note contain one variable and constructor:
     * "value - save data entered by user";
     */
    private class Note {
        String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Note(String value) {
            this.value = value;
        }
    }

    /**
     * class NoteBook contain one parameter:
     * list - save all note in massive;
     * removeNote(i) - remove i note from list massive
     * addNote() - add note from list massive
     * editNote(i) - edit note element from list massive
     * lookAllNote(i) - look all notes from massive
     */

    public class NoteBook{

        public NoteBook() {
        }

        private ArrayList<Note> list = new ArrayList();

        public void addNote(String note){
            list.add(new Note(note));
        }

        public void removeNote(int i){
            list.remove(i);
        }

        public void editNote(int i){
            list.get(i);
            String edit_note = list.get(i).getValue();
            /* something operation*/
            list.get(i).setValue(edit_note);
        }



        public void lookAllNote(){
            for (Note note : list
                 ) {
                System.out.println(note.value);
            }

        }
    }

}
