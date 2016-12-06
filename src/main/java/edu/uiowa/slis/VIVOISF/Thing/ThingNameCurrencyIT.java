package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameCurrencyITIterator theThing = (ThingNameCurrencyITIterator)findAncestorWithClass(this, ThingNameCurrencyITIterator.class);
			pageContext.getOut().print(theThing.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

