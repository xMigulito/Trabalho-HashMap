
    import java.util.ArrayList;
    import java.util.EnumMap;

enum Marca {
    VOLKSWAGEN, FORD, GM, RENAULT // Adicione outras marcas conforme necessário
}

class Veiculo {
    private String nome;

    public Veiculo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class ColecaoVeiculos {
    private EnumMap<Marca, ArrayList<Veiculo>> colecao;

    public ColecaoVeiculos() {
        colecao = new EnumMap<>(Marca.class);
    }

    public void addVeiculoMarca(Marca marca, Veiculo veiculo) {
        colecao.computeIfAbsent(marca, k -> new ArrayList<>()).add(veiculo);
    }

    public ArrayList<Veiculo> filtro(String palavraChave) {
        ArrayList<Veiculo> veiculosFiltrados = new ArrayList<>();

        for (ArrayList<Veiculo> veiculos : colecao.values()) {
            for (Veiculo veiculo : veiculos) {
                if (veiculo.getNome().toLowerCase().contains(palavraChave.toLowerCase())) {
                    veiculosFiltrados.add(veiculo);
                }
            }
        }

        return veiculosFiltrados;
    }
    public static void main(String[] args) {
        ColecaoVeiculos colecao = new ColecaoVeiculos();

        colecao.addVeiculoMarca(Marca.VOLKSWAGEN, new Veiculo("Gol GTI 2000"));
        colecao.addVeiculoMarca(Marca.VOLKSWAGEN, new Veiculo("Gol GTS 1800"));
        colecao.addVeiculoMarca(Marca.VOLKSWAGEN, new Veiculo("GOLF SAPÃO"));
        colecao.addVeiculoMarca(Marca.FORD, new Veiculo("Mustang"));
        colecao.addVeiculoMarca(Marca.FORD, new Veiculo("Focus"));
        colecao.addVeiculoMarca(Marca.FORD, new Veiculo("Ranger"));
        colecao.addVeiculoMarca(Marca.GM, new Veiculo("Camaro"));
        colecao.addVeiculoMarca(Marca.GM, new Veiculo("Cruze"));
        colecao.addVeiculoMarca(Marca.GM, new Veiculo("Onix"));
        colecao.addVeiculoMarca(Marca.RENAULT, new Veiculo("Clio"));
        colecao.addVeiculoMarca(Marca.RENAULT, new Veiculo("Captur"));

        ArrayList<Veiculo> veiculosFiltrados = colecao.filtro("Gol");
        for (Veiculo veiculo : veiculosFiltrados) {
            System.out.println(veiculo.getNome());
        }
    }
}