package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyCodeUNDPIterator theCompany = (CompanyCodeUNDPIterator)findAncestorWithClass(this, CompanyCodeUNDPIterator.class);
			pageContext.getOut().print(theCompany.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

