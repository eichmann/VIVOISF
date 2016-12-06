package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(KindGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindGDPTotalInCurrentPricesIterator theKind = (KindGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, KindGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theKind.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

