package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyHDIYearIterator theCompany = (CompanyHDIYearIterator)findAncestorWithClass(this, CompanyHDIYearIterator.class);
			pageContext.getOut().print(theCompany.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

