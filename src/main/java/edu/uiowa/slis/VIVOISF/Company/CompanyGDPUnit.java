package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyGDPUnitIterator theCompany = (CompanyGDPUnitIterator)findAncestorWithClass(this, CompanyGDPUnitIterator.class);
			pageContext.getOut().print(theCompany.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

