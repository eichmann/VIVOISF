package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			non_self_governingNameCurrencyESIterator thenon_self_governing = (non_self_governingNameCurrencyESIterator)findAncestorWithClass(this, non_self_governingNameCurrencyESIterator.class);
			pageContext.getOut().print(thenon_self_governing.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

