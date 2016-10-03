package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHasCurrencyIterator theterritory = (territoryHasCurrencyIterator)findAncestorWithClass(this, territoryHasCurrencyIterator.class);
			pageContext.getOut().print(theterritory.getHasCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasCurrency tag ");
		}
		return SKIP_BODY;
	}
}
