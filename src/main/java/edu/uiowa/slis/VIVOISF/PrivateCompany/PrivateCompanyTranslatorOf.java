package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyTranslatorOfIterator thePrivateCompanyTranslatorOfIterator = (PrivateCompanyTranslatorOfIterator)findAncestorWithClass(this, PrivateCompanyTranslatorOfIterator.class);
			pageContext.getOut().print(thePrivateCompanyTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

