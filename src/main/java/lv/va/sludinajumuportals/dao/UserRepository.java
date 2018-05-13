package lv.va.sludinajumuportals.dao;

import lv.va.sludinajumuportals.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository
        extends CrudRepository<User, Long> {

    public List<User> findByName(String name);
}
