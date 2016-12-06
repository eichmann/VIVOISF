package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyAgriculturalAreaTotalIterator theCompany = (CompanyAgriculturalAreaTotalIterator)findAncestorWithClass(this, CompanyAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theCompany.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

