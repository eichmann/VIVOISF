package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyPublisherIterator theCompanyPublisherIterator = (CompanyPublisherIterator)findAncestorWithClass(this, CompanyPublisherIterator.class);
			pageContext.getOut().print(theCompanyPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for publisher tag ");
		}
		return SKIP_BODY;
	}
}

