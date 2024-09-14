package application;

import java.sql.Connection;

import db.DB;
import model.entities.Department;

public class Program {
    public static void main(String[] args) {

        Department d = new Department(1, "books");
        System.out.println(d);
    }
}
