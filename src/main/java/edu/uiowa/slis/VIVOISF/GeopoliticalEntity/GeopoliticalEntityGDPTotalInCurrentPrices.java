package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityGDPTotalInCurrentPricesIterator theGeopoliticalEntity = (GeopoliticalEntityGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, GeopoliticalEntityGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

