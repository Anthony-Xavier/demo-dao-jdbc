import modele.dao.DaoFactory;
import modele.dao.SellerDao;
import modle.entities.Department;
import modle.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}