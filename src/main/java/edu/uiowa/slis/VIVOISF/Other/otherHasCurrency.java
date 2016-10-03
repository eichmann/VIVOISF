package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherHasCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherHasCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(otherHasCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherHasCurrencyIterator theother = (otherHasCurrencyIterator)findAncestorWithClass(this, otherHasCurrencyIterator.class);
			pageContext.getOut().print(theother.getHasCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing other for hasCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for hasCurrency tag ");
		}
		return SKIP_BODY;
	}
}

