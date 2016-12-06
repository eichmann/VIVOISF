package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameCurrencyESIterator thegeographical_region = (geographical_regionNameCurrencyESIterator)findAncestorWithClass(this, geographical_regionNameCurrencyESIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

