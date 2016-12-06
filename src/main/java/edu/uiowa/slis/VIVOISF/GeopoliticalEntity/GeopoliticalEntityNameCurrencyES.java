package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameCurrencyESIterator theGeopoliticalEntity = (GeopoliticalEntityNameCurrencyESIterator)findAncestorWithClass(this, GeopoliticalEntityNameCurrencyESIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

