package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameOfficialRUIterator theCompany = (CompanyNameOfficialRUIterator)findAncestorWithClass(this, CompanyNameOfficialRUIterator.class);
			pageContext.getOut().print(theCompany.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

