package events;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.FileUpload;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

public class InteractionEventListener extends ListenerAdapter {


    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {

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

        //File file = new File("");
        super.onSlashCommandInteraction(event);
        System.out.println("Command works!");
        //event.reply("test").queue();
        switch (event.getName()){

            case "TestCmd":
                event.reply("Works").queue();
                break;
            case "PicCmd":
                event.replyFiles((Collection<? extends FileUpload>) file).queue();

            case "reset": //under dev
                System.out.println("works");
                int x=0;
                for(int i=2;i<200;i++){
                    //System.out.println("in loop");
                    Row row = sheet.getRow(i);
                    Cell cell = null;
                    try {
                        cell = row.getCell(0);
                    } catch (NullPointerException nullPointerException) {
                        break;
                    }
                     double testcase = 0;
                    try{
                     testcase = cell.getNumericCellValue();
                    }
                    catch(Exception e){
                        continue;
                    }


                    if(testcase > 0){

                        cell.setCellValue(0);
                        System.out.println("reset");
                    }
                    if(cell.getStringCellValue() == null){
                        System.out.println("next column");
                        i=2;
                        x++;
                    }
                }
                event.getChannel().sendMessage("Reset done").queue();


        }
    }
}
