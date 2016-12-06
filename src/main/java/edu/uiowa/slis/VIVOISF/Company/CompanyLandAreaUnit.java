package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyLandAreaUnitIterator theCompany = (CompanyLandAreaUnitIterator)findAncestorWithClass(this, CompanyLandAreaUnitIterator.class);
			pageContext.getOut().print(theCompany.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

