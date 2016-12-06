package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasTitleIterator theCompanyHasTitleIterator = (CompanyHasTitleIterator)findAncestorWithClass(this, CompanyHasTitleIterator.class);
			pageContext.getOut().print(theCompanyHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

