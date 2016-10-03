package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterIssuerIterator theConferencePosterIssuerIterator = (ConferencePosterIssuerIterator)findAncestorWithClass(this, ConferencePosterIssuerIterator.class);
			pageContext.getOut().print(theConferencePosterIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for issuer tag ");
		}
		return SKIP_BODY;
	}
}

