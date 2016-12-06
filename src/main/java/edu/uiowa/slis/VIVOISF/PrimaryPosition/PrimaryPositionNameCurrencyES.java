package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameCurrencyESIterator thePrimaryPosition = (PrimaryPositionNameCurrencyESIterator)findAncestorWithClass(this, PrimaryPositionNameCurrencyESIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

