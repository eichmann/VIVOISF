package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameOfficialENIterator theorganization = (organizationNameOfficialENIterator)findAncestorWithClass(this, organizationNameOfficialENIterator.class);
			pageContext.getOut().print(theorganization.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

