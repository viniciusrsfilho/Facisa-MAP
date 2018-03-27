import java.io.IOException;

public interface Imagem {
	
	/**
     * @return Altura da imagem em pixels.
     */
    short altura();

    /**
     * @return Largura da imagem em pixels.
     */
    short largura();

    /**
     * Desenha a imagem.
     */
    void draw() throws IOException;

    /**
     * @return o tipo da imagem. Por exemplo, "gif".
     */
    String getTipo();

    /**
     * @return o conte�do do imagem, sem cabe�alho.
     */
    byte[][] content() throws IOException;

}
