// Lista de restaurantes com suas localizações (latitude e longitude)
const restaurantes = [
    { nome: "Restaurante A", lat: -23.5636, lon: -46.6544 },
    { nome: "Restaurante B", lat: -23.5678, lon: -46.6502 },
    { nome: "Restaurante C", lat: -23.5712, lon: -46.6567 },
    { nome: "Restaurante D", lat: -23.5690, lon: -46.6619 },
    { nome: "Restaurante E", lat: -23.5665, lon: -46.6583 }
];

// Função para recomendar um restaurante com base na localização do usuário
function recomendarRestaurante(localUsuario) {
    return restaurantes.reduce((restauranteMaisProximo, restaurante) => {
        const distanciaAtual = Math.abs(localUsuario.lat - restaurante.lat) + Math.abs(localUsuario.lon - restaurante.lon);
        const distanciaMaisProxima = Math.abs(localUsuario.lat - restauranteMaisProximo.lat) + Math.abs(localUsuario.lon - restauranteMaisProximo.lon);
        return (distanciaAtual < distanciaMaisProxima) ? restaurante : restauranteMaisProximo;
    });
}

// Função para gerar uma localização aleatória para o usuário
function gerarLocalizacaoAleatoria() {
    return {
        lat: Math.random() * (180) - 90,
        lon: Math.random() * (360) - 180
    };
}

// Gerar localização aleatória para o usuário
const localUsuario = gerarLocalizacaoAleatoria();

// Recomendar um restaurante com base na localização aleatória do usuário
const restauranteRecomendado = recomendarRestaurante(localUsuario);

// Exibir resultado
console.log(restauranteRecomendado ? "Recomendamos que você visite o " + restauranteRecomendado.nome : "Não foi possível recomendar um restaurante próximo.");
