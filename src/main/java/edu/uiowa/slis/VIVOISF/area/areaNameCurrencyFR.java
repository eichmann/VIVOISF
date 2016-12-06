package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameCurrencyFRIterator thearea = (areaNameCurrencyFRIterator)findAncestorWithClass(this, areaNameCurrencyFRIterator.class);
			pageContext.getOut().print(thearea.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

