package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityHasPredecessorOrganizationIterator theUniversityHasPredecessorOrganizationIterator = (UniversityHasPredecessorOrganizationIterator)findAncestorWithClass(this, UniversityHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theUniversityHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

