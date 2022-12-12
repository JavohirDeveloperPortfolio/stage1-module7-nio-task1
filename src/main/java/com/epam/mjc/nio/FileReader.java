package com.epam.mjc.nio;

import java.io.*;


public class FileReader {

    public Profile getDataFromFile(File file) {
        Profile profile = new Profile();
        try(BufferedReader reader = new BufferedReader(new java.io.FileReader(file))){
            String s = reader.readLine();
            profile.setName(s.substring(6));
            s = reader.readLine();
            profile.setAge(Integer.parseInt(s.substring(5,s.length())));
            s = reader.readLine();
            profile.setEmail(s.substring(7));
            s = reader.readLine();
            profile.setPhone(Long.parseLong(s.substring(7,s.length())));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return profile;
    }
}
