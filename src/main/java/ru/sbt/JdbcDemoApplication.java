package ru.sbt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.sbt.dao.Purchase;
import ru.sbt.dao.PurchaseDao;
import ru.sbt.service.ShopService;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JdbcDemoApplication {
    @Autowired
    private ShopService shopService;

    @PostConstruct
    public void init() {
//        shopService.doShopping();
        shopService.find();
    }

    public static void main(String[] args) {
        SpringApplication.run(JdbcDemoApplication.class, args);
    }
}
