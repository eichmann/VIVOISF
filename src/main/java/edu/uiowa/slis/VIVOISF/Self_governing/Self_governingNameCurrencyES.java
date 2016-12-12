package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameCurrencyESIterator theSelf_governing = (Self_governingNameCurrencyESIterator)findAncestorWithClass(this, Self_governingNameCurrencyESIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

