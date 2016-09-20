package edu.uiowa.slis.VIVOISF.Credential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CredentialRelatedInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CredentialRelatedInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CredentialRelatedInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CredentialRelatedInverseIterator theCredentialRelatedInverseIterator = (CredentialRelatedInverseIterator)findAncestorWithClass(this, CredentialRelatedInverseIterator.class);
			pageContext.getOut().print(theCredentialRelatedInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for related tag ");
		}
		return SKIP_BODY;
	}
}

