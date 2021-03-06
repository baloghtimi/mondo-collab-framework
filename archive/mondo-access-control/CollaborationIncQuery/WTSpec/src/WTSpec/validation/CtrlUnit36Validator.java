/**
 *
 * $Id$
 */
package WTSpec.validation;

import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTCParam;

/**
 * A sample validator interface for {@link WTSpec.CtrlUnit36}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CtrlUnit36Validator {
	boolean validate();

	boolean validateInput__i1(WTCInput value);
	boolean validateOutput__o1(WTCOutput value);
	boolean validateParameter__pDelayOn(WTCParam value);
	boolean validateParameter__pDelayOff(WTCParam value);
}
