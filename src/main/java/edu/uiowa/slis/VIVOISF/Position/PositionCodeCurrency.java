package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionCodeCurrencyIterator thePosition = (PositionCodeCurrencyIterator)findAncestorWithClass(this, PositionCodeCurrencyIterator.class);
			pageContext.getOut().print(thePosition.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

