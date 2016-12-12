package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameCurrencyARIterator theArea = (AreaNameCurrencyARIterator)findAncestorWithClass(this, AreaNameCurrencyARIterator.class);
			pageContext.getOut().print(theArea.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

