package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteHasSuccessorOrganizationIterator theInstituteHasSuccessorOrganizationIterator = (InstituteHasSuccessorOrganizationIterator)findAncestorWithClass(this, InstituteHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theInstituteHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

