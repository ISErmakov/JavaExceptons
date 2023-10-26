package Model;


import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human implements iHuman{
    private String firstName;
    private String secondName;
    private String surName;
    private Date birthDay;
    private long tel;
    private SexList sex;

    @Override
    public void safeFile() throws IOException{
        try (FileWriter fileHumanWriter = new FileWriter((new File(firstName+".txt")), true)) {
            fileHumanWriter.write(String.valueOf(this));
        }
    }

    @Override
    public void parseHuman(String s) throws RuntimeException{
        String[] split = s.split(" ");
        if (split.length != this.getClass().getDeclaredFields().length){
            throw new RuntimeException("Введено неверное количество данных");
        }
        this.firstName = split[0];
        this.secondName = split[1];
        this.surName = split[2];
        SimpleDateFormat fd = new SimpleDateFormat("dd.MM.yyyy");
        try {
            this.birthDay = fd.parse(split[3]);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("ytdthyfz lfnf");
            throw new RuntimeException("Неверный формат даты");
        }
        this.tel = Long.parseLong(split[4]);
        if (split[5].equals("m")){
            this.sex = SexList.MALE;
        } else if (split[5].equals("f")) {
            this.sex = SexList.FAMALE;
        }
        else throw new RuntimeException("Not valid gender");
    }

    @Override
    public String toString(){
        return String.format("<%s><%s><%s><%td.%tm.%tY><%d><%s>\n", this.firstName, this.secondName, this.surName, this.birthDay, this.birthDay,this.birthDay,this.tel, this.sex);
    }
}
