package edu.uiowa.slis.VIVOISF.Credential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CredentialRelated extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CredentialRelated currentInstance = null;
	private static final Log log = LogFactory.getLog(CredentialRelated.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CredentialRelatedIterator theCredentialRelatedIterator = (CredentialRelatedIterator)findAncestorWithClass(this, CredentialRelatedIterator.class);
			pageContext.getOut().print(theCredentialRelatedIterator.getRelated());
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for related tag ");
		}
		return SKIP_BODY;
	}
}

