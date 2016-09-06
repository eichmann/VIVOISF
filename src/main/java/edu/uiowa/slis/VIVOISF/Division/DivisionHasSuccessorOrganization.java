package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionHasSuccessorOrganizationIterator theDivisionHasSuccessorOrganizationIterator = (DivisionHasSuccessorOrganizationIterator)findAncestorWithClass(this, DivisionHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theDivisionHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

