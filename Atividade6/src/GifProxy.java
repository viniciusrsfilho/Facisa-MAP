import java.io.IOException;

public class GifProxy implements Imagem {
	
    Cabecalho cabecalho;
    Path path;
    Gif gif;
    
    GifProxy(Path path, Cabecalho cabecalho) {
        gif = new Gif(path.get());
        this.path = path;
        this.cabecalho = cabecalho;
    }

    @Override
    public short altura() {
        return this.cabecalho.altura();
    }

    @Override
    public short largura() {
        return this.cabecalho.largura();
    }

    @Override
    public String getTipo() {
        return this.path.getTipo();
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

}
