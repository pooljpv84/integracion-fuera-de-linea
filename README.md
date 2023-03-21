## Ubicacion de Logs
src/data/logAprobados.txt
src/data/logErrores.txt

## DataBase
src/data/datos.db

## CSV
src/data/cardsclients.csv

## Integracion fuera de línea

La empresa comercial XYZ tiene una cartera de clientes amplia a nivel nacional, más de 60 mil clientes, a sus clientes se les entrega una tarjeta de afiliación por medio de la cual los cliente realizan compras a crédito y tiene que de manera mensual realizar los pagos de sus compras, la cartera no se recupera de manera rápido teniendo deudas pendientes de cobrar, por lo que la empresa decide compartir información del historial de pagos con un empresa ML1 especializada en elaborar modelos de predicción para determinar si un cliente realizará o no el pago que le corresponde en el mes; la empresa ML1 le solicita información demográfica, la cantidad de días en los que realizó el pago, valores que tenia que pagar y el valor real del pago, posterior a establecer el intercambio de información, las empresas llegan a un acuerdo para que  de manera mensual la empresa XYZ genere la información en archivos planos y se los coloque en un buzón STP de la empresa ML1, posterior la empresa ML1 lee la información de este archivo para cargar en una data de datos y realizar el procesamiento.

Diseñe e implemente por medio de la utilización un framework de integración el proceso de lectura del archivo en formato CSV para posterior a realizar algunas validaciones básicas se ingrese esta información a la base de datos.

- El valor de la factura a pagar no puede ser menor o igual a cero.
- El valor pagado no puede ser menor o igual a cero.

Al finalizar la carga se solicita que se presente un log o registros en el cual se especifique la cantidad de información que se carga y la que presento errores de validación.

Camel Java Router Project
=========================

=== How to build

To build this project use

    mvn install

=== How to run

You can run this example using

    mvn camel:run

=== More information

You can find more information about Apache Camel at the website: http://camel.apache.org/