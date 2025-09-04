//Luiz Vitor Vieira de Mattos 124280314
//Laísa Medeiros 124225429
public class Robot extends Mobile{
	
	private State state = State.CENTER;
	private int lineMatrix;
	private int columnMatrix;
	private Boolean TamMatrix = false;
	private Boolean TopLeft = false;
	private int triangulo = 1;
	private int espiral = 0;

	public Robot(){
	}	

	public Move move(){
		line = GPS.getLine(id);
		column = GPS.getColumn(id);

		if(this.state == State.STOP) return Move.STOP;
		
		if(this.state == State.CENTER){
			if(TamMatrix == false){
				if(line != lineMatrix){
					lineMatrix = line;
					return Move.DOWN;
				}
				else if(column != columnMatrix){
					columnMatrix = column;
					return Move.RIGHT;
				}
				else{
					this.TamMatrix = true;
				}
			}
			if(TamMatrix == true){
				if(column > (columnMatrix/2)){
					return Move.LEFT;
				}
				if(column < (columnMatrix/2)){
					return Move.RIGHT;
				}
				if(line > (lineMatrix/2)){
					return Move.UP;
				}
				if(line < (lineMatrix/2)){
					return Move.DOWN;
				}
				else{
					this.state = State.STOP;
				}
				/*
				if(line == lineMatrix && columnMatrix == column){
					this.state = State.TOP_LEFT;
				}
				*/
			}
		}

		if(this.state == State.TOP_LEFT){
			if(line != 1){
				System.out.println(line);
				return Move.UP;
			}
			else if(column != 1){
				return Move.LEFT;
			}
			else{
				TopLeft = true;
				if(espiral == 1){
					this.state = State.SPIRAL;
				}
				else{
					this.state = State.STOP;
				}
			}
		}

		if(this.state == State.SPIRAL)
		{
			if(line != 1 && column != 1 && TopLeft == false){
				espiral = 1;
				this.state = State.TOP_LEFT;
			}

				if(triangulo == 1){
					if(column != columnMatrix - (espiral - 1)){
						return Move.RIGHT;
					}
					else if(line != lineMatrix - (espiral - 1)){
						return Move.DOWN;
					}
					else{
						triangulo = 2;
					}
				}
				if(triangulo == 2){
					if(column != 1 + (espiral - 1)){
						return Move.LEFT;
					}
					else if(line != 1 + (espiral - 1)){
						return Move.UP;
					}
					else{
						espiral ++;
						triangulo = 3;
					}
					if(triangulo == 3){
						if((line != lineMatrix/2) && (column != columnMatrix/2)){
							triangulo = 1;
						}
						else{
							triangulo = 1;
							this.state = State.STOP;
							return Move.STOP;
						}
					}
				}
			return Move.STOP;
		}
		return Move.STOP;
	}
	
	public void setState( State newState ) {
		this.state = newState;
	}
}
