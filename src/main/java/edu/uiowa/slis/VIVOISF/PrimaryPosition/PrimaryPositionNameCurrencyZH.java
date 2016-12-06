package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionNameCurrencyZHIterator thePrimaryPosition = (PrimaryPositionNameCurrencyZHIterator)findAncestorWithClass(this, PrimaryPositionNameCurrencyZHIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

