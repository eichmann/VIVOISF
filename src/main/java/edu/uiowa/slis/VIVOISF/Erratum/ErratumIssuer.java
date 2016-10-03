package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumIssuerIterator theErratumIssuerIterator = (ErratumIssuerIterator)findAncestorWithClass(this, ErratumIssuerIterator.class);
			pageContext.getOut().print(theErratumIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for issuer tag ");
		}
		return SKIP_BODY;
	}
}

