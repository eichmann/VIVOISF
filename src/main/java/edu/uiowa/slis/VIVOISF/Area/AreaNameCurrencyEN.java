package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameCurrencyENIterator theArea = (AreaNameCurrencyENIterator)findAncestorWithClass(this, AreaNameCurrencyENIterator.class);
			pageContext.getOut().print(theArea.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

