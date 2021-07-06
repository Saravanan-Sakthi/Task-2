package Task2;
public class BookInLibrary {
    private static int id=1;
    private String bookname;
    private String author;
    private int numberofpages;
    private int libid;
    private int rating;
    BookInLibrary(){
        libid=id++;
    }
    public void setBookName(String book){
        bookname=book;
    }
    public String getBookName(){
        return bookname;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void setPages(int pages){
        numberofpages=pages;
    }
    public int getPages(){
        return numberofpages;
    }
    public void setRating(int rate){
        if (rate<=5) rating=rate;
        if (rate<0) rating=0;
        else rating=5;
    }
    public int getRating(){
        return rating;
    }
    @Override
    public String toString(){
        String output="";
        output+="Book name       : "+bookname+"\n";
        output+="Author          : "+author+"\n";
        output+="Number of pages : "+numberofpages+"\n";
        output+="Library ID      : "+libid+"\n";
        output+="Rating          : "+rating;
        return output;
    }
}
