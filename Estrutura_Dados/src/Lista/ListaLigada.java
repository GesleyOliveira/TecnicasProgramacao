package Lista;


public class ListaLigada {
    private No primeiroNo, ultimoNo;
    private int qtdNo;
    
    public ListaLigada(){
        primeiroNo = null;
        ultimoNo = null;
        qtdNo = 0;
    }
    
    public void adicionar(Object info){
        No novoNo;
        if(primeiroNo==null){
            //Esotu iniciando a Lista
            novoNo = new No(info, null);
            primeiroNo = ultimoNo = novoNo;
            qtdNo++;
        } else {
            //Adiciona o No no final da lista
            novoNo = new No(info, null);
            ultimoNo.setProximo(novoNo);
            ultimoNo=novoNo;
            qtdNo ++;
        }
    }
    
    public void adicionar(Object info, int indice){
        //adiciona um novo nó na posição definida pelo indice
        //Se o indice for maior que qtdNo, adiciona o nó no ultimo indice;
        //Se o indice for menor que zero, não faz nada.
        No novoNo;
        
        if(indice>=0){
            if(indice>=qtdNo){
                //Adiciona o nó a ultima posição da lista;
                adicionar(info);
            } else if(indice==0) {
                /*Para adciomar o nó na primeira posição
                O novo nó precisa precisa apontar para o primeiro nó e 
                    a referêncoia para o primeiro nó precisa ser atualizado 
                */
                novoNo = new No(info, primeiroNo);
                primeiroNo = novoNo;
                qtdNo++;
            } else {
                // todos os casos onde será acicionado no meio da lista
                //aux recebe ref, para o nó de indice-1
                No aux = percorrerLista(indice-1);
                //novoNo é criado com a red. para o próximo nó, como aux=>proximoNo.
                novoNo = new No(info, aux.getProximo());
                //aux atualiza a ref. para o proximo nó, atribuindo o novo nó.
                aux.setProximo(novoNo);
                qtdNo++;
            }
        }
    }
        public void remover(int indice){
            No aux;
            if(indice==0){
                //remove da primeira posição da Lista     
                primeiroNo = primeiroNo.getProximo();
                qtdNo--;
            } else if(indice==qtdNo-1){
                //remove da ultima posição da lista
                aux = percorrerLista(indice-1);
                aux.setProximo(null);
                ultimoNo = aux;
            } else {
                // remove qualquer outra posição da lista
                aux = percorrerLista(indice-1);
                aux.setProximo(aux.getProximo().getProximo());
                qtdNo--;
            }
        }

    
    public String exibirLista(){
        // Percore toda a lista retornando uma string com o info de todos
        String retorno = "Lista: ";
        No aux = primeiroNo;
        while(aux.getProximo()!=null){
            //Concatena as informações dos nós
            retorno+= aux.getInfo()+" ";
            //Percorre a lista
            aux = aux.getProximo();
        }
        retorno+=aux.getInfo();
        return retorno;
    }
    
    public String getLista(int indice){
        return percorrerLista(indice).getInfo().toString();
    }
    
    public No percorrerLista(int indice){
        if(indice >= 0 && indice < qtdNo){
            No aux = primeiroNo;
            for(int i=0;i<indice;i++){
                aux = aux.getProximo();
            }
            return aux;
        } else {
            return null;
        }
    }
}
