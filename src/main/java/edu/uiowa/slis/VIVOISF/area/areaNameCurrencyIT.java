package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameCurrencyITIterator thearea = (areaNameCurrencyITIterator)findAncestorWithClass(this, areaNameCurrencyITIterator.class);
			pageContext.getOut().print(thearea.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

