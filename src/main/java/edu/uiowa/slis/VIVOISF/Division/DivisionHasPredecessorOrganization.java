package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionHasPredecessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionHasPredecessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionHasPredecessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionHasPredecessorOrganizationIterator theDivisionHasPredecessorOrganizationIterator = (DivisionHasPredecessorOrganizationIterator)findAncestorWithClass(this, DivisionHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theDivisionHasPredecessorOrganizationIterator.getHasPredecessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

