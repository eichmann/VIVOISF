package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameShortENIterator theOrganization = (OrganizationNameShortENIterator)findAncestorWithClass(this, OrganizationNameShortENIterator.class);
			pageContext.getOut().print(theOrganization.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

