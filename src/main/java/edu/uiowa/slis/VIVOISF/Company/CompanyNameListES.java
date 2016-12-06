package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameListESIterator theCompany = (CompanyNameListESIterator)findAncestorWithClass(this, CompanyNameListESIterator.class);
			pageContext.getOut().print(theCompany.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

