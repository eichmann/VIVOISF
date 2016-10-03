package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractIssuerIterator theAbstractIssuerIterator = (AbstractIssuerIterator)findAncestorWithClass(this, AbstractIssuerIterator.class);
			pageContext.getOut().print(theAbstractIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for issuer tag ");
		}
		return SKIP_BODY;
	}
}

