package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameCurrencyZHIterator theArea = (AreaNameCurrencyZHIterator)findAncestorWithClass(this, AreaNameCurrencyZHIterator.class);
			pageContext.getOut().print(theArea.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

