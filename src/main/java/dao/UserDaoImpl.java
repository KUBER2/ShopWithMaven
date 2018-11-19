package dao;

import api.UserDao;
import entity.Product;
import entity.User;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private String fileName;

    public UserDaoImpl(String fileName){
        super();
        this.fileName=fileName;
    }

    public void saveUser(User user) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.fileName, true);
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            printWriter.write(user.toStringDao());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveUsers(List<User> users) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.fileName, true);
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            for(User user:users)
                printWriter.write(user.toStringDao());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        LinkedList<User> usersFromFile = new LinkedList<User>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String readOneLineFromFile = reader.readLine();
            while(readOneLineFromFile!=null){
                usersFromFile.add(new User(readOneLineFromFile));
                readOneLineFromFile = reader.readLine();
            }
            reader.close();
            return usersFromFile;


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public User getUserById(long id) {
        LinkedList<User> usersFromFile = new LinkedList<User>();
        usersFromFile = (LinkedList<User>) this.getAllUsers();
        for (int i =0;i<usersFromFile.size();i++) {
            if (usersFromFile.get(i).getId()==id)
                return usersFromFile.get(i);
        }
        return null;

    }

    public User getUserByLogin(String login) {
        LinkedList<User> usersFromFile = new LinkedList<User>();
        usersFromFile = (LinkedList<User>) this.getAllUsers();
        for (int i =0;i<usersFromFile.size();i++) {
            if (usersFromFile.get(i).getLogin()==login)
                return usersFromFile.get(i);
        }
        return null;
    }

    public void removeUserById(long id) {
        LinkedList<User> usersFromFile = new LinkedList<User>();
        usersFromFile = (LinkedList<User>) this.getAllUsers();
        int userIndextoRemove=0;
        for(int i =0;i<usersFromFile.size();i++){
            if(usersFromFile.get(i).getId()==id)
                userIndextoRemove =i;
        }
        usersFromFile.remove(userIndextoRemove);
        this.saveUsers(usersFromFile);

    }

    public void removeUserByLogin(String login) {
        LinkedList<User> usersFromFile = new LinkedList<User>();
        usersFromFile = (LinkedList<User>) this.getAllUsers();
        int userIndextoRemove=0;
        for(int i =0;i<usersFromFile.size();i++){
            if(usersFromFile.get(i).getLogin()==login)
                userIndextoRemove =i;
        }
        usersFromFile.remove(userIndextoRemove);
        this.saveUsers(usersFromFile);

    }
}
