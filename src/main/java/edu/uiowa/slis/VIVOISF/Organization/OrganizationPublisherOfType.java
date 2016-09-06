package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationPublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationPublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationPublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationPublisherOfIterator theOrganizationPublisherOfIterator = (OrganizationPublisherOfIterator)findAncestorWithClass(this, OrganizationPublisherOfIterator.class);
			pageContext.getOut().print(theOrganizationPublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

