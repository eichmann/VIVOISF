package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanySuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanySuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanySuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanySuffixNameIterator theCompany = (CompanySuffixNameIterator)findAncestorWithClass(this, CompanySuffixNameIterator.class);
			pageContext.getOut().print(theCompany.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

