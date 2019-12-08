package AbstractFactory;

/**
 * This factory uses the EnemyShipFactory interface to create very specific UFO
 * Enemy Ship. This is where we define all of the parts the ship will use by
 * defining the methods implemented being ESWeapon and ESEngine
 */
public class UFOEnemyShipFactory implements EnemyShipFactory {

    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun(); // Specific to regular UFO
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOEngine(); // Specific to regular UFO
    }
}
