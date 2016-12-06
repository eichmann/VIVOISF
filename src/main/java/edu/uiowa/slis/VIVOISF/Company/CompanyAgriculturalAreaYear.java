package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyAgriculturalAreaYearIterator theCompany = (CompanyAgriculturalAreaYearIterator)findAncestorWithClass(this, CompanyAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theCompany.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

