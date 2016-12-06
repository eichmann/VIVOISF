package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyHDINotesIterator theCompany = (CompanyHDINotesIterator)findAncestorWithClass(this, CompanyHDINotesIterator.class);
			pageContext.getOut().print(theCompany.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

