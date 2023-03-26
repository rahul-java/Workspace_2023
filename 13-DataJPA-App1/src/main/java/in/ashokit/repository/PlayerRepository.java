package in.ashokit.repository;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer>{

}