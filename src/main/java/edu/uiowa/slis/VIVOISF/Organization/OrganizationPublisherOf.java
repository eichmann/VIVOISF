package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationPublisherOfIterator theOrganizationPublisherOfIterator = (OrganizationPublisherOfIterator)findAncestorWithClass(this, OrganizationPublisherOfIterator.class);
			pageContext.getOut().print(theOrganizationPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

