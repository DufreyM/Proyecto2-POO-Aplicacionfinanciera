 //Fecha de creación: 05 de septiembre de 2023
//Fecha de última modificación: 05 de octubre de 2023
public class EducacionFinanciera {
    private int edadUsuario;


    public EducacionFinanciera() {
        edadUsuario = 0;
    }

    public EducacionFinanciera(int edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

    public int getEdadUsuario() {
        return edadUsuario;
    }

    public void setEdadUsuario(int edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

    // Métodos para Consejos a Adultos
    public void planificacionFinancieraPersonalAdul() {
        System.out.println(
        "\n¿Que es la planificacion financiera personal?:\n" +
        "\nLa planificación financiera personal es básicamente un plan o un conjunto de pasos \n" + 
        "que sigues para administrar tu dinero de manera inteligente.\n" +
        "\n¿Por qué es importante?\n" +
        "Bueno, porque te ayuda a alcanzar tus metas financieras a largo plazo, como comprar un auto, ir a la universidad, \n" +
        "o incluso retirarte cómodamente cuando seas mayor.");
    }

    public void ahorroInversionAdul() {
        System.out.println(
        "\nUn consejo fundamental para un adulto que desea ahorrar es:\n" +
        "\nEstablece un presupuesto y lleva un registro de tus gastos\n" +
        "\nLa base del ahorro efectivo es saber exactamente cuánto dinero entra y sale de tu bolsillo.\n" +
        "Crea un presupuesto detallado que incluya tus ingresos y gastos mensuales.\n" +
        "Luego, registra tus gastos diarios para asegurarte de que estás siguiendo tu presupuesto.\n" +
        "Al hacerlo, identificarás áreas en las que puedes reducir gastos innecesarios y encontrarás oportunidades para ahorrar más dinero. \n" +
        "Un seguimiento riguroso de tus finanzas te permitirá tomar decisiones informadas y controlar tus hábitos de gasto,\n" +
        "lo que te ayudará a aumentar tus ahorros a lo largo del tiempo.\n" + 
        "---------------------------------------------------------------------------------------------------------------------------------------------------------------\n" +
        "\nUn consejo importante para un adulto que desea comenzar a invertir es:\n" +
        "\nDiversifica tus inversiones\n" +
        "\nEn lugar de poner todos tus recursos en un solo tipo de inversión, como acciones de una sola empresa,\n" +
        "diversifica tu cartera de inversiones. Esto significa distribuir tu dinero en diferentes tipos de activos,\n" +
        "como acciones, bonos, bienes raíces y otros instrumentos financieros.\n" +
        "La diversificación ayuda a reducir el riesgo de pérdida significativa, ya que si un tipo de inversión sufre, \n" +
        "es probable que otros lo compensen. Consulta con un asesor financiero o investiga\n" +
        "diferentes opciones de inversión para construir una cartera diversificada que se adapte a tus objetivos financieros y\n" + 
        "tolerancia al riesgo. Recuerda que la diversificación no elimina el riesgo por completo\n" +
        "pero puede ayudarte a administrarlo de manera más efectiva a largo plazo.");
    }

    public void gestionDeDeudasAdul() {
        System.out.println(
        "\nUn consejo importante para un adulto sobre la gestión de deudas es:\n" +
        "\nPrioriza el pago de deudas con tasas de interés más altas:\n" +
        "\nSi tienes varias deudas pendientes, como tarjetas de crédito, préstamos personales o hipotecas, \n" +
        "es fundamental priorizar el pago de las deudas con tasas de interés más altas. Esto te ayudará a reducir\n" +
        "los intereses acumulados y a liberarte más rápidamente de las deudas costosas. Paga el \n" +
        "mínimo en las deudas de menor interés y destina cualquier dinero adicional al pago de la deuda con la tasa de interés más alta. \n" +
        "Una vez que hayas liquidado la deuda más cara, puedes enfocarte en las siguientes. Esta estrategia se llama (snowball) \n" +
        "o (avalanche) y puede ayudarte a ahorrar dinero a largo plazo y mejorar tu salud financiera.");
    }

    public void educacionSobreImpuestosAdul() {
        System.out.println(
        "\nUn consejo importante para un adulto en relación con los impuestos es:\n" +
        "\nMantén registros y documentos financieros organizados\n" +
        "\nLlevar un registro meticuloso de tus transacciones financieras, recibos y documentos relacionados\n" +
        "con los impuestos es esencial. Esto incluye declaraciones de impuestos anteriores,\n" +
        "facturas médicas, recibos de donaciones caritativas, y cualquier otro documento relevante. Mantener tus registros organizados\n" +
        "te ayudará a cumplir con tus obligaciones fiscales de manera efectiva, aprovechar todas las deducciones y créditos fiscales \n" +
        "disponibles y reducir el estrés al presentar tus impuestos. Además, mantener los registros\n" +
        "organizados puede ser útil en caso de una auditoría fiscal, ya que tendrás documentación para\n" +
        "respaldar tus declaraciones de impuestos. Considera la posibilidad de utilizar\n" +
        "software de contabilidad o aplicaciones móviles para facilitar el seguimiento de tus finanzas y documentos fiscales.");
    }

    public void manejoDelCreditoAdul() {
        System.out.println(
        "\nUn consejo esencial para un adulto en relación con el manejo del crédito es:\n" +
        "\nUtiliza el crédito de manera responsable y consciente:\n" +
        "\nEl crédito puede ser una herramienta valiosa, pero también puede ser peligroso si se utiliza de \n" +
        "manera irresponsable. Aquí hay algunas pautas clave:\n" +
        "\n1. Paga a tiempo \n" + 
        "Asegúrate de hacer los pagos de tus tarjetas de crédito y préstamos a tiempo. Los pagos atrasados pueden tener un \n" +
        "impacto negativo en tu puntaje crediticio y resultar en cargos por mora.\n" +
        "\n2. Mantén un bajo saldo de crédito\n" +        
        "Intenta mantener tus saldos de tarjeta de crédito por debajo del 30% del límite de crédito disponible. \n" +
        "Esto ayuda a mantener un buen puntaje crediticio y demuestra responsabilidad financiera.\n" +
        "\n3. No abras demasiadas cuentas de crédito\n" +        
        "Cada vez que solicitas una nueva tarjeta de crédito, puede afectar tu puntaje crediticio.\n" +
        "Solo abre nuevas cuentas cuando sea necesario y maneja con cuidado todas tus líneas de crédito.\n" +
        "\n4. Establece un presupuesto\n" +        
        "Ten un presupuesto claro y realista que te permita saber cuánto \n" +
        "puedes permitirte gastar y pagar en términos de crédito. ");
    }

    public void planificacionParaElFuturoAdul() {
        System.out.println(
        "\nUn consejo crucial para la planificación financiera a largo plazo de un adulto es:\n" +
        "\nEstablece metas financieras claras y específicas\n" +
        "\nDefine metas financieras a largo plazo que sean claras, específicas y alcanzables. \n" +
        "Estas metas pueden incluir la jubilación, la compra de una vivienda, la educación de tus hijos,\n" +
        "la creación de un fondo de emergencia o cualquier otro objetivo financiero que tengas en mente.\n" +
        "Una vez que hayas establecido tus metas, desarrolla un plan financiero que incluya los pasos necesarios para alcanzarlas.\n" +
        "\nAquí hay algunas pautas adicionales:\n" +
        "\n1. Prioriza el ahorro \n" + 
        "Haz del ahorro una parte fundamental de tu plan financiero. \n" +
        "Destina una porción de tus ingresos a una cuenta de ahorros o inversión a largo plazo.\n" +
        "\n2. Invierte sabiamente\n" +        
        "Aprende sobre diferentes opciones de inversión y busca oportunidades que sean adecuadas para tus objetivos a largo plazo.\n" +
        "Considera hablar con un asesor financiero para obtener orientación.\n" +
        "\n3. Reduce las deudas\n" +        
        "Trabaja para pagar deudas, especialmente aquellas con tasas de interés altas,\n" +
        "ya que las deudas pueden obstaculizar tu capacidad de ahorrar e invertir.\n" +
        "\n4. Considera un fondo de emergencia\n" +        
        "Mantén un fondo de emergencia con suficiente dinero para cubrir gastos inesperados,\n" +
        "como facturas médicas o reparaciones de emergencia.");
    }

    // Métodos para Consejos a Adolescentes
    public void ahorroInversionAdolescente() {
        System.out.println(
            "Un consejo valioso para un adolescente que desea aprender sobre ahorro e inversión es:\n" +
            "\nComienza a ahorrar temprano y establece metas financieras claras\n" +
            "\nAprovecha la ventaja de empezar a ahorrar a una edad temprana. \n" +
            "Establece metas financieras claras y específicas, como ahorrar para comprar tu primer automóvil, \n" +
            "costear la educación universitaria o para un futuro emprendimiento. Luego, sigue estos consejos:\n" +
            "\n1. Crea un presupuesto\n" +
            "Aprende a hacer un presupuesto que te ayude a controlar tus gastos y a identificar \n" +
            "cuánto puedes ahorrar de tus ingresos o asignación.\n" +
            "\n2. Abre una cuenta de ahorro\n" +
            "Considera abrir una cuenta de ahorro específica para tus metas financieras. \n" +
            "Busca una cuenta que ofrezca una tasa de interés decente para que tu dinero crezca con el tiempo.\n" +
            "\n3. Aprende sobre la inversión\n" +
            "Investiga y aprende sobre diferentes opciones de inversión, como fondos mutuos,\n" +
            "acciones o inversiones en línea. Comprender cómo funcionan estas opciones \n" +
            "te ayudará a tomar decisiones informadas.\n" +
            "\n4. Diversifica tus inversiones\n" +
            "Si decides invertir, diversifica tu cartera para reducir el riesgo. \n" +
            "No pongas todos tus recursos en una sola inversión. La diversificación puede \n" +
            "ayudarte a manejar el riesgo y mejorar tus posibilidades de crecimiento a largo plazo.\n" +
            "\n5. Mantén un registro\n" +
            "Lleva un registro de tus ahorros e inversiones. Esto te ayudará a \n" +
            "mantenerte enfocado en tus metas y a realizar un seguimiento de tu progreso.\n" +
            "\n6. Consulta con tus padres o un mentor\n" +
            "Si tienes dudas o necesitas orientación, no dudes en hablar con tus padres, \n" +
            "un mentor financiero o un asesor financiero. Pueden ofrecerte valiosos consejos y responder a tus preguntas.\n" +
            "\n7. Ten paciencia\n" +
            "El ahorro y la inversión son a largo plazo. No esperes resultados inmediatos. \n" +
            "Mantén la disciplina y la paciencia a medida que trabajas hacia tus metas financieras."
        );
    }

    public void gestionDeDineroAdolescente() {
        System.out.println(
            "Un consejo valioso para un adolescente sobre la gestión del dinero es:\n" +
            "\nAprende a diferenciar entre 'necesidades' y 'deseos'\n" +
            "\nEs esencial comprender la diferencia entre las necesidades básicas y los deseos. \n" +
            "Las necesidades son cosas esenciales para tu vida, como comida, vivienda, educación y atención médica. \n" +
            "Los deseos son cosas que son agradables de tener pero no son esenciales, como entretenimiento,\n" +
            "ropa de marca o dispositivos electrónicos de última generación.\n" +
            "\nAquí hay algunas pautas adicionales:\n" +
            "\n1. Prioriza tus necesidades\n" +
            "Asegúrate de satisfacer primero tus necesidades básicas antes de gastar en deseos. \n" +
            "Esto significa asegurarte de tener suficiente dinero para alimentos, vivienda y \n" +
            "otras necesidades esenciales antes de gastar en entretenimiento u otros caprichos.\n" +
            "\n2. Establece un presupuesto\n" +
            "Aprende a hacer un presupuesto que refleje tus ingresos y gastos. \n" +
            "Esto te ayudará a tener un control claro de tus finanzas y a evitar gastos impulsivos.\n" +
            "\n3. Ahorra una parte de tus ingresos\n" +
            "Establece el hábito de ahorrar parte de tu dinero en lugar de gastarlo todo. \n" +
            "Incluso una pequeña cantidad ahorrada regularmente puede sumar con el tiempo.\n" +
            "\n4. Compara precios y busca ofertas\n" +
            "Antes de hacer una compra, compara precios y busca ofertas o descuentos. \n" +
            "Aprende a ser un consumidor inteligente y a evitar gastar en cosas \n" +
            "que podrías obtener de manera más económica.\n" +
            "\n5. Evita las deudas innecesarias\n" +
            "No te endeudes para comprar cosas que no son esenciales. \n" +
            "Las deudas pueden acumularse rápidamente y dificultar la gestión de tu dinero.\n"
        );
    }

    public void educacionSobreImpuestoAdolescente() {
        System.out.println(
            "Un consejo importante para un adolescente en relación con la paga de impuestos es:\n" +
            "\nComprende tus obligaciones fiscales\n" +
            "\nAunque los adolescentes pueden tener ingresos de trabajos a tiempo parcial o \n" +
            "actividades independientes, es importante comprender que pueden tener obligaciones fiscales. \n" +
            "Aquí hay algunas pautas:\n" +
            "\n1. Aprende sobre tus ingresos gravables\n" +
            "Comprende qué tipos de ingresos están sujetos a impuestos y cuáles no. \n" +
            "En algunos casos, como trabajos a tiempo parcial, es posible que debas presentar \n" +
            "una declaración de impuestos si ganas por encima de cierto umbral.\n" +
            "\n2. Completa tus formularios adecuadamente\n" +
            "Si tienes un trabajo, asegúrate de completar los formularios de impuestos adecuados,\n" +
            "como el formulario W-4 en los Estados Unidos. Esto determinará cuánto se retiene de tu salario para impuestos.\n" +
            "\n3. Guarde los registros adecuadamente\n" +
            "Mantén registros de tus ingresos y gastos relacionados con tus actividades económicas,\n" +
            "como un trabajo a tiempo parcial. Esto te ayudará a presentar una declaración precisa de impuestos.\n" +
            "\n4. Consulta con un adulto de confianza o un profesional de impuestos\n" +
            "Si tienes dudas sobre tus obligaciones fiscales, considera hablar \n" +
            "con tus padres o tutores legales o consultar con un profesional de impuestos. \n" +
            "Pueden ayudarte a entender tus responsabilidades fiscales y a presentar tus declaraciones correctamente.\n" +
            "\n5. Ahorra para los impuestos\n" +
            "Si es posible que debas pagar impuestos al final del año, considera ahorrar\n" +
            "una parte de tus ingresos para cubrir esta obligación. No querrás \n" +
            "sorprenderte con una deuda de impuestos que no puedes pagar.\n");
    }

    public void manejoDelCreditoAdolescente() {
        System.out.println(
            "Un consejo valioso para un adolescente sobre el manejo del crédito es:\n" +
            "\nUtiliza tarjetas de crédito con responsabilidad y conocimiento\n" +
            "\nSi bien es posible que los adolescentes no sean elegibles para obtener \n" +
            "una tarjeta de crédito en muchos lugares hasta que alcancen cierta edad, \n" +
            "es importante comprender cómo funcionan y cómo usarlas responsablemente \n" +
            "cuando llegue el momento. Aquí tienes algunas pautas importantes:\n" +
            "\n1. Comprende cómo funciona una tarjeta de crédito\n" +
            "Aprende cómo funciona una tarjeta de crédito, incluyendo los conceptos \n" +
            "de límite de crédito, saldo pendiente, tasas de interés y fechas de vencimiento.\n" +
            "\n2. Establece un límite de gasto personal\n" +
            "Si tienes una tarjeta de crédito o planeas obtener una en el futuro, \n" +
            "establece un límite de gasto personal. No gastes más de lo que puedes pagar al final del mes.\n" +
            "\n3. Paga tus facturas a tiempo\n" +
            "El pago puntual de tus facturas de tarjeta de crédito es esencial \n" +
            "para mantener un buen historial crediticio. Los retrasos en los pagos \n" +
            "pueden generar cargos por intereses y afectar negativamente tu puntuación crediticia.\n" +
            "\n4. Conoce las tasas de interés\n" +
            "Familiarízate con las tasas de interés de tu tarjeta de crédito. \n" +
            "Las tasas de interés altas pueden aumentar significativamente el \n" +
            "costo de cualquier saldo pendiente.\n" +
            "\n5. Evita el endeudamiento excesivo\n" +
            "No utilices tu tarjeta de crédito como un medio para gastar más allá de tus medios. \n" +
            "Solo debes utilizarla para compras que puedes pagar al final del mes.\n" +
            "\n6. Cuida tu historial crediticio\n" +
            "Tu historial crediticio es importante y puede afectar tus futuras solicitudes de crédito, \n" +
            "como préstamos para la universidad o hipotecas. Mantén un historial crediticio \n" +
            "positivo al pagar tus facturas a tiempo y evitar deudas excesivas.\n" 
        );
    }

    public void planificacionParaElFuturoAdolescente() {
        System.out.println(
            "Un consejo valioso para un adolescente sobre la planificación de su futuro financiero es:\n" +
            "\nComienza a ahorrar temprano y de manera consistente\n" +
            "\nEl ahorro temprano es una de las claves para construir un futuro financiero sólido. \n" +
            "Aquí tienes algunos pasos que pueden ayudarte:\n" +
            "\n1. Establece metas financieras\n" +
            "Identifica tus metas financieras a largo plazo. Esto podría incluir \n" +
            "pagar la educación universitaria, comprar una casa, viajar o incluso\n" +
            "iniciar tu propio negocio. Cuanto más específicas sean tus metas, \n" +
            "mejor podrás planificar para alcanzarlas.\n" +
            "\n2. Crea un presupuesto\n" +
            "Aprende a hacer un presupuesto que refleje tus ingresos y gastos. \n" +
            "Esto te ayudará a tener un control claro de tus finanzas y a evitar gastos innecesarios.\n" +
            "\n3. Ahorra regularmente\n" +
            "Destina una parte de tus ingresos a una cuenta de ahorros o inversión a largo plazo. \n" +
            "Incluso pequeñas cantidades ahorradas de manera consistente pueden crecer \n" +
            "con el tiempo debido al interés compuesto.\n" +
            "\n4. Invierte de manera informada\n" +
            "A medida que acumules ahorros, aprende sobre diferentes opciones de inversión, \n" +
            "como fondos de inversión, acciones o bienes raíces. La inversión puede ayudarte \n" +
            "a hacer crecer tu dinero a lo largo del tiempo, pero es importante hacerlo de manera informada.\n" +
            "\n5. Evita la deuda innecesaria\n" +
            "A medida que creces, es probable que te enfrentes a decisiones financieras \n" +
            "importantes, como préstamos estudiantiles o tarjetas de crédito. \n" +
            "Evita la deuda innecesaria y utiliza el crédito con responsabilidad.\n" +
            "\n6. Educa sobre impuestos\n" +
            "Aprende sobre cómo funcionan los impuestos y cómo afectarán tus ingresos en el futuro. \n" +
            "Conocer las implicaciones fiscales de tus decisiones financieras es esencial.\n"
            
        );
    }
}




    
