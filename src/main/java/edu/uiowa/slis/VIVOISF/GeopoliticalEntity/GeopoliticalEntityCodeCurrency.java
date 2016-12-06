package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityCodeCurrencyIterator theGeopoliticalEntity = (GeopoliticalEntityCodeCurrencyIterator)findAncestorWithClass(this, GeopoliticalEntityCodeCurrencyIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

