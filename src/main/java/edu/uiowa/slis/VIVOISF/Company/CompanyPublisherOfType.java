package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyPublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyPublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyPublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyPublisherOfIterator theCompanyPublisherOfIterator = (CompanyPublisherOfIterator)findAncestorWithClass(this, CompanyPublisherOfIterator.class);
			pageContext.getOut().print(theCompanyPublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

