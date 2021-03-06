package quotes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuoteService {

    private final static List<Quote> FRASES_CHUCK_NORRIS = Arrays.asList(
        new Quote("Chuck Norris luchó en la guerra del golfo él solo, en ambos bandos, y ganó."),
        new Quote("El Cañón del Colorado es producto de un arranque de tos de Chuck Norris."),
        new Quote("Chuck Norris no se afeita, se da patadas en la cara. Lo único que corta a Chuck Norris es Chuck Norris."),
        new Quote("Chuck Norris no nació, se sacó a sí mismo a patadas del vientre de su madre. Poco después, le creció barba."),
        new Quote("Chuck Norris vende su orina en lata. Se la conoce como Red Bull."),
        new Quote("Cuando Chuck Norris manda su declaración de la renta, envía los formularios en blanco e incluye una foto suya, en guardia y listo para atacar. Chuck Norris nunca ha tenido que pagar sus impuestos."),
        new Quote("Chuck Norris no se moja, el agua se impregna de Chuck al tocarlo."),
        new Quote("Cuando Chuck Norris va a donar sangre no usa jeringuillas, pide un cubo y un cuchillo."),
        new Quote("Chuck Norris es la razón por la que Wally se esconde."),
        new Quote("Chuck Norris ha sido la unica persona que ha contado hasta el infinito... comenzando por el final!.....con todos los decimales!!......DOS VECES!!!!"),
        new Quote("El Hombre del Saco mira siempre debajo de la cama y se va a dormir temprano porque teme a Chuck Norris."),
        new Quote("Chuck Norris ha estado en Marte, lo que explica por qué no hay signos de vida."),
        new Quote("Chuck Norris nunca llega tarde. Es el tiempo el que se adelanta."),
        new Quote("McGyver puede construir un avión con un clip y un rollo de cinta adesiva. Chuck Norris puede construir un clip con un avión."),
        new Quote("Chuck Norris pidió un Big Mac en un Burger King y se lo hicieron."),
        new Quote("Chuck Norris instaló el Windows XP en un ZX Spectrum cuando Bill Gates aún no había nacido."),
        new Quote("La escena inicial de Salvar al Soldado Ryan está basada en un partido de balón prisionero que Chuck Norris jugó en segundo de primaria."),
        new Quote("Chuck Norris se comió una tarta entera antes de que sus amigos pudieran decirle que había una stripper dentro."),
        new Quote("James Cameron pensó en Chuck Norris para el papel de Terminator, pero se dió cuenta que parecería un documental y eligió a Arnold Schwarzenegger."),
        new Quote("Godzilla es un homenaje de su primera visita a Tokio."),
        new Quote("Cuando Bruce Banner se enoja, se transforma en Hulk. Cuando Hulk se enoja, se transforma en Chuck Norris."),
        new Quote("\"La matanza de Texas\" originalmente fue protagonizada por Chuck. Todo el reparto murió, incluida la cinta. Tuvieron que volver a grabarla."),
        new Quote("Chuck Norris jugó a la ruleta rusa con un revolver completamente cargado y ganó."),
        new Quote("Hay un orden en el universo: Espacio, tiempo y Chuck Norris.... estaba bromeando... Chuck Norris es el primero."),
        new Quote("La NASA investiga la posibilidad de vivir en otros planetas. Es la única esperanza de huir de Chuck Norris."),
        new Quote("Cuando sube al ascensor, Chuck Norris no pulsa ningún botón. Más le vale al ascensor saber a qué piso necesita ir Chuck Norris."),
        new Quote("Un oso trató de devorar a Chuck Norris. Chuck le mostró su mejor golpe y el oso decidió devorarse a sí mismo, ya que era la forma menos dolorosa de morir."),
        new Quote("El universo no está en continua expansión. Sólo quiere huir de Chuck Norris."),
        new Quote("La kriptonita a la que tanto teme Superman es tan solo un moco de Chuck Norris solidificado."),
        new Quote("Cuando alguien dice \"nadie es perfecto\", Chuck Norris se lo toma como un insulto personal."),
        new Quote("Chuck Norris duerme con una almohada bajo su arma."),
        new Quote("El camino más corto entre dos puntos no es la línea recta, es el que sigue Chuck Norris."),
        new Quote("El pulso de Chuck Norris se mide en la escala Richter."),
        new Quote("Chuck Norris no hace strikes en los bolos, tira uno y los 9 restantes se desmayan."),
        new Quote("La pluma es más fuerte que la espada... cuando es Chuck Norris el que usa la pluma."),
        new Quote("Chuck Norris es vegetariano, lo que significa que no come nada hasta haberlo dejado en estado vegetativo con sus propias manos."),
        new Quote("La marea no baja: es Chuck Norris que está bebiendo agua."),
        new Quote("Los agujeros negros son lugares donde Chuck Norris dio un puñetazo."),
        new Quote("Las patadas giratorias de Chuck Norris giran hacia los dos lados...a la vez."),
        new Quote("Chuck Norris es capaz de convertir ficheros PDF a Word con el buscaminas."),
        new Quote("Chuck Norris bebe napalm para calmar el ardor de estómago."),
        new Quote("Cuando Chuck Norris juega al Monopoly, la economía mundial se ve alterada."),
        new Quote("Chuck Norris ganó una carrera de fórmula uno... empujando el coche."),
        new Quote("Si no conoces a tu padre biológico, probablemente sea Chuck Norris."),
        new Quote("La única mano que gana a una escalera de color es la de Chuck Norris."),
        new Quote("Para Chuck Norris, expresiones como \"disco duro\", \"día duro\" o \"cara dura\" carecen de sentido. Todo es blando como el talco después de unos puñetazos. Nada es lo suficientemente duro para Chuck Norris, excepto Chuck Norris."),
        new Quote("Chuck Norris es capaz de ganar al ajedrez jugando con negras... sólo con el rey."),
        new Quote("En realidad el Coyote no perseguía al Correcaminos. Chuck Norris les perseguía a ambos."),
        new Quote("Puedes intentar huir de Chuck Norris, pero sólo conseguirás morir cansado."),
        new Quote("En una ocasión, Chuck Norris envió un correo electrónico y se dio cuenta de que había olvidado firmarlo. Agarró el cable de conexión y sacó el mensaje a golpes, tras lo cual le añadió la firma y lo envió a su destino propinándole una patada giratoria. Jamás ningún otro mensaje ha viajado más rápido, dentro o fuera de la red."),
        new Quote("La eterna juventud de Chuck Norris se debe a que la vejez nunca ha reunido el valor suficiente para alcanzarle. Nada alcanza a Chuck Norris sin permiso de Chuck Norris."),
        new Quote("Si ves a Chuck Norris disparándose a la cabeza con un Magnum 44 no te alarmes, simplemente está sacándose la cera de los oídos."),
        new Quote("Chuck Norris no utiliza un teclado en su ordenador. En lugar de eso, mira fijamente la pantalla hasta que sus pensamientos aparecen en ella."),
        new Quote("La Convención de Ginebra prohíbe el uso de Chuck Norris como arma de destrucción masiva."),
        new Quote("Chuck Norris va al baño una vez al mes, tanto si lo necesita como si no."),
        new Quote("Chuck Norris no necesita un mando a distancia para su televisor. Simplemente clava su mirada en él y el televisor cambia los canales solo."),
        new Quote("Chuck Norris es la única persona que ha ganado una medalla olímpica de natación sin ni siquiera mojarse."),
        new Quote("Dicen que un rayo nunca golpea dos veces el mismo lugar. Tampoco Chuck Norris. Ni falta que le hace."),
        new Quote("Hace tiempo Chuck Norris sufrió un ataque de corazón. El corazón perdió, por supuesto."),
        new Quote("Chuck Norris no deja mensajes. Chuck Norris deja advertencias."),
        new Quote("Chuck Norris no levanta la tapa al orinar. La tapa se levanta sola al entrar él en el cuarto de baño. De hecho generalmente la tapa sale corriendo."),
        new Quote("Como buen vaquero, Chuck Norris es capaz de ordeñar una vaca sólo mirándola a los ojos. Del mismo modo es capaz de extraer del animal whisky, galletas saladas en forma de niño y televisores de 27 pulgadas."),
        new Quote("Chuck Norris considera que sólo Chuck Norris queda elegante con una capa sobre los hombros. Es por ello que tantos actores han encarnado a Batman y Supermán antes de desaparecer en circunstancias misteriosas."),
        new Quote("Cualquiera puede afirmar que Chuck Norris es el hombre de sus sueños. Pero es Chuck Norris quien decide en los sueños de quién aparece."),
        new Quote("Chuck Norris creó la atmósfera con el único propósito de poder propulsar fuera de ella a la gente con sus patadas giratorias."),
        new Quote("Chuck Norris es capaz de darle una patada voladora a la lámpara de su dormitorio y acostarse antes de que la luz desaparezca."),
        new Quote("La única manera de sobrevivir a un ataque nuclear es ser Chuck Norris."),
        new Quote("Si alguna vez has vencido a Chuck Norris en un juego, evidentemente no comprendiste las reglas."),
        new Quote("Chuck Norris puede hablar en Braille."),
        new Quote("Freddy Krueger tiene pesadillas con Chuck Norris."),
        new Quote("Chuck Norris es a menudo comparado con un tsunami: si lo ves venir, ya es demasiado tarde."),
        new Quote("Chuck Norris no ha utilizado un signo de interrogación en su vida. Siempre afirma que preguntar es síntoma de debilidad y que sus métodos de interrogación son mucho mejores."),
        new Quote("Los extraterrestres existen, pero esperan a que Chuck Norris muera antes de atacar."),
        new Quote("En una ocasión Chuck Norris visitó las Islas Vírgenes, hoy conocidas simplemente como las Islas."),
        new Quote("Sólo para dejar claro que no es un gran amante de la naturaleza, en una ocasión Chuck Norris mató una nube."),
        new Quote("Chuck Norris sólo utiliza las salidas de emergencia, porque cuando eres Chuck Norris TODO es una emergencia."),
        new Quote("Chuck Norris jamás mojó su cama cuando era niño. Su cama se mojaba sola de miedo."),
        new Quote("Chuck Norris es capaz de dibujar un mapa completo del metro de Londres meando en la nieve."),
        new Quote("Chuck Norris creó todos los efectos de sonido de la película \"La Guerra de las Galaxias\" usando sólo las manos y los sobacos."),
        new Quote("Una vez, Chuck Norris se pasó el Super Mario Bros 3 sin tocar el mando. Sólo le gritó al televisor mientras se comía un bocata, y el juego se pasó a sí mismo por puro miedo."),
        new Quote("El frigorífico de Chuck Norris está puesto al cero absoluto."),
        new Quote("Chuck Norris puede cerrar de un golpe una puerta giratoria."),
        new Quote("Las brújulas no apuntan hacia el norte, apuntan hacia Chuck Norris."),
        new Quote("Chuck Norris puede usar Windows sin que se cuelgue."),
        new Quote("Chuck Norris no lleva reloj. Él decide qué hora es."),
        new Quote("Chuck Norris lleva sandalias con calcetines porque nadie, NUNCA, se ha atrevido a decirle nada."),
        new Quote("Aunque la tercera ley de Newton dice que hay una reacción por cada acción, no hay reacción a una patada de Chuck Norris."),
        new Quote("En un combate entre Batman y Darth Vader, el vencedor es Chuck Norris."),
        new Quote("Chuck Norris no escribe libros, las palabras se agrupan solas por miedo."),
        new Quote("Antes de grabar un nuevo capítulo de \"Walker, ranger de Texas\", Chuck Norris se toma una dosis cinco veces superior a lo normal de tranquilizante para elefantes. Esto lo hace, por supuesto, para limitar su fuerza y movilidad, en un intento de reducir el número de bajas de los actores contra los que lucha, con escasos resultados."),
        new Quote("Las patadas de Chuck Norris no matan, sólo eliminan al objetivo del continuo espacio-tiempo."),
        new Quote("En el comienzo fue la nada. Entonces Chuck Norris le dió una patada en la cara y le dijo \"búscate un trabajo\". Así empezó el universo."),
        new Quote("Chuck Norris puede ganar al cuatro en raya en dos movimientos."),
        new Quote("El primer eclipse solar se produjo cuando Chuck Norris retó al sol a ver quién pestañeaba primero."),
        new Quote("Chuck Norris no tiene sombra. La mató con una patada giratoria por perseguirle."),
        new Quote("El oxígeno requiere de Chuck Norris para existir."),
        new Quote("Chuck Norris no corta el césped de su casa, simplemente lo mira y le dice que se atreva a crecer."),
        new Quote("Los coches fueron inventados para huir más rápido de Chuck Norris."),
        new Quote("Chuck Norris puede escuchar el silencio."),
        new Quote("El número pi no es infinito, se acaba cuando Chuck Norris lo dice."),
        new Quote("La tierra no gira, simplemente intenta huir de Chuck Norris."),
        new Quote("Cada calavera de dinosaurio encontrada tiene la marca de una bota de vaquero de la talla 42 en su boca. Los científicos están sorprendidos, pero todos sabemos la razón."),
        new Quote("Hace veinticinco años Chuck Norris retó a una estatua a mirarse mutuamente sin pestañear. A día de hoy sigue imbatido."),
        new Quote("Chuck Norris ganó la Primera y la Segunda Guerra Mundial él solo."),
        new Quote("Chuck Norris puede comer sopa con un tenedor."),
        new Quote("Los muñecos de acción de Chuck Norris han dormido con más mujeres que cualquier otro hombre, excepto el propio Chuck Norris."),
        new Quote("Chuck Norris no esquiva las balas, las balas esquivan a Chuck Norris."),
        new Quote("Si no lo consigues a la primera, evidentemente no eres Chuck Norris."),
        new Quote("Una vez un hombre le preguntó si su nombre era Charles. Chuck Norris no respondió, simplemente se le quedó mirando hasta que el hombre explotó en mil pedazos."),
        new Quote("Cuando Chuck Norris estaba en la escuela, su profesor de lengua le encargó un trabajo acerca de qué era el coraje. Chuck Norris sacó matrícula de honor sólo por escribir \"Chuck Norris\" y entregar el papel."),
        new Quote("Chuck Norris puede dividir entre cero."),
        new Quote("En la última página del Libro Guinness de los Récords se avisa que todos los récords mundiales pertenecen a Chuck Norris, y aquellos listados en el libro son sólo los más cercanos que nadie ha podido conseguir jamás."),
        new Quote("No hay mentón tras la barba de Chick Norris, tan sólo otro puño."),
        new Quote("Chuck Norris apostó una vez contra la NASA a que podía sobrevivir a una entrada en la atmósfera desde el espacio sin traje protector. El 19 de julio de 1999, un Chuck Norris desnudo reentró en la atmósfera terrestre recorriendo 14 estados y alcanzando una temperatura de 3.000 grados. La NASA, avergonzada, publicó que había sido un meteorito, y le sigue debiendo una cerveza."),
        new Quote("Alguien intentó decirle una vez a Chuck Norris que las patadas giratorias no son la mejor manera de dar una patada a alguien. Este hecho ha sido registrado por los historiadores como el peor error que nadie ha cometido jamás."),
        new Quote("Los dinosaurios miraron mal a Chuck Norris una vez. UNA vez."),
        new Quote("Chuck Norris siempre habla de sí mismo en tercera persona (a veces incluso en cuarta). Los expertos coinciden en creer que también ve en tercera persona."),
        new Quote("Sólo Chuck Norris escribe en el blog de Chuck Norris. Cualquier otra persona que haya deseado hacerlo ha perecido antes de tocar al teclado siquiera."),
        new Quote("Casi todo el mundo utiliza pijamas de Supermán, pero Supermán usa pijamas de Chuck Norris."),
        new Quote("Chuck Norris puede tocar la novena sinfonía de Beethoven en el triángulo... de memoria."),
        new Quote("Chuck Norris puede cantar en un instrumental."),
        new Quote("Chuck Norris puede tocar la guitarra, el bajo, la bateria y varias guitarras a la vez, en directo y sin perder el tiempo."),
        new Quote("Chuck Norris toca la guitarra sin tocar ninguna cuerda, tan solo le advierte a la guitarra de que debe sonar."),
        new Quote("Chuck Norris no duerme. Espera."),
        new Quote("Chuck Norris borró la papelera de reciclaje."),
        new Quote("Una vez una cobra mordió a Chuck Norris en una pierna. Después de cinco días de agónico dolor, la cobra murió."),
        new Quote("Chuck Norris va a 1.000.000 km/s cuando esta quieto."),
        new Quote("Chuck Norris plancha su ropa llevándola puesta."),
        new Quote("Chuck Norris metió una vez un zapato en una jaula y cantó."),
        new Quote("El Chuck es la medida del sistema internacional del dolor."),
        new Quote("Una vez Chuck Norris partició en la Ruleta de la Fortuna. Como tiró primero, los 30 minutos del programa consistieron en la ruleta dando vueltas. Ésta es la razón del cambio de plató del programa."),
        new Quote("Cuando Chuck Norris entra en una habitación no enciende la luz, apaga la oscuridad."),
        new Quote("Chuck Norris ganó un concurso sobre permanecer debajo del agua y ganó. Cabe destacar que su contrincante era pez."),
        new Quote("Chuck Norris puede tocar el violín con un piano."),
        new Quote("Chuck Norris se ata los cordones de los zapatos con los pies."),
        new Quote("Vin Diesel puede ser muy duro, pero Chuck Norris le hizo protagonizar \"Un Canguro Superduro\"."),
        new Quote("Una vez Chuck Norris se apostó algo con Superman. El perdedor debía de llevar los calzoncillos por fuera el resto de su vida."),
        new Quote("El látigo de Indiana Jones esta trenzado con pelo de la barba de Chuck"),
        new Quote("El dia dura las horas que Chuck Norris necesite."),
        new Quote("Chuck Norris no necesita cortinas. Nadie se atreve a mirar por las ventanas de su casa."),
        new Quote("Chuck Norris usa el papel de lija como servilletas."),
        new Quote("Chuck no conoce el miedo; no ha tenido ese placer."),
        new Quote("A Chuck Norris no se le retrasan los vuelos."),
        new Quote("Chuck Norris se puede rascar el codo derecho con la mano derecha."),
        new Quote("Chuck Norris se corta las uñas de la mano izquierda con la mano izquierda."),
        new Quote("Chuck Norris es la única persona que puede ganar al ajedrez en el primer turno, sólo con un peón."),
        new Quote("Chuck Norris pudo inflar las ruedas de su coche tan sólo con la fuerza de sus pulmones. Los neumáticos estaban pinchados, por cierto."),
        new Quote("Una vez Chuck Norris hizo una piedra tan grande que ni él podía moverla. Y la movió."),
        new Quote("Se sabe que la última vez que Chuck Norris pegó una patada, ocurrió una pequeña cosita llamada Big-Bang."),
        new Quote("Chuck Norris puede respirar bajo el agua... y bajo el fuego."),
        new Quote("Chuck Norris cabalgó el caballo de Troya."),
        new Quote("Como las matronas rusas, si abres a Chuck Norris dentro encontraras uno más pequeño y mas cabreado."),
        new Quote("Chuck Norris en latín significa \"muerte por patada giratoria\"."),
        new Quote("Una vez Chuck Norris peleó con un oso, un cocodrilo y un león al mismo tiempo. Les ganó atándolos con una anaconda."),
        new Quote("El Programa de Protección de Testigos fue creado para proteger a la gente que había visto a Chuck Norris."),
        new Quote("La mayoría de la gente tiene 23 pares de cromosomas. Chuck Norris tiene 72... y todos venenosos."),
        new Quote("Si buscas en Google \"Chuck Norris siendo apaleado\" te da 0 resultados, simplemente no puede suceder."),
        new Quote("Una encuesta reciente ha revelado que el 93% de las mujeres piensan en Chuck Norris mientras hacen el amor, una encuesta similar descubrió que Chuck Norris piensa en Chuck Norris el 100% de las veces que hace el amor."),
        new Quote("Chuck Norris siempre consigue sexo en la primera cita, SIEMPRE."),
        new Quote("Chuck Norris puede mezclar el agua y el aceite revolviendolos con un dedo."),
        new Quote("Si te cruzas con un gato negro tendrás 7 años de mala suerte. Pero si un gato negro se cruza con Chuck Norris, perderá sus 7 vidas de una patada giratoria propinada por Chuck Norris."),
        new Quote("Chuck Norris puede cambiar, si quiere, tu ADN de una patada giratoria."),
        new Quote("Chuck Norris es lo que va antes de Alfa y despues de Omega."),
        new Quote("La Primera Ley de la Termodinámica afirma que la energía ni se crea ni se destruye, excepto si se encuentra con Chuck Norris."),
        new Quote("Chuck Norris puede empezar una casa por el tejado."),
        new Quote("Cuando Chuck le da cuerda a un mecanismo, este no se detiene nunca."),
        new Quote("Chuck Norris convirtió un disco duro en blando."),
        new Quote("Chuck Norris escaló el Everest para ver si podía tocar el cielo, y lo consiguió. Después lo bajó esquiando con un sólo esquí. Se trajo un trozo como trofeo."),
        new Quote("Chuck Norris rescató al capitán Nemo de las profundidades del océano, a pulmón."),
        new Quote("Cuando Neil Armstrong estuvo en la Luna, encontró una nota escrita que ponía: \"Chuck estuvo aquí\".")
    );

    public static Quote randomQuote() {
        Collections.shuffle(FRASES_CHUCK_NORRIS);

        return FRASES_CHUCK_NORRIS.get(0);
    }
}
