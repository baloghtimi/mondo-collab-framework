package org.mondo.collaboration.security.mpbl.client.ui.util;

import org.eclipse.viatra.query.patternlanguage.emf.vql.Variable;

public class LockModel {
    
    public Variable variable;
    public Object value;

    public LockModel(Variable variable) {
        super();
        this.variable = variable;
    }

}
