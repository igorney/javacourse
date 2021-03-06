package application;

import entities.Comment;
import entities.Post;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome!");
        Post post = new Post(new Date(), "Travelling to New Zeland", "I'm going to visit this wonderful country!", 12);
        post.addComment(comment1);
        post.addComment(comment2);
        System.out.println(post.toString());
        Post post2 = new Post(new Date(), "Good night guys!", "See you tomorrow", 5);
        while(true){
           System.out.print("Input your comment: ");
           String text = scan.nextLine();
           if(text.isEmpty()){
               break;
           }
           else {
               post2.addComment(new Comment(text));
           }
        }
        System.out.println(post2.toString());
    }
}
