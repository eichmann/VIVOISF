package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyPublisherOfIterator thePrivateCompanyPublisherOfIterator = (PrivateCompanyPublisherOfIterator)findAncestorWithClass(this, PrivateCompanyPublisherOfIterator.class);
			pageContext.getOut().print(thePrivateCompanyPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

