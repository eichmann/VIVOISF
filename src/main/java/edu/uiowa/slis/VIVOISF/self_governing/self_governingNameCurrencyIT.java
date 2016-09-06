package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameCurrencyITIterator theself_governing = (self_governingNameCurrencyITIterator)findAncestorWithClass(this, self_governingNameCurrencyITIterator.class);
			pageContext.getOut().print(theself_governing.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

