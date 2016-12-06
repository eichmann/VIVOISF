package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyCodeGAULIterator theCompany = (CompanyCodeGAULIterator)findAncestorWithClass(this, CompanyCodeGAULIterator.class);
			pageContext.getOut().print(theCompany.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

