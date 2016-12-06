package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameCurrencyZHIterator theGeopoliticalEntity = (GeopoliticalEntityNameCurrencyZHIterator)findAncestorWithClass(this, GeopoliticalEntityNameCurrencyZHIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

