package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperIssuerIterator theConferencePaperIssuerIterator = (ConferencePaperIssuerIterator)findAncestorWithClass(this, ConferencePaperIssuerIterator.class);
			pageContext.getOut().print(theConferencePaperIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for issuer tag ");
		}
		return SKIP_BODY;
	}
}

