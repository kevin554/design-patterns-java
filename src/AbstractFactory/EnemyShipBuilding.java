package AbstractFactory;

/**
 * EnemyShipBuilding handles orders for new EnemyShips. You send it a code using
 * the orderTheShipMethod & it sends the order to the right factory for creation
 */
public abstract class EnemyShipBuilding {

    /**
     * This acts as an ordering mechanism for creating EnemyShips that have a
     * weapon, engine & name & nothing else. The specific parts used for engine
     * & weapon depend upon the String that is passed to this method
     * @param typeOfShip 
     * @return 
     */
    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    /*
    When called a new EnemyShip is made. The specific parts are based on the
    String entered. After the ship is made we execute multiple methods in the
    EnemyShip Object
    */
    public EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);

        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShoots();

        return theEnemyShip;
    }
}
