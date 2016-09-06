package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameCurrencyENIterator theself_governing = (self_governingNameCurrencyENIterator)findAncestorWithClass(this, self_governingNameCurrencyENIterator.class);
			pageContext.getOut().print(theself_governing.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

