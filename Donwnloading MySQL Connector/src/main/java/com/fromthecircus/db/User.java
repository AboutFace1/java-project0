
package com.fromthecircus.db;

import java.util.Objects;

public class User {

    private int m_id;
    private String m_name;

    public User(int id, String name){
        m_id = id;
        m_name = name;
    }

    public User(int id){
        m_id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return m_id == user.m_id && m_name.equals(user.m_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(m_id, m_name);
    }
}
