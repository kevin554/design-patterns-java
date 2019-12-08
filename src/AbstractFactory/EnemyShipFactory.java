package AbstractFactory;

/**
 * With an Abstract Factory Pattern you won't just build ships, bus also all of
 * the components for the ships. Here is where you define the parts that are
 * required if an object wants to be an enemy ship
 */
public interface EnemyShipFactory {

    /**
     * Defines the weapon object to associate with the ship
     * @return 
     */
    public ESWeapon addESGun();

    /**
     * Defines the engine object to associate with the ship
     * @return 
     */
    public ESEngine addESEngine();
}
