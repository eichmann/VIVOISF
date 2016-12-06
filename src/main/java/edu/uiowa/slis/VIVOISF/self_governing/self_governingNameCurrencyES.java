package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameCurrencyESIterator theself_governing = (self_governingNameCurrencyESIterator)findAncestorWithClass(this, self_governingNameCurrencyESIterator.class);
			pageContext.getOut().print(theself_governing.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

