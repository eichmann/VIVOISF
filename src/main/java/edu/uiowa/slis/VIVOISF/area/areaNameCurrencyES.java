package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameCurrencyESIterator thearea = (areaNameCurrencyESIterator)findAncestorWithClass(this, areaNameCurrencyESIterator.class);
			pageContext.getOut().print(thearea.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

