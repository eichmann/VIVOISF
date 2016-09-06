package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteHasPredecessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteHasPredecessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteHasPredecessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteHasPredecessorOrganizationIterator theInstituteHasPredecessorOrganizationIterator = (InstituteHasPredecessorOrganizationIterator)findAncestorWithClass(this, InstituteHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theInstituteHasPredecessorOrganizationIterator.getHasPredecessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

