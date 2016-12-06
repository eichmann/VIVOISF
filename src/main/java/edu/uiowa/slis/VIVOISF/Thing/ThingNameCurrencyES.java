package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameCurrencyESIterator theThing = (ThingNameCurrencyESIterator)findAncestorWithClass(this, ThingNameCurrencyESIterator.class);
			pageContext.getOut().print(theThing.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

