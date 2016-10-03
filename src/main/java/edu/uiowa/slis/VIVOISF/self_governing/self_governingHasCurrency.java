package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHasCurrencyIterator theself_governing = (self_governingHasCurrencyIterator)findAncestorWithClass(this, self_governingHasCurrencyIterator.class);
			pageContext.getOut().print(theself_governing.getHasCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasCurrency tag ");
		}
		return SKIP_BODY;
	}
}

