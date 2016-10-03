package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyProducerInverseIterator thePrivateCompanyProducerInverseIterator = (PrivateCompanyProducerInverseIterator)findAncestorWithClass(this, PrivateCompanyProducerInverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for producer tag ");
		}
		return SKIP_BODY;
	}
}

