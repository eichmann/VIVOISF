package edu.uiowa.slis.VIVOISF.Credential;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CredentialLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CredentialLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CredentialLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Credential theCredential = (Credential)findAncestorWithClass(this, Credential.class);
			if (!theCredential.commitNeeded) {
				pageContext.getOut().print(theCredential.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Credential theCredential = (Credential)findAncestorWithClass(this, Credential.class);
			return theCredential.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Credential for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Credential theCredential = (Credential)findAncestorWithClass(this, Credential.class);
			theCredential.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Credential for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Credential for label tag ");
		}
	}
}

