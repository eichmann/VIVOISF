package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameOfficialENIterator theOrganization = (OrganizationNameOfficialENIterator)findAncestorWithClass(this, OrganizationNameOfficialENIterator.class);
			pageContext.getOut().print(theOrganization.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

