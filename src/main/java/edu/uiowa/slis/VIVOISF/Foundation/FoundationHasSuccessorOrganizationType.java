package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationHasSuccessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationHasSuccessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationHasSuccessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationHasSuccessorOrganizationIterator theFoundationHasSuccessorOrganizationIterator = (FoundationHasSuccessorOrganizationIterator)findAncestorWithClass(this, FoundationHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theFoundationHasSuccessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

