//Luiz Vitor Vieira de Mattos 124280314
//Laísa Medeiros 124225429
public class Robot extends Mobile{
	
	private State state = State.CENTER;
	private int lineMatrix;
	private int columnMatrix;
	private Boolean TamMatrix = false;
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
		}

		if(this.state == State.SPIRAL)
		{
			System.err.println("Em andamento!!!!! Falta só implementarmos a Spiral, ainda não terminamos a lógica.");
			if(espiral == 0){
				if(line != lineMatrix){
					return Move.DOWN;
				}
				else if(column != columnMatrix){
					return Move.RIGHT;
				}
				else{
					espiral = 1;
				}
			}
			else if(espiral == 1){
				if(line != 1){
					return Move.UP;
				}
				else if(column != 2){
					return Move.LEFT;
				}
				else{
					espiral=2;
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
