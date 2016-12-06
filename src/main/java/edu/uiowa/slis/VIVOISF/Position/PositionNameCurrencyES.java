package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameCurrencyESIterator thePosition = (PositionNameCurrencyESIterator)findAncestorWithClass(this, PositionNameCurrencyESIterator.class);
			pageContext.getOut().print(thePosition.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

