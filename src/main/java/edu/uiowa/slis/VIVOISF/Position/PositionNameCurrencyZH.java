package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameCurrencyZHIterator thePosition = (PositionNameCurrencyZHIterator)findAncestorWithClass(this, PositionNameCurrencyZHIterator.class);
			pageContext.getOut().print(thePosition.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

