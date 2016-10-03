package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefIssuerIterator theBriefIssuerIterator = (BriefIssuerIterator)findAncestorWithClass(this, BriefIssuerIterator.class);
			pageContext.getOut().print(theBriefIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for issuer tag ");
		}
		return SKIP_BODY;
	}
}

