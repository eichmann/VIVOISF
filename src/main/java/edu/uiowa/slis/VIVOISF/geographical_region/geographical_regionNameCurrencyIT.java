package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameCurrencyITIterator thegeographical_region = (geographical_regionNameCurrencyITIterator)findAncestorWithClass(this, geographical_regionNameCurrencyITIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

