package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyHasCollaboratorInverseIterator thePrivateCompanyHasCollaboratorInverseIterator = (PrivateCompanyHasCollaboratorInverseIterator)findAncestorWithClass(this, PrivateCompanyHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

