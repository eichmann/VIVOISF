package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameCurrencyENIterator theSelf_governing = (Self_governingNameCurrencyENIterator)findAncestorWithClass(this, Self_governingNameCurrencyENIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

