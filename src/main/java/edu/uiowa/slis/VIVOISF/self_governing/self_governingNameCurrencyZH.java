package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameCurrencyZHIterator theself_governing = (self_governingNameCurrencyZHIterator)findAncestorWithClass(this, self_governingNameCurrencyZHIterator.class);
			pageContext.getOut().print(theself_governing.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

