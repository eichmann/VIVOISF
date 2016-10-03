package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272Issuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272Issuer currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272Issuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272IssuerIterator theOBI_0000272IssuerIterator = (OBI_0000272IssuerIterator)findAncestorWithClass(this, OBI_0000272IssuerIterator.class);
			pageContext.getOut().print(theOBI_0000272IssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for issuer tag ");
		}
		return SKIP_BODY;
	}
}

