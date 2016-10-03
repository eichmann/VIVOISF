package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedHasCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedHasCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedHasCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			disputedHasCurrencyIterator thedisputed = (disputedHasCurrencyIterator)findAncestorWithClass(this, disputedHasCurrencyIterator.class);
			pageContext.getOut().print(thedisputed.getHasCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for hasCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for hasCurrency tag ");
		}
		return SKIP_BODY;
	}
}

