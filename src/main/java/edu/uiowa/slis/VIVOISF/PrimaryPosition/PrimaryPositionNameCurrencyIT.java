package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameCurrencyITIterator thePrimaryPosition = (PrimaryPositionNameCurrencyITIterator)findAncestorWithClass(this, PrimaryPositionNameCurrencyITIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

