package events;

import net.dv8tion.jda.api.entities.channel.Channel;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Scanner;

public class ReadyEvents implements EventListener {
    int counter = 0;
    int x =0;
    int y = 0;

    @Override
    public void onEvent(GenericEvent genericEvent) {

        File list = new File("ref.txt");

        Scanner s = null;
        try {
            s = new Scanner(list);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        String m = ((MessageReceivedEvent) genericEvent).getMessage().getContentRaw();
        String[] sep = m.split(" ");
        if ( genericEvent instanceof MessageReceivedEvent){

            String channelID = ((MessageReceivedEvent) genericEvent).getChannel().getId();
            String wz = "1146566778214957136";
            String dd = "1146566808476852276";
            String op = "1146566823966429296";
            String cop = "1147091519640186900";
            String useless = "1147093229473382481";
            System.out.println(channelID);
            //if( channelID.equals(refrence)== true){

               // System.out.println("inside");
                //if(((MessageReceivedEvent) genericEvent).getAuthor().isBot()){
                   // return;
               // }

               //MessageChannel channel1 = ((MessageReceivedEvent) genericEvent).getChannel();
                //channel1.getJDA().getTextChannelById("1146566778214957136").sendMessage("kosmk").queue();

                //((MessageReceivedEvent) genericEvent).getChannel().sendMessage("kosmk").queue();
            //}

            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream("New Microsoft Excel Worksheet.xlsx");
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }

            Workbook workbook = null;

            try {
                workbook = new XSSFWorkbook(inputStream);
            } catch (IOException e) {
                System.out.println("IO exception");
            }

            Sheet sheet = workbook.getSheet("Sheet1");
            int i=0;
             do {
                 int p =0;

                Row row = sheet.getRow(i);
                Cell cell = null;
                try {
                    cell = row.getCell(y);
                } catch (NullPointerException nullPointerException) {
                    break;
                }

                String value = cell.getStringCellValue().replace(" ", "");
                System.out.println("Looping");

                    if(sep[p] == null){
                        break;
                    }

                    System.out.println(sep[p] + "\n");


                    if(channelID.equals(wz) == true){

                  for(String b :sep)  {boolean check = b.matches("(?is).*\\b" + value + "\\b.*");
                if(check == true){
                    System.out.println("fOUND");

                    row = sheet.getRow(i);
                    cell = row.getCell(1);
                    cell.setCellValue(cell.getNumericCellValue()+1);

                    System.out.println("Done");

                    // wz 1146566778214957136

                } }} else if (channelID.equals(dd) == true) {

                        for(String b :sep)  {boolean check = b.matches("(?is).*\\b" + value + "\\b.*");
                            if(check == true){
                                System.out.println("fOUND");

                                row = sheet.getRow(i);
                                cell = row.getCell(2);
                                cell.setCellValue(cell.getNumericCellValue()+1);

                                System.out.println("Done"); }


                    } } else if (channelID.equals(op) == true) {

                        for(String b :sep)  {boolean check = b.matches("(?is).*\\b" + value + "\\b.*");
                            if(check == true){
                                System.out.println("fOUND");

                                row = sheet.getRow(i);
                                cell = row.getCell(3);
                                cell.setCellValue(cell.getNumericCellValue()+1);

                                System.out.println("Done"); }
                        }

                    } else if (channelID.equals(cop) == true) {

                        for(String b :sep)  {boolean check = b.matches("(?is).*\\b" + value + "\\b.*");
                            if(check == true){
                                System.out.println("fOUND");

                                row = sheet.getRow(i);
                                cell = row.getCell(4);
                                cell.setCellValue(cell.getNumericCellValue()+1);

                                System.out.println("Done"); }
                        }

                    } else if (channelID.equals(useless) == true) {

                        for(String b :sep)  {boolean check = b.matches("(?is).*\\b" + value + "\\b.*");
                            if(check == true){
                                System.out.println("fOUND");

                                row = sheet.getRow(i);
                                cell = row.getCell(5);
                                cell.setCellValue(cell.getNumericCellValue()+1);

                                System.out.println("Done"); }
                        }

                    }


                 i++;


             } while (i<40);

             System.out.println("out of loop");


            FileOutputStream outputStream = null;
            try {
                outputStream = new FileOutputStream("New Microsoft Excel Worksheet.xlsx");
            } catch (FileNotFoundException e) {

                System.out.println("CAUGHT");
            }


            try {
                workbook.write(outputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                workbook.close();
            } catch (IOException e) {
                System.out.println("CAUGHT");
            }
            try {
                outputStream.close();
            } catch (IOException e) {
                System.out.println("CAUGHT");
            }


            System.out.println("saved");





            //System.out.println(value);






            while (s.hasNext()){
                //System.out.println("Looping");
                String target = s.next();
                boolean x = m.matches("(?is).*\\b" + target + "\\b.*");

                if (x == true){
                    System.out.println("found");
                    counter++;
                }
                //s.next();

            }

            System.out.println(counter + " " + "Points");


            //System.out.println(m);
        }
    }


}
