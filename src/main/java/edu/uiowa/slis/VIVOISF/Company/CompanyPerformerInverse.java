package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyPerformerInverseIterator theCompanyPerformerInverseIterator = (CompanyPerformerInverseIterator)findAncestorWithClass(this, CompanyPerformerInverseIterator.class);
			pageContext.getOut().print(theCompanyPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for performer tag ");
		}
		return SKIP_BODY;
	}
}

