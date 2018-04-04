
public class ImagemAdapterJpeg implements ImagemTarget {

	private ImagemJpeg imagemJpeg = new ImagemJpeg();
	
	@Override
	public void carregarImagem() {
		imagemJpeg.carregarImagem();
	}

	@Override
	public void desenharImagem() {
		imagemJpeg.desenharImagem();
	}
	

}
