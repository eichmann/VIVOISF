package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasEmailIterator theCompanyHasEmailIterator = (CompanyHasEmailIterator)findAncestorWithClass(this, CompanyHasEmailIterator.class);
			pageContext.getOut().print(theCompanyHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

