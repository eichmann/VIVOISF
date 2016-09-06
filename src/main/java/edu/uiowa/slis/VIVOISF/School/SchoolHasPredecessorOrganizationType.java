package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolHasPredecessorOrganizationIterator theSchoolHasPredecessorOrganizationIterator = (SchoolHasPredecessorOrganizationIterator)findAncestorWithClass(this, SchoolHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theSchoolHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

