package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameCurrencyENIterator thearea = (areaNameCurrencyENIterator)findAncestorWithClass(this, areaNameCurrencyENIterator.class);
			pageContext.getOut().print(thearea.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

