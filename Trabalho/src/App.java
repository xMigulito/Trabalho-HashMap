import java.util.ArrayList;
import java.util.EnumMap;

import colecVeiculos.ColecaoVeiculos;
import enums.Marca;
import veiculo.Veiculo;

public class App {
    public static void main(String[] args) {
        ColecaoVeiculos colecao = new ColecaoVeiculos();

        colecao.addVeiculoMarca(Marca.VOLKSWAGEN, new Veiculo("Gol GTI 2000"));
        colecao.addVeiculoMarca(Marca.VOLKSWAGEN, new Veiculo("Gol GTS 1800"));
        colecao.addVeiculoMarca(Marca.VOLKSWAGEN, new Veiculo("GOLF SAPÃO"));
        colecao.addVeiculoMarca(Marca.VOLKSWAGEN, new Veiculo("Jetta"));
        colecao.addVeiculoMarca(Marca.FORD, new Veiculo("Mustang"));
        colecao.addVeiculoMarca(Marca.FORD, new Veiculo("Focus"));
        colecao.addVeiculoMarca(Marca.FORD, new Veiculo("Ranger"));
        colecao.addVeiculoMarca(Marca.FORD, new Veiculo("Maverick"));
        colecao.addVeiculoMarca(Marca.GM, new Veiculo("Camaro"));
        colecao.addVeiculoMarca(Marca.GM, new Veiculo("Cruze"));
        colecao.addVeiculoMarca(Marca.GM, new Veiculo("Onix"));
        colecao.addVeiculoMarca(Marca.GM, new Veiculo("Spin"));
        colecao.addVeiculoMarca(Marca.RENAULT, new Veiculo("Clio"));
        colecao.addVeiculoMarca(Marca.RENAULT, new Veiculo("Captur"));
        colecao.addVeiculoMarca(Marca.RENAULT, new Veiculo("Logan"));
        colecao.addVeiculoMarca(Marca.RENAULT, new Veiculo("Duster"));

        ArrayList<Veiculo> veiculosFiltrados = colecao.filtro("cl");
        for (Veiculo veiculo : veiculosFiltrados) {
            System.out.println(veiculo.getNome());
        }
    }
}