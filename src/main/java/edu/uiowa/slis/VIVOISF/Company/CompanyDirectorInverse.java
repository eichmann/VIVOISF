package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyDirectorInverseIterator theCompanyDirectorInverseIterator = (CompanyDirectorInverseIterator)findAncestorWithClass(this, CompanyDirectorInverseIterator.class);
			pageContext.getOut().print(theCompanyDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for director tag ");
		}
		return SKIP_BODY;
	}
}

