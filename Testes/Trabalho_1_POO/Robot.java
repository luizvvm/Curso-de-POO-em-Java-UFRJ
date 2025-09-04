//Luiz Vitor Vieira de Mattos 124280314
//Laísa Medeiros 124225429
public class Robot extends Mobile{

	private State state = State.CENTER;

	//variaveis para armazenar o tamanho da matriz
	private int lineMatrix;
	private int columnMatrix;

	//variaveis de controle
	private Boolean TamMatrix = false; //utilizada para controlar se já obtemos as informações do tamanho da matriz
	private Boolean TopLeft = false; //utilizada para controlar se o robo está no topo esquerdo ou não

	//variaveis de controle também
	private int triangulo = 1; //utilizada para não acionar alguns "ifs" no momento errado (Espiral)
	private int espiral = 0; //Utilizada como varivel de controle para fazer o robo realmente andar em espiral

	public Robot(){
	}	

	public Move move(){
		line = GPS.getLine(id);
		column = GPS.getColumn(id);

		if(this.state == State.STOP) return Move.STOP;
		
		if(this.state == State.CENTER){
			//Código para pegar o tamanho da matriz
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

			//Código para ir para o centro
			if(TamMatrix == true){
				TopLeft = false;
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
				//ignora o código abaixo
				/*
				if(line == lineMatrix && columnMatrix == column){
					this.state = State.TOP_LEFT;
				}
				*/
			}
		}

		if(this.state == State.TOP_LEFT){
			//a primeira linha da matriz e da coluna é 1. Então enquanto n estiver lá, vai pra lá
			if(line != 1){
				return Move.UP;
			}
			else if(column != 1){
				return Move.LEFT;
			}
			//se chegou no top left
			else{
				TopLeft = true;
				//O código abaixo é só para funcionar a espiral. Sempre que iniciarmos o código da espiral, espiral se torna 1
				//dai o espiral torna o estado como "Top Left" para trazer o robo pro top left (se ele já não estiver)
				//chegando no top left entra no código abaixo, se espiral = 1 (foi o estado ESPIRAL que acionou o estado TOP_LEFT)
				//então chama o estado ESPIRAL de novo. Se não, então não foi o ESPIRAL que acionou então fica parado.
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
			//Código para levar o robo pro TOP LEFT se ele já não estiver lá
			if(line != 1 && column != 1 && TopLeft == false){
				espiral = 1;
				this.state = State.TOP_LEFT;
			}

			//Código para andar em espiral. Aqui nós estamos utilizando todas aquelas variaveis de controle que tinhamos criado
			//triangulo é para evitar acionar os ifs errados na hora errada (não andar pro lugar que não devia)
			//e espiral está sendo usada para ir diminuindo ou somando na coluna ou linha da matriz, para que ele ande em espiral né.
			//tem que subtrair 1 de espiral pq ela já inicia como 1, mas queremos que inicie como zero
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
					//espiral ++ é necessário para funcionar a espiral
					else{
						espiral ++;
						triangulo = 3;
					}
					//triangulo == 3 é para verificar se ele já chegou no centro. Se não chegou no centro, triangulo se torna 1 de novo
					//para inicia de novo o "loop". Se ele já chegou no centro, então pode parar e reiniciar as variaveis
					if(triangulo == 3){
						if((line != lineMatrix/2) && (column != columnMatrix/2)){
							triangulo = 1;
						}
						else{
							//reiniciando as variaveis.
							espiral = 1;
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
