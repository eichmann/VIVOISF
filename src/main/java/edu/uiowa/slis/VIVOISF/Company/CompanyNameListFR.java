package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameListFRIterator theCompany = (CompanyNameListFRIterator)findAncestorWithClass(this, CompanyNameListFRIterator.class);
			pageContext.getOut().print(theCompany.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

