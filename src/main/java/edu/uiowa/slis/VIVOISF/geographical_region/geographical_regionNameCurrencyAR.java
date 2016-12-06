package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameCurrencyARIterator thegeographical_region = (geographical_regionNameCurrencyARIterator)findAncestorWithClass(this, geographical_regionNameCurrencyARIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

