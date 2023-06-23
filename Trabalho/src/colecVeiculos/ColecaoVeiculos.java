package colecVeiculos;

import java.util.ArrayList;
import java.util.EnumMap;

import enums.Marca;
import veiculo.Veiculo;

public class ColecaoVeiculos {
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
}
