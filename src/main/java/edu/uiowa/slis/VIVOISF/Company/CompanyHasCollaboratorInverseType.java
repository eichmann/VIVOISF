package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasCollaboratorInverseIterator theCompanyHasCollaboratorInverseIterator = (CompanyHasCollaboratorInverseIterator)findAncestorWithClass(this, CompanyHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theCompanyHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

