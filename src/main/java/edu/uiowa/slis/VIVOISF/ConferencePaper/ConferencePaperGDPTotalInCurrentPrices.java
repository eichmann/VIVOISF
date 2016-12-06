package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperGDPTotalInCurrentPricesIterator theConferencePaper = (ConferencePaperGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, ConferencePaperGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theConferencePaper.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

