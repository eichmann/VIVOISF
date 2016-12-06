package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionNameCurrencyENIterator thePosition = (PositionNameCurrencyENIterator)findAncestorWithClass(this, PositionNameCurrencyENIterator.class);
			pageContext.getOut().print(thePosition.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

