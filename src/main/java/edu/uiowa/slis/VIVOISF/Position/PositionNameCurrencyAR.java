package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameCurrencyARIterator thePosition = (PositionNameCurrencyARIterator)findAncestorWithClass(this, PositionNameCurrencyARIterator.class);
			pageContext.getOut().print(thePosition.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

