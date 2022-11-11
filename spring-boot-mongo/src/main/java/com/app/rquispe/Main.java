package com.app.rquispe;

import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Main {

  @Autowired
  MongoTemplate template;
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @EventListener(ApplicationReadyEvent.class)
  public void initConfigAfterStartup() {
    MongoDatabase adminDB = template.getMongoDbFactory()
            .getMongoDatabase("admin");

    adminDB.runCommand(new Document("enableSharding", "db"));

    Document shardCmd = new Document("shardCollection", "test-database.purchase")
            .append("key", new Document("country", "hashed"));
    adminDB.runCommand(shardCmd);

  }
}
