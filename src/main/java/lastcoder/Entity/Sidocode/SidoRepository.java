package lastcoder.Entity.Sidocode;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SidoRepository extends JpaRepository<SidoCode, SidoCodeMK> {

	List<SidoCode> findBySidoCodeMKSidocode(String sidocode);
}
