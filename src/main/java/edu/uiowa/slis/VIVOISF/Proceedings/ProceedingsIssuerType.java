package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsIssuerIterator theProceedingsIssuerIterator = (ProceedingsIssuerIterator)findAncestorWithClass(this, ProceedingsIssuerIterator.class);
			pageContext.getOut().print(theProceedingsIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for issuer tag ");
		}
		return SKIP_BODY;
	}
}

