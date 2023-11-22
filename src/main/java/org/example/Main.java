package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        /*System.out.println("Before");
        var service = context.getBean(CommentService.class);
        System.out.println("After");*/

        var c1 = context.getBean(CommentService.class);
        //var c2 = context.getBean(CommentService.class);
        var c2 = context.getBean(UserService.class);
        boolean b = c1.getCommentRepository() == c2.getCommentRepository();
        System.out.println(b);
        System.out.println(c1.getCommentRepository());
        System.out.println(c2.getCommentRepository());

    }
}