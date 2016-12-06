package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyHasMaxLongitudeIterator theCompany = (CompanyHasMaxLongitudeIterator)findAncestorWithClass(this, CompanyHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theCompany.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

