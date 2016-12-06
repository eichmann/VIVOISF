package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameListARIterator theCompany = (CompanyNameListARIterator)findAncestorWithClass(this, CompanyNameListARIterator.class);
			pageContext.getOut().print(theCompany.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

