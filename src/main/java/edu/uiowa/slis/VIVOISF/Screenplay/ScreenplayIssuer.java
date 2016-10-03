package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayIssuerIterator theScreenplayIssuerIterator = (ScreenplayIssuerIterator)findAncestorWithClass(this, ScreenplayIssuerIterator.class);
			pageContext.getOut().print(theScreenplayIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for issuer tag ");
		}
		return SKIP_BODY;
	}
}

