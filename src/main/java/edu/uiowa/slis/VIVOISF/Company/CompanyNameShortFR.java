package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameShortFRIterator theCompany = (CompanyNameShortFRIterator)findAncestorWithClass(this, CompanyNameShortFRIterator.class);
			pageContext.getOut().print(theCompany.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

