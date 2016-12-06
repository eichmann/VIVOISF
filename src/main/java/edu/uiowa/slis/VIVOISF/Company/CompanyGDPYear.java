package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyGDPYearIterator theCompany = (CompanyGDPYearIterator)findAncestorWithClass(this, CompanyGDPYearIterator.class);
			pageContext.getOut().print(theCompany.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

