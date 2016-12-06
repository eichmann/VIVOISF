package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameOfficialFRIterator theCompany = (CompanyNameOfficialFRIterator)findAncestorWithClass(this, CompanyNameOfficialFRIterator.class);
			pageContext.getOut().print(theCompany.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

