package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(groupGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupGDPTotalInCurrentPricesIterator thegroup = (groupGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, groupGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(thegroup.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing group for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

