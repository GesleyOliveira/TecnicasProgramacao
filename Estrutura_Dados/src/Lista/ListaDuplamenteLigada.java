package Lista;


public class ListaDuplamenteLigada {
    private NoDuplo primeiroNo, ultimoNo;
    private int qtdNo;
    
    public enum TipoOrdenacao {
    CRESCENTE, DECRESCENTE;
    }
    
    public void adicionar(int valor, TipoOrdenacao tipo){
            NoDuplo aux = primeiroNo;
            if(primeiroNo==null){
                adicionar((int) valor);
            } else if (tipo == TipoOrdenacao.CRESCENTE){
                for(int i=0; i<qtdNo;i++){
                    if(valor <= (int)aux.getInfo()){
                        adicionar(valor, i);
                        break;
                    } else {
                        adicionar(valor);
                        break;
                    }
                }
            } else if (tipo == TipoOrdenacao.DECRESCENTE){
                for(int i=0; i<qtdNo;i++){
                    if(valor >= (int)aux.getInfo()){
                        adicionar(valor, i);
                        break;
                    } else {
                        adicionar(valor);
                        break;
                    }
                }
            }
    }
    
    public int getLista2(Object item){
        NoDuplo aux = primeiroNo;
        int indice = 0;
        boolean encontrado = false;
        for(int i=0; i<qtdNo;i++){
            if((int)item == (int) aux.getInfo()){
                indice = i;
                encontrado = true;
            }
        aux = aux.getProximo();
        }
        if (encontrado == true){
            return indice;
        } else {
            return -1;
        }
    }
    
    public boolean remover2(Object item){
        if(getLista2(item)!=-1){
            remover(getLista2(item));
            return true;
        } else {
            return false;
        }
    }  
    
    public void concatenar(ListaDuplamenteLigada lista){
        NoDuplo aux = lista.primeiroNo;
        
        for(int i=0; i< lista.qtdNo; i++){
            adicionar(aux.getInfo());
            aux = aux.getProximo();
        }
        lista.primeiroNo = null;
        lista.ultimoNo = null;
    }
    
    public ListaDuplamenteLigada Copiar(){
        ListaDuplamenteLigada listaL = new ListaDuplamenteLigada();
        
        for(int i=0; i<qtdNo;i++){
            listaL.adicionar(getLista(i));
        }
        return listaL;
    }

    
    public ListaDuplamenteLigada(){
        primeiroNo = null;
        ultimoNo = null;
        qtdNo = 0;
    }
    
    public void adicionar(Object info){
        NoDuplo novoNo;
        if(primeiroNo==null){
            //Estou iniciando a Lista
            novoNo = new NoDuplo(info, null, null);
            primeiroNo = ultimoNo = novoNo;
            qtdNo++;
        } else {
            //Adiciona o No no final da lista
            novoNo = new NoDuplo(info, null, ultimoNo);
            ultimoNo.setProximo(novoNo);
            ultimoNo=novoNo;
            qtdNo ++;
        }
    }
    
    public void adicionar(Object info, int indice){
        //adiciona um novo nó na posição definida pelo indice
        //Se o indice for maior que qtdNo, adiciona o nó no ultimo indice;
        //Se o indice for menor que zero, não faz nada.
        NoDuplo novoNo;
        
        if(indice>=0){
            if(indice>=qtdNo){
                //Adiciona o nó a ultima posição da lista;
                adicionar(info);
            } else if(indice==0) {
                /*Para adicionar o nó na primeira posição
                O novo nó precisa precisa apontar para o primeiro nó e 
                    a referêncoia para o primeiro nó precisa ser atualizado 
                */
                novoNo = new NoDuplo(info, primeiroNo, null);
                primeiroNo = novoNo;
                qtdNo++;
            } else {
                // todos os casos onde será acicionado no meio da lista
                //aux recebe ref, para o nó de indice-1
                NoDuplo aux = percorrerLista(indice-1);
                //novoNo é criado com a red. para o próximo nó, como aux=>proximoNo.
                novoNo = new NoDuplo(info, aux.getProximo(), aux);
                //aux atualiza a ref. para o proximo nó, atribuindo o novo nó.
                aux.getProximo().setAnterior(novoNo);
                aux.setProximo(novoNo);
                qtdNo++;
            }
        }
    }

    public void setPrimeiroNo(NoDuplo primeiroNo) {
        this.primeiroNo = primeiroNo;
    }

    public void setUltimoNo(NoDuplo ultimoNo) {
        this.ultimoNo = ultimoNo;
    }

    public void setQtdNo(int qtdNo) {
        this.qtdNo = qtdNo;
    }

    public NoDuplo getPrimeiroNo() {
        return primeiroNo;
    }

    public NoDuplo getUltimoNo() {
        return ultimoNo;
    }

    public int getQtdNo() {
        return qtdNo;
    }
        public void remover(int indice){
            NoDuplo aux;
            if(indice==0){
                //remove da primeira posição da Lista     
                primeiroNo = primeiroNo.getProximo();
                primeiroNo.setAnterior(null);
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
                aux.getProximo().setAnterior(aux);
                qtdNo--;
            }
        }

    
    public String exibirLista(){
        // Percore toda a lista retornando uma string com o info de todos
        String retorno = "Lista: ";
        NoDuplo aux = primeiroNo;
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
        // Adicionar o recurso para percorrer a lista do último nó para o inicio
        return percorrerLista(indice).getInfo().toString();
    }
    
    public NoDuplo percorrerLista(int indice){
        if(indice >= 0 && indice < qtdNo){
            NoDuplo aux = primeiroNo;
            for(int i=0;i<indice;i++){
                aux = aux.getProximo();
            }
            return aux;
        } else {
            return null;
        }
    }
    
}

