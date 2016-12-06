package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameShortITIterator theCompany = (CompanyNameShortITIterator)findAncestorWithClass(this, CompanyNameShortITIterator.class);
			pageContext.getOut().print(theCompany.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

