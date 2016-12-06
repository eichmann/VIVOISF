package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyFreetextKeywordIterator theCompany = (CompanyFreetextKeywordIterator)findAncestorWithClass(this, CompanyFreetextKeywordIterator.class);
			pageContext.getOut().print(theCompany.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

