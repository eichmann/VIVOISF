package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameCurrencyITIterator thePosition = (PositionNameCurrencyITIterator)findAncestorWithClass(this, PositionNameCurrencyITIterator.class);
			pageContext.getOut().print(thePosition.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

