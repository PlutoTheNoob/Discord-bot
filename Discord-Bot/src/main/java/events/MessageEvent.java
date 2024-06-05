package events;

import net.dv8tion.jda.api.entities.GuildWelcomeScreen;
import net.dv8tion.jda.api.entities.Invite;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.Channel;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.EventListener;

public class MessageEvent implements EventListener {


    //interactive messages

    @Override
    public void onEvent(GenericEvent genericEvent) {
        if(genericEvent instanceof MessageReceivedEvent){

            //MessageChannel channel = ((MessageReceivedEvent) genericEvent).getChannel();

            //channel.sendMessage("NIGGERS DON'T TALK").queue();

            // joe 310854196712964096

            //310854196712964096
            // me 336623585726562306
            // salah 340253129687957504
             //User user = genericEvent.getJDA().getUserById("340253129687957504");
            // hany 427439847049920515

             String userID = ((MessageReceivedEvent) genericEvent).getAuthor().getId();
             String salah = "340253129687957504";
             String hany = "427439847049920515";
             String joe = "310854196712964096";
             String sokol = "270132804753293312";
             String newetik = "439689571261874176";
             String Cypher ="234795349925953546";


             if(userID.equals(salah) == true){

                 System.out.println("works on salah");
             if(((MessageReceivedEvent) genericEvent).getAuthor().isBot()){
                 return;
             }

            ((MessageReceivedEvent) genericEvent).getChannel().sendMessage("").queue();


                 ((MessageReceivedEvent) genericEvent).getChannel().sendMessage("").queue();

                 ((MessageReceivedEvent) genericEvent).getChannel().sendMessage("").queue();

                 ((MessageReceivedEvent) genericEvent).getChannel().sendMessage("م" + " <@340253129687957504> ").queue();
             } else if (userID.equals(hany) == true) {

                 System.out.println("works on hany");
                 if(((MessageReceivedEvent) genericEvent).getAuthor().isBot()){
                     return;
                 }

                 ((MessageReceivedEvent) genericEvent).getChannel().sendMessage("").queue();

             }
             else if (userID.equals(joe) == true ){
                 System.out.println("Works on joe");
                 if(((MessageReceivedEvent) genericEvent).getAuthor().isBot()){
                     return;
                 }
                 ((MessageReceivedEvent) genericEvent).getChannel().sendMessage("").queue();
             }

             else if (userID.equals(sokol) == true){
                 System.out.println("Works on sokol");
                 if(((MessageReceivedEvent) genericEvent).getAuthor().isBot()){
                     return;
                 }
                 ((MessageReceivedEvent) genericEvent).getChannel().sendMessage("" + "<@270132804753293312>").queue();
             }

             else if(userID.equals(newetik) == true){

                 System.out.println("Works on newetik");
                 if(((MessageReceivedEvent) genericEvent).getAuthor().isBot()){
                     return;
                 }
                 ((MessageReceivedEvent) genericEvent).getChannel().sendMessage("" + "<@439689571261874176>").queue();

             }
             else if(userID.equals(Cypher) == true){

                 System.out.println("Works on newetik");
                 if(((MessageReceivedEvent) genericEvent).getAuthor().isBot()){
                     return;
                 }


                 ((MessageReceivedEvent) genericEvent).getChannel().sendMessage(" " + "<@234795349925953546>" + "").queue();

             }


            //genericEvent.getJDA().retrieveUserById("310854196712964096").queue( user -> {
                        //channel.sendMessage("").queue();
                    //});

            //genericEvent.getJDA().getUserById("336623585726562306");




        }
    }
}
