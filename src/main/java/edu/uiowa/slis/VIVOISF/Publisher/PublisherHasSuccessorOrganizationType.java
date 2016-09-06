package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasSuccessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasSuccessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasSuccessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasSuccessorOrganizationIterator thePublisherHasSuccessorOrganizationIterator = (PublisherHasSuccessorOrganizationIterator)findAncestorWithClass(this, PublisherHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(thePublisherHasSuccessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

