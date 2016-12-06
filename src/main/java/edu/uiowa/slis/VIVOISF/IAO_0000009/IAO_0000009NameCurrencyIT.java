package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009NameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009NameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009NameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009NameCurrencyITIterator theIAO_0000009 = (IAO_0000009NameCurrencyITIterator)findAncestorWithClass(this, IAO_0000009NameCurrencyITIterator.class);
			pageContext.getOut().print(theIAO_0000009.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

