
package com.fromthecircus.db;

public class User {

    private int m_id;
    private String m_name;

    public User(int id, String name){
        m_id = id;
        m_name = name;
    }

    public User(String name){
        m_name = name;
    }

    public int getId(){
        return m_id;
    }

    public void setId(int id){
        m_id = id;
    }

    public String getName(){
        return m_name;
    }

    public void setName(String name){
        m_name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + m_id +
                ", name='" + m_name + '\'' +
                '}';
    }
}