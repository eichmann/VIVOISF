package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionHasPredecessorOrganizationIterator theDivisionHasPredecessorOrganizationIterator = (DivisionHasPredecessorOrganizationIterator)findAncestorWithClass(this, DivisionHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theDivisionHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

