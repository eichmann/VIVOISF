package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameListZHIterator theCompany = (CompanyNameListZHIterator)findAncestorWithClass(this, CompanyNameListZHIterator.class);
			pageContext.getOut().print(theCompany.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

