package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyHasMinLongitudeIterator theCompany = (CompanyHasMinLongitudeIterator)findAncestorWithClass(this, CompanyHasMinLongitudeIterator.class);
			pageContext.getOut().print(theCompany.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

