package com.company;

import java.util.Arrays;

class LibraryManager{
    String [] availableBooks = new String[100];
    String [] issuedBooks = new String[100];

    public int pushToArray(String [] array,String book){
        for (int i =0; i<array.length;i++){

            if (array[i]==null){
                array[i]=book;
                return 1;
            }
        }
        return 0;

    }

    public int addBook(String bookname){
        boolean contain = Arrays.asList(availableBooks).contains(bookname);
        if (contain) return 2;
        int flag = pushToArray(availableBooks,bookname);
        if (flag==1){
            return 1;
        }
        return 0;
    }

    public int issueBook(String bookname){
        int idx = Arrays.asList(availableBooks).indexOf(bookname);
        if (idx>=0){
            int flag = pushToArray(issuedBooks,bookname);

            if (flag==1){
                availableBooks[idx]=null;
                return 1;
            }

        }
        return 0;
    }
    public int returnBook(String bookname){
        int idx = Arrays.asList(issuedBooks).indexOf(bookname);
        if (idx>=0){
            int flag = pushToArray(availableBooks,bookname);
            if (flag==1){
                issuedBooks[idx]=null;
                return 1;
            }
        }
        return 0;
    }
    public void showAvailableBooks(){
        System.out.println(" Following are the books available for Issuing ");
        for (String str : availableBooks){
            if (str==null){
                continue;
            }
            System.out.print(" "+str+" , ");
        }
        System.out.println();
    }
    public String inventoryFiller(String ...Books){
        StringBuilder leftover = new StringBuilder();
        for (String str : Books){
            int check = addBook(str);
            if (check==0){
                leftover.append(" , ").append(str);
            }
        }
        return leftover.toString();
    }
}
public class Java_51_LibraryManager {
    public static void main(String[] args) {
        LibraryManager galgotia = new LibraryManager();
        String leftover = galgotia.inventoryFiller("abc","abcd","abcde","abcdef","abcdefg","abcdefgh","abcdefghi");
        if (leftover != null){
            System.out.println("These books were not added : "+ leftover);
        }

        galgotia.showAvailableBooks();
        String book="abc";
        int flag = galgotia.issueBook(book);
        if (flag==1){
            System.out.println("You have issued the book : "+book);
        }
        else System.out.println("Your book was not issued !! ");
    }
}
