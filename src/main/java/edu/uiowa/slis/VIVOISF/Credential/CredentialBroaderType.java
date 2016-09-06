package edu.uiowa.slis.VIVOISF.Credential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CredentialBroaderType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CredentialBroaderType currentInstance = null;
	private static final Log log = LogFactory.getLog(CredentialBroaderType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CredentialBroaderIterator theCredentialBroaderIterator = (CredentialBroaderIterator)findAncestorWithClass(this, CredentialBroaderIterator.class);
			pageContext.getOut().print(theCredentialBroaderIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for broader tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for broader tag ");
		}
		return SKIP_BODY;
	}
}

