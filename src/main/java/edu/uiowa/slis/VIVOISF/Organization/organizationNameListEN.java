package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameListENIterator theorganization = (organizationNameListENIterator)findAncestorWithClass(this, organizationNameListENIterator.class);
			pageContext.getOut().print(theorganization.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

