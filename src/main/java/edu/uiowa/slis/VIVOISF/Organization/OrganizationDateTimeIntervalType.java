package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationDateTimeIntervalIterator theOrganizationDateTimeIntervalIterator = (OrganizationDateTimeIntervalIterator)findAncestorWithClass(this, OrganizationDateTimeIntervalIterator.class);
			pageContext.getOut().print(theOrganizationDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

