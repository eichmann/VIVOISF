package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameCurrencyESIterator theArea = (AreaNameCurrencyESIterator)findAncestorWithClass(this, AreaNameCurrencyESIterator.class);
			pageContext.getOut().print(theArea.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

