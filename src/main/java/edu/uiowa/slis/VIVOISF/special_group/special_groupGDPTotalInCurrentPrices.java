package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupGDPTotalInCurrentPricesIterator thespecial_group = (special_groupGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, special_groupGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(thespecial_group.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

