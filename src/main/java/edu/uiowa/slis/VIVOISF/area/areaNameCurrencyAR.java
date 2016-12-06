package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameCurrencyARIterator thearea = (areaNameCurrencyARIterator)findAncestorWithClass(this, areaNameCurrencyARIterator.class);
			pageContext.getOut().print(thearea.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

