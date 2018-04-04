
public class ImagemAdapterBMP implements ImagemTarget {

	private ImagemBMP imagemBMP = new ImagemBMP();
	
	@Override
	public void carregarImagem() {
		imagemBMP.carregarImagem();		
	}

	@Override
	public void desenharImagem() {
		imagemBMP.desenharImagem();		
	}

}
