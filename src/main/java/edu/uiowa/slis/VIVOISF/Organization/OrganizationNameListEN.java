package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameListENIterator theOrganization = (OrganizationNameListENIterator)findAncestorWithClass(this, OrganizationNameListENIterator.class);
			pageContext.getOut().print(theOrganization.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

