package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameCurrencyZHIterator thegeographical_region = (geographical_regionNameCurrencyZHIterator)findAncestorWithClass(this, geographical_regionNameCurrencyZHIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

