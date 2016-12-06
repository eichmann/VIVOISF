package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyAgriculturalAreaUnitIterator theCompany = (CompanyAgriculturalAreaUnitIterator)findAncestorWithClass(this, CompanyAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theCompany.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

