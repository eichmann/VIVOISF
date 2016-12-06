package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameShortZHIterator theCompany = (CompanyNameShortZHIterator)findAncestorWithClass(this, CompanyNameShortZHIterator.class);
			pageContext.getOut().print(theCompany.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

