package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyProducerInverseIterator theCompanyProducerInverseIterator = (CompanyProducerInverseIterator)findAncestorWithClass(this, CompanyProducerInverseIterator.class);
			pageContext.getOut().print(theCompanyProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for producer tag ");
		}
		return SKIP_BODY;
	}
}

