package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyNameShortESIterator theCompany = (CompanyNameShortESIterator)findAncestorWithClass(this, CompanyNameShortESIterator.class);
			pageContext.getOut().print(theCompany.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

