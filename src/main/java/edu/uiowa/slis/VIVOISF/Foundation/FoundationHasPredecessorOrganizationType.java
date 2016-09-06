package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationHasPredecessorOrganizationIterator theFoundationHasPredecessorOrganizationIterator = (FoundationHasPredecessorOrganizationIterator)findAncestorWithClass(this, FoundationHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theFoundationHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

