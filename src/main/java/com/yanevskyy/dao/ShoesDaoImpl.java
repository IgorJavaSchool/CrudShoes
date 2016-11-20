package com.yanevskyy.dao;

import com.yanevskyy.shoesFactory.Shoes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
@Repository
public class ShoesDaoImpl implements ShoesDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShoesDaoImpl.class);

    private SessionFactory sessionFactory;
    private Session session;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void getCurrentSession(){
        session = this.sessionFactory.getCurrentSession();
    }

    @Override
    public void addShoes(Shoes shoes) {
        getCurrentSession();
        session.persist(shoes);
        LOGGER.info(shoes + " add to table");
    }

    @Override
    public void updateShoes(Shoes shoes) {
        getCurrentSession();
        session.update(shoes);
        LOGGER.info(shoes + " update");
    }

    @Override
    public void removeShoes(int id) {
        getCurrentSession();
        Shoes shoes = (Shoes) session.load(Shoes.class, new Integer(id));

        if (shoes != null){
            session.delete(shoes);
        }
        LOGGER.info(shoes + " delete");
    }

    @Override
    public Shoes getShoesById(int id) {
        getCurrentSession();
        Shoes shoes = (Shoes) session.load(Shoes.class, new Integer(id));
        LOGGER.info(shoes + "is load");
        return shoes;
    }

    @Override
     @SuppressWarnings("unchecked")
     public List<Shoes> getShoesList() {
        getCurrentSession();
        List <Shoes> shoesList = session.createQuery("from Shoes").list();
        for (Shoes shoes : shoesList){
            LOGGER.info("Shoes list: " + shoes);
        }

        return shoesList;
    }
}
