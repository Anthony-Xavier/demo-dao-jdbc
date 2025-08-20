package modele.dao;

import db.DB;
import modele.dao.impl.SelelrDaoJDBC;

public class DaoFactory {

    public  static SellerDao createSellerDao(){
        return  new SelelrDaoJDBC(DB.getConnecion());
    }
}
