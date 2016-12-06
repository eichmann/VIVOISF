package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameShortARIterator theCompany = (CompanyNameShortARIterator)findAncestorWithClass(this, CompanyNameShortARIterator.class);
			pageContext.getOut().print(theCompany.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

