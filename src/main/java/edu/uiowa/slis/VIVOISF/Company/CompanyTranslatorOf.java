package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyTranslatorOfIterator theCompanyTranslatorOfIterator = (CompanyTranslatorOfIterator)findAncestorWithClass(this, CompanyTranslatorOfIterator.class);
			pageContext.getOut().print(theCompanyTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

