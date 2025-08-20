package modele.dao;

import modle.entities.Department;
import modle.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert (Seller obj);
    void update (Seller obj);
    void deleteById(Integer id);
    Seller findBy(Integer id);
    List<Seller> findAll();
}
