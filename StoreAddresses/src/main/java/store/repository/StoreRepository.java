package store.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import store.beans.Store;
@Repository
public interface StoreRepository extends JpaRepository<Store, Long> { }

