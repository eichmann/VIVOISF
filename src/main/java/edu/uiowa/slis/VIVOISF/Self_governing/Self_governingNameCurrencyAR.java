package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameCurrencyARIterator theSelf_governing = (Self_governingNameCurrencyARIterator)findAncestorWithClass(this, Self_governingNameCurrencyARIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

