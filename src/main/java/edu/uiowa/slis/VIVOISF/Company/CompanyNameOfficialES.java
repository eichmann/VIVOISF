package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameOfficialESIterator theCompany = (CompanyNameOfficialESIterator)findAncestorWithClass(this, CompanyNameOfficialESIterator.class);
			pageContext.getOut().print(theCompany.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

