package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyLandAreaTotalIterator theCompany = (CompanyLandAreaTotalIterator)findAncestorWithClass(this, CompanyLandAreaTotalIterator.class);
			pageContext.getOut().print(theCompany.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

