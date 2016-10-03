package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteIssuerIterator theStatuteIssuerIterator = (StatuteIssuerIterator)findAncestorWithClass(this, StatuteIssuerIterator.class);
			pageContext.getOut().print(theStatuteIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for issuer tag ");
		}
		return SKIP_BODY;
	}
}

