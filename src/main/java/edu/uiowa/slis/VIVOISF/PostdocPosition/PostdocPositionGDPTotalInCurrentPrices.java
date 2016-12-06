package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionGDPTotalInCurrentPricesIterator thePostdocPosition = (PostdocPositionGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, PostdocPositionGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(thePostdocPosition.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

