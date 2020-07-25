package edu.codegym.toam.service.contract;

import edu.codegym.toam.model.Contracts;

public interface IContractService {
    Iterable<Contracts> findAll();
    Contracts findById(Long id);
    Contracts update(Contracts contracts);
    void removeById(Long id);
    Contracts create(Contracts contracts);
}