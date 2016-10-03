package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsIssuerIterator theProceedingsIssuerIterator = (ProceedingsIssuerIterator)findAncestorWithClass(this, ProceedingsIssuerIterator.class);
			pageContext.getOut().print(theProceedingsIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for issuer tag ");
		}
		return SKIP_BODY;
	}
}

