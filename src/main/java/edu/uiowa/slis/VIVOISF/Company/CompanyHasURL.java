package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasURLIterator theCompanyHasURLIterator = (CompanyHasURLIterator)findAncestorWithClass(this, CompanyHasURLIterator.class);
			pageContext.getOut().print(theCompanyHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

