package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyLandAreaYearIterator theCompany = (CompanyLandAreaYearIterator)findAncestorWithClass(this, CompanyLandAreaYearIterator.class);
			pageContext.getOut().print(theCompany.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

