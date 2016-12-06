package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameCurrencyFRIterator theGeopoliticalEntity = (GeopoliticalEntityNameCurrencyFRIterator)findAncestorWithClass(this, GeopoliticalEntityNameCurrencyFRIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

