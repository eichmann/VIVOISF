package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameCurrencyITIterator theSelf_governing = (Self_governingNameCurrencyITIterator)findAncestorWithClass(this, Self_governingNameCurrencyITIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

