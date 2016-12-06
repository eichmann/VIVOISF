package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameCurrencyZHIterator thearea = (areaNameCurrencyZHIterator)findAncestorWithClass(this, areaNameCurrencyZHIterator.class);
			pageContext.getOut().print(thearea.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

