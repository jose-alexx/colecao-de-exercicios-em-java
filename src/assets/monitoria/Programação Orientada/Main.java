public class Main {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();
        Twhitter twhitter = new Twhitter();
        Youtube youtube = new Youtube();

        redeSocial.nome = "Facebook";
        redeSocial.url = "www.facebook.com";
        redeSocial.qualidadeUsuario = "Alta";
        redeSocial.comentar();

        twhitter.qtdCaracter = 280;
        twhitter.criarThead();


        youtube.CanalCriado = true;
        youtube.reproduzirVideo();
    }
    
}