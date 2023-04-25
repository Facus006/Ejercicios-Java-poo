/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author Facu
 */
public class PersonaExepcion extends Exception {

    /**
     * Creates a new instance of <code>PersonaExepcion</code> without detail
     * message.
     */
    public PersonaExepcion() {
    }

    /**
     * Constructs an instance of <code>PersonaExepcion</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public PersonaExepcion(String msg) {
        super(msg);
    }
}
