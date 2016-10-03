package edu.uiowa.slis.VIVOISF.Credential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CredentialTopConceptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CredentialTopConceptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CredentialTopConceptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CredentialTopConceptOfIterator theCredentialTopConceptOfIterator = (CredentialTopConceptOfIterator)findAncestorWithClass(this, CredentialTopConceptOfIterator.class);
			pageContext.getOut().print(theCredentialTopConceptOfIterator.getTopConceptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

