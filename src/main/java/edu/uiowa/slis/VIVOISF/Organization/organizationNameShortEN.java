package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameShortENIterator theorganization = (organizationNameShortENIterator)findAncestorWithClass(this, organizationNameShortENIterator.class);
			pageContext.getOut().print(theorganization.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

