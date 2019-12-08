package AbstractFactory;

/**
 * This factory uses the EnemyShipFactory interface to create very specific UFO
 * Boss Enemy Ship. This is where we define all of the parts the ship will use 
 * by defining the methods implemented being ESWeapon and ESEngine
 */
public class UFOBossEnemyShipFactory implements EnemyShipFactory {

    
    @Override
    public ESWeapon addESGun() {
        return new ESUFOBossGun(); // Specific to Boss UFO
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOBossEngine(); // Specific to Boss UFO
    }
}
