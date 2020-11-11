package com.example.service;

import com.example.model.Action;
import com.example.repository.RefRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;

@Slf4j
@Service
@AllArgsConstructor(access = PACKAGE)
@FieldDefaults(level = PRIVATE, makeFinal = true)
@Transactional(readOnly = true)
public class RefService {

    @NonNull
    RefRepository<Action> actionDao;

    public List<Action> actions() {
        return actionDao.findAll();
    }

    @Transactional
    public Action addAction(Action action) {
        return actionDao.save(action);
    }

    @Transactional
   
    // public void deleteAction(UUID id){
    public void deleteAction(Action action) { 
        actionDao.delete(action);
    }

    @Transactional
    public Action updateAction(Action action) {
        return actionDao.save(action);
    }

}
