package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyHasCollaboratorIterator thePrivateCompanyHasCollaboratorIterator = (PrivateCompanyHasCollaboratorIterator)findAncestorWithClass(this, PrivateCompanyHasCollaboratorIterator.class);
			pageContext.getOut().print(thePrivateCompanyHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

