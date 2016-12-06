package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameListITIterator theCompany = (CompanyNameListITIterator)findAncestorWithClass(this, CompanyNameListITIterator.class);
			pageContext.getOut().print(theCompany.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

