package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameCurrencyARIterator theself_governing = (self_governingNameCurrencyARIterator)findAncestorWithClass(this, self_governingNameCurrencyARIterator.class);
			pageContext.getOut().print(theself_governing.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

