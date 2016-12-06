package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationPublisherIterator theOrganizationPublisherIterator = (OrganizationPublisherIterator)findAncestorWithClass(this, OrganizationPublisherIterator.class);
			pageContext.getOut().print(theOrganizationPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for publisher tag ");
		}
		return SKIP_BODY;
	}
}

