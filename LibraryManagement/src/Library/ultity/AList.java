package Library.ultity;

import Library.Main.SubMenu1;
import Library.Main.SubMenu2;

import java.util.Arrays;

public class AList {
    private Author[] authors;
    private int index = 0;
    private int defaultElements = 4;
    public AList(){
        this.authors = new Author[defaultElements];
    }

    public int getIndex() {
        return index;
    }

    public boolean add(Author a){
        if (searchAuthorById(a.getId()) == null){
            if (index == authors.length)
                authors = Arrays.copyOf(authors, authors.length + defaultElements);
            authors[index++] = a;
            System.out.println("Thêm thành công");
            return true;
        }
        System.out.println("Thêm thất bại");
        return false;
    }
    public void showAuthor(){
        for (int i = 0; i < index; i++){
            authors[i].displayAuthor();
        }
        System.out.println("Tổng số sách: "+index);
    }

    public boolean updateAuthor(Author a){
        if (authors[0] != null){
            for (int i = 0; i < index; i++){
                if (authors[i].getId().equals(a.getId())){
                    authors[i] = a;
                    System.out.println("Cập nhật thành công");
                    return true;

                }
            }
        }
        System.out.println("Cập nhật thất bại");
        return false;
    }

    public boolean delete(String id){
        if (authors[0] != null){
            Author a = searchAuthorById(id);
            if (a == null){
                System.out.println("Tác giả muốn xóa không tồn tại");
                return false;
            } else if (SubMenu2.getBooks().searchBookByAuthorId(id)){
                System.out.println("Tác giả đã có sách, không thể xóa");
                return false;
            } else {
                for (int i = 0; i < authors.length; i++){
                    if (authors[i] == a){
                        for (int j = i ; j < index-1; j++){
                            authors[j] = authors[j+1];
                        }
                        authors[index] = null;
                        index -= 1;
                        break;
                    }

                }
                System.out.println("Xóa thành công");
                return true;
            }

        }
        return false;

    }

    public Author searchAuthorById(String id){
        if (authors[0] != null){
            for (int i = 0; i < index; i++)
                if (authors[i].getId().equals(id)){
                    return authors[i];
                }
        }
        return null;
    }
}
