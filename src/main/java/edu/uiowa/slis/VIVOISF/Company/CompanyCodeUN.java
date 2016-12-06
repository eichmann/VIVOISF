package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyCodeUNIterator theCompany = (CompanyCodeUNIterator)findAncestorWithClass(this, CompanyCodeUNIterator.class);
			pageContext.getOut().print(theCompany.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

