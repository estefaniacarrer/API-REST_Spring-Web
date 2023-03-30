package dio.myprojectorangetech.handler;

public class CampoObrigatorioExcepetion extends BusinessException {

    public CampoObrigatorioExcepetion(String campo) {
        super("O campo %s é obrigatório", campo);
    }

}
