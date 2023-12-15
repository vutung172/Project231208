package Library.ultity;

import java.util.Arrays;

public class Library {
    private Book[] books;
    private int index = 0;
    private int defaultElement = 4;

    public Library() {
        this.books = new Book[defaultElement];
    }

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }


    public int getIndex() {
        return index;
    }

    /*Method của sách*/
    public boolean addBook(Book b){
        if (searchBookById(b.getId()) == null){
            if(index == books.length)
                books = Arrays.copyOf(books,books.length + defaultElement);
            books[index++] = b;
            System.out.println("Thêm sách thành công");
            return true;
        }
        System.out.println("ID sách đã tồn tại");
        return false;
    }

    public void showBook(){
        for (int i = 0; i < index; i++){
            books[i].displayBook();
        }
    }

    public Book searchBookById(String id){
        if(books[0] != null){
            for (int i = 0; i < index; i++){
                if (books[i].getId().equals(id))
                    return books[i];
            }
        }
        return null;
    }

    public void searchBookByTitle(String key) {
        if (books[0] != null) {
            for (int i = 0; i < index; i++) {
                if (books[i].getTitle().contains(key)) {
                    books[i].displayBook();
                }
            }
        }
    }

    public void searchBookByAuthor(String key){
        if (books[0] != null){
            for(int i = 0; i < index; i++){
                if (books[i].getAuthor().getName().contains(key)){
                    books[i].displayBook();
                }
            }
        }
    }

    public boolean searchBookByAuthorId(String id){
        if (books[0] != null){
            for (int i =0; i < index; i++){
                if (books[i].getAuthor().getId().equals(id))
                    return true;
            }
        }
        return false;
    }

    public boolean updateBook(Book b){
        if (books[0] != null){
            for (int i = 0; i < index; i++){
                if (books[i].getId().equals(b.getId())){
                    books[i] = b;
                    System.out.println("Cập nhật thành công");
                    return true;

                }
            }
        }
        System.out.println("Cập nhật thất bại");
        return false;
    }
}
