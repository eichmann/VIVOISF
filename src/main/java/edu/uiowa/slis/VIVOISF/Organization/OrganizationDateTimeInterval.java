package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationDateTimeIntervalIterator theOrganizationDateTimeIntervalIterator = (OrganizationDateTimeIntervalIterator)findAncestorWithClass(this, OrganizationDateTimeIntervalIterator.class);
			pageContext.getOut().print(theOrganizationDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

