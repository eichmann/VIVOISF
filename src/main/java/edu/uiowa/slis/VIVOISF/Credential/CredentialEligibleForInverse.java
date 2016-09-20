package edu.uiowa.slis.VIVOISF.Credential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CredentialEligibleForInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CredentialEligibleForInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CredentialEligibleForInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CredentialEligibleForInverseIterator theCredentialEligibleForInverseIterator = (CredentialEligibleForInverseIterator)findAncestorWithClass(this, CredentialEligibleForInverseIterator.class);
			pageContext.getOut().print(theCredentialEligibleForInverseIterator.getEligibleForInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for eligibleFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for eligibleFor tag ");
		}
		return SKIP_BODY;
	}
}

