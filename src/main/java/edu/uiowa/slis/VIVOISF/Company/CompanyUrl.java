package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CompanyUrlIterator theCompany = (CompanyUrlIterator)findAncestorWithClass(this, CompanyUrlIterator.class);
			pageContext.getOut().print(theCompany.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for url tag ");
		}
		return SKIP_BODY;
	}
}

