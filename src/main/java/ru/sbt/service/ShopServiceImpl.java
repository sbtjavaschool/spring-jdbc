package ru.sbt.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.sbt.dao.Purchase;
import ru.sbt.dao.PurchaseDao;

import java.util.Date;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    private final PurchaseDao purchaseDao;

    public ShopServiceImpl(PurchaseDao purchaseDao) {
        this.purchaseDao = purchaseDao;
    }

    @Override
    @Transactional
    public void doShopping() {
        purchaseDao.save(new Purchase(19, new Date(), 145.5, "startbucks"));
        purchaseDao.save(new Purchase(20, new Date(), 500, "shop2"));
    }

    @Override
    public void find() {
        List<Purchase> startbucks = purchaseDao.find(new Date());
        System.out.println(startbucks);
    }
}