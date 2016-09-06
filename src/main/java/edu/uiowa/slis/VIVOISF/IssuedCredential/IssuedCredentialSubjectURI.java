package edu.uiowa.slis.VIVOISF.IssuedCredential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssuedCredentialSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssuedCredentialSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IssuedCredentialSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IssuedCredential theIssuedCredential = (IssuedCredential)findAncestorWithClass(this, IssuedCredential.class);
			if (!theIssuedCredential.commitNeeded) {
				pageContext.getOut().print(theIssuedCredential.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IssuedCredential for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssuedCredential for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			IssuedCredential theIssuedCredential = (IssuedCredential)findAncestorWithClass(this, IssuedCredential.class);
			return theIssuedCredential.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing IssuedCredential for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssuedCredential for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			IssuedCredential theIssuedCredential = (IssuedCredential)findAncestorWithClass(this, IssuedCredential.class);
			theIssuedCredential.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing IssuedCredential for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssuedCredential for subjectURI tag ");
		}
	}
}

