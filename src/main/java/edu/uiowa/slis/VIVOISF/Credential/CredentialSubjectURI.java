package edu.uiowa.slis.VIVOISF.Credential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CredentialSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CredentialSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CredentialSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Credential theCredential = (Credential)findAncestorWithClass(this, Credential.class);
			if (!theCredential.commitNeeded) {
				pageContext.getOut().print(theCredential.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Credential theCredential = (Credential)findAncestorWithClass(this, Credential.class);
			return theCredential.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Credential for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Credential theCredential = (Credential)findAncestorWithClass(this, Credential.class);
			theCredential.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for subjectURI tag ");
		}
	}
}

