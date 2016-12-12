package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingGDPTotalInCurrentPricesIterator theSelf_governing = (Self_governingGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, Self_governingGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theSelf_governing.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

