package edu.uiowa.slis.VIVOISF.IssuedCredential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssuedCredentialLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssuedCredentialLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IssuedCredentialLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IssuedCredential theIssuedCredential = (IssuedCredential)findAncestorWithClass(this, IssuedCredential.class);
			if (!theIssuedCredential.commitNeeded) {
				pageContext.getOut().print(theIssuedCredential.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IssuedCredential for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssuedCredential for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			IssuedCredential theIssuedCredential = (IssuedCredential)findAncestorWithClass(this, IssuedCredential.class);
			return theIssuedCredential.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing IssuedCredential for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssuedCredential for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			IssuedCredential theIssuedCredential = (IssuedCredential)findAncestorWithClass(this, IssuedCredential.class);
			theIssuedCredential.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing IssuedCredential for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing IssuedCredential for label tag ");
		}
	}
}

