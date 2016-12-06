package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameOfficialZHIterator theCompany = (CompanyNameOfficialZHIterator)findAncestorWithClass(this, CompanyNameOfficialZHIterator.class);
			pageContext.getOut().print(theCompany.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

