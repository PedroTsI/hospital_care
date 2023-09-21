export const Circle = () => {
    return (
      <div className="w-52 h-52 bg-orange-700 text-white rounded-full">
          Texto qualquer inspirador do Circulo
      </div>
    );
  }

// DIFERENÇA ENTRE EXPORT DEFAULT E EXPORT
//export default Square; //export default n importa o nome da função
// COMPONENTES AUXILIARES NAO SE EXPORTA DE FORMA PADRAO
// Sempre que puder exportar um componente sem ser default, faça!
