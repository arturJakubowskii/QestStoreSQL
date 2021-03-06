package com.company.samuraiSatan.dao;

import com.company.samuraiSatan.models.Class;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassDao extends Dao {

    public List<Class> getClasses() {
        List<Class> classes = new ArrayList<>();
        connect();
        try {
            ResultSet results = statement.executeQuery("SELECT * FROM classes;");
            while (results.next()) {
                classes.add(createClass(results));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classes;
    }

    private Class createClass(ResultSet results) throws SQLException {
        int classID = results.getInt("Class_ID");
        String className = results.getString("ClassName");
        return new Class(classID, className);
    }

    public void addClass(Class classs) {
        connect();
        PreparedStatement addClass;
        String sql = "INSERT INTO classes (\"ClassName\") VALUES (?)";
        try {
            addClass = connection.prepareStatement(sql);
            addClass.setString(1, classs.getClassName());
            addClass.executeUpdate();
            addClass.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
