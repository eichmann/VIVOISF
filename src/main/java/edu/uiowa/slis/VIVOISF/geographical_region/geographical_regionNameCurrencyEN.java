package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameCurrencyENIterator thegeographical_region = (geographical_regionNameCurrencyENIterator)findAncestorWithClass(this, geographical_regionNameCurrencyENIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

