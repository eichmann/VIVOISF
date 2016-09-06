package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolHasSuccessorOrganizationIterator theSchoolHasSuccessorOrganizationIterator = (SchoolHasSuccessorOrganizationIterator)findAncestorWithClass(this, SchoolHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theSchoolHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing School for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

