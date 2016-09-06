package edu.uiowa.slis.VIVOISF.Credential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CredentialSubjectAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CredentialSubjectAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CredentialSubjectAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CredentialSubjectAreaOfIterator theCredentialSubjectAreaOfIterator = (CredentialSubjectAreaOfIterator)findAncestorWithClass(this, CredentialSubjectAreaOfIterator.class);
			pageContext.getOut().print(theCredentialSubjectAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for subjectAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for subjectAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

