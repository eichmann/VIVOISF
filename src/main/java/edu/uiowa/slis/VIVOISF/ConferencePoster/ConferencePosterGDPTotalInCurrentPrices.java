package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterGDPTotalInCurrentPricesIterator theConferencePoster = (ConferencePosterGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, ConferencePosterGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theConferencePoster.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

