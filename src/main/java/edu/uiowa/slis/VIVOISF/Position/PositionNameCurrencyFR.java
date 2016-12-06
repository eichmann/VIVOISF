package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameCurrencyFRIterator thePosition = (PositionNameCurrencyFRIterator)findAncestorWithClass(this, PositionNameCurrencyFRIterator.class);
			pageContext.getOut().print(thePosition.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

