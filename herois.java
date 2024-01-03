class Herois {

    String nome, tipo, ataque;
    byte idade;


    public static void main(String[] args) {
        Herois pequeno = new Herois("Fabio", (byte)27, "ninja");
        
        pequeno.atacar();
        pequeno.conversa();
    }

    public Herois(String nome, Byte idade, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
    }

    public void atacar() {
        if(this.tipo == "mago") {
            ataque = "Bola de fogo";
        }else if(this.tipo == "ninja") {
            ataque = "Clones";
        }else if(this.tipo == "guerreiro") {
            ataque = "Corte duplo";
        }else{
            ataque = "Palmas de Buda";
        }

        System.out.println("O " + this.tipo + " " + this.nome + " atacou usando " + ataque);
        
    }

    public void conversa() {
        System.out.println("- Depois da luta " + this.nome + " encontra uma estranha e ela diz a ele \"Qual seu nome e sua idade?\", ele abre a boca e diz: " + "Meu nome é " + this.nome + " e minha idade é " + this.idade);
    }
}