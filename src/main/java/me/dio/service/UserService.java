package me.dio.service;

import me.dio.domain.model.User;
import me.dio.service.exception.BusinessException;

public interface UserService extends CrudService<Long, User> {

    /**
     * Nova Implementacao - Lucas-Severo96 - 16/11/2024
     * Buscando usuario pelo numero da conta bancaria
     */
    public User findByAccountNumber(String accountNumber);
}
