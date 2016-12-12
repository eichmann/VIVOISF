package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameCurrencyFRIterator theSelf_governing = (Self_governingNameCurrencyFRIterator)findAncestorWithClass(this, Self_governingNameCurrencyFRIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

