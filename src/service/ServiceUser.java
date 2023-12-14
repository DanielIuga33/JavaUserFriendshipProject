package service;
import domain.User;
import repository.RepoUser;

import java.util.List;

public class ServiceUser {
    private RepoUser repo;

    public ServiceUser(RepoUser repo) {
        this.repo = repo;
    }

    public void add(int id, String name, String surname, String email, String password){
        User u = new User(id, name, surname, email, password);
        repo.add(u);
    }

    public void remove(int id){
        User u = repo.findById(id);
        repo.remove(u);
    }

    public List<User> getAll(){return repo.getRepo();}

    public boolean exist(int id){return repo.exist(id);}

    public RepoUser getRepo(){return this.repo;}

    public int size(){return repo.size();}


}