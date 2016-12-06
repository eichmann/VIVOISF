package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityNameCurrencyARIterator theGeopoliticalEntity = (GeopoliticalEntityNameCurrencyARIterator)findAncestorWithClass(this, GeopoliticalEntityNameCurrencyARIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

