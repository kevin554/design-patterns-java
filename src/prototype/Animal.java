package prototype;

/*
By making this class cloneable you are telling Java that it is ok to copy
instances of this class. These instance copies have differents results when
System.identityHashCode(System.idnetityHashCode(bike)) is called
*/
interface Animal extends Cloneable {

    public Animal makeCopy();
}
