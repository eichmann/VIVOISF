package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionUrlIterator theeconomic_region = (economic_regionUrlIterator)findAncestorWithClass(this, economic_regionUrlIterator.class);
			pageContext.getOut().print(theeconomic_region.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for url tag ");
		}
		return SKIP_BODY;
	}
}

