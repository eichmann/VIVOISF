package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasCollaboratorIterator theCompanyHasCollaboratorIterator = (CompanyHasCollaboratorIterator)findAncestorWithClass(this, CompanyHasCollaboratorIterator.class);
			pageContext.getOut().print(theCompanyHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

