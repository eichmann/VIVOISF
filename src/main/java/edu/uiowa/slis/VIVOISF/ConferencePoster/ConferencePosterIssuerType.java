package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterIssuerIterator theConferencePosterIssuerIterator = (ConferencePosterIssuerIterator)findAncestorWithClass(this, ConferencePosterIssuerIterator.class);
			pageContext.getOut().print(theConferencePosterIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for issuer tag ");
		}
		return SKIP_BODY;
	}
}

