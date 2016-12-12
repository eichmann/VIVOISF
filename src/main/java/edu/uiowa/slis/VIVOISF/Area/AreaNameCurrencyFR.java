package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameCurrencyFRIterator theArea = (AreaNameCurrencyFRIterator)findAncestorWithClass(this, AreaNameCurrencyFRIterator.class);
			pageContext.getOut().print(theArea.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

