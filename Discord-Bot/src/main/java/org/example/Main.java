package org.example;

import events.InteractionEventListener;
import events.MessageEvent;
import events.ReadyEvents;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {
        final  String token = "MTE0NTk0Mjc0OTkxMzI4ODcwNA.GJHO-m.mHUthWl-B61ePWDTOg6FaXvWZueWdqrFonNyX4";

        JDABuilder jdaBuilder = JDABuilder.createDefault(token);
        jdaBuilder.enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES);
        JDA jda = jdaBuilder.addEventListeners( new InteractionEventListener(), new ReadyEvents(), new MessageEvent()).build();

        jda.upsertCommand("TestCmd", "test cmd").setGuildOnly(true).queue();
        //jda.upsertCommand("PicCmd", "PicCmd").setGuildOnly(true).queue();
        jda.upsertCommand("reset", "resets sheet").setGuildOnly(true).queue();


                //new ReadyEvents(), new InteractionEventListener(), new ReadyEvents(),
    }
}