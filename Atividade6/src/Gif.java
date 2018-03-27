import java.io.IOException;

public class Gif implements Imagem {
	
    String path;

    Gif(String path) {
        this.path = path;
    }

    @Deprecated
    @Override
    public short altura() {
        throw new RuntimeException("Nuuuunca seja chamado");
    }

    @Deprecated
    @Override
    public short largura() {
        throw new RuntimeException("Nuuuunca seja chamado");
    }

    @Deprecated
    @Override
    public String getTipo() {
        throw new RuntimeException("Nuuuunca seja chamado");
    }

    @Override
    public void draw() throws IOException {
        System.out.println("Desenha imagem " + largura() + " x " + altura());
    }

    @Override
    public byte[][] content() throws IOException {
        return new byte[][]{
            new byte[]{0, 1}
        };
    }

    @Override
    public String toString() {
        return "Path: " + this.path +" Tipo:" + getTipo() + " largura:" + largura() + " altura:" + altura();
    }

}
