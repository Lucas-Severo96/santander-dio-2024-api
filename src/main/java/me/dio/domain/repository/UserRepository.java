package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);

    /**
     * Nova Implementacao - Lucas-Severo96 - 16/11/2024
     * Buscando usuario pelo numero da conta bancaria
     */
    @Query("SELECT u FROM tb_user u JOIN u.account a WHERE a.number = :accountNumber")
    Optional<User> findByAccountNumber(@Param("accountNumber") String number);

}
