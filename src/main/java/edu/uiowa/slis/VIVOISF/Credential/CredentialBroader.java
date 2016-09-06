package edu.uiowa.slis.VIVOISF.Credential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CredentialBroader extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CredentialBroader currentInstance = null;
	private static final Log log = LogFactory.getLog(CredentialBroader.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CredentialBroaderIterator theCredentialBroaderIterator = (CredentialBroaderIterator)findAncestorWithClass(this, CredentialBroaderIterator.class);
			pageContext.getOut().print(theCredentialBroaderIterator.getBroader());
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for broader tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for broader tag ");
		}
		return SKIP_BODY;
	}
}

