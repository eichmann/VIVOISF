package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyHasMinLatitudeIterator theCompany = (CompanyHasMinLatitudeIterator)findAncestorWithClass(this, CompanyHasMinLatitudeIterator.class);
			pageContext.getOut().print(theCompany.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

