package AccessModifiers.pakiet2;

import AccessModifiers.pakiet1.KlasaProtected1;

public class KlasaProtected3 extends KlasaProtected1 {
    @Override
    protected void metodaProtected1() {
        super.metodaProtected1();
    }
    /// mozemy dziedziczyæ te¿, pomimo ró¿nych pakietów.
}
