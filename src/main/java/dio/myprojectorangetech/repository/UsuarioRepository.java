package dio.myprojectorangetech.repository;

import dio.myprojectorangetech.handler.BusinessException;
import dio.myprojectorangetech.handler.CampoObrigatorioExcepetion;
import dio.myprojectorangetech.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if(usuario.getLogin()==null)
            throw new CampoObrigatorioExcepetion("login");

        if(usuario.getPassword()==null)
            throw new CampoObrigatorioExcepetion("password");

        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário.", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("List - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("alice","password"));
        usuarios.add(new Usuario("bruno", "masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("alice","password");
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username> %s para localizar um usuário", username));
        return new Usuario("alice","password");
    }


}
