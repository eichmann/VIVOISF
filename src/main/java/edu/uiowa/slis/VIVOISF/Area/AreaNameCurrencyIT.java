package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameCurrencyITIterator theArea = (AreaNameCurrencyITIterator)findAncestorWithClass(this, AreaNameCurrencyITIterator.class);
			pageContext.getOut().print(theArea.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

