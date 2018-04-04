
public class ImagemAdapterPNG implements ImagemTarget {

	private ImagemPNG imagemPNG = new ImagemPNG();
	
	@Override
	public void carregarImagem() {
		imagemPNG.carregarImagem();
	}

	@Override
	public void desenharImagem() {
		imagemPNG.desenharImagem();		
	}
	
	

}
