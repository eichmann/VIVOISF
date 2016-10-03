package edu.uiowa.slis.VIVOISF.Credential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CredentialMemberInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CredentialMemberInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CredentialMemberInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CredentialMemberInverseIterator theCredentialMemberInverseIterator = (CredentialMemberInverseIterator)findAncestorWithClass(this, CredentialMemberInverseIterator.class);
			pageContext.getOut().print(theCredentialMemberInverseIterator.getMemberInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for member tag ");
		}
		return SKIP_BODY;
	}
}

