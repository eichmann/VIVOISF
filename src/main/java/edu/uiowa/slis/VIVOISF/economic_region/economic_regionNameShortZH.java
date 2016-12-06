package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameShortZHIterator theeconomic_region = (economic_regionNameShortZHIterator)findAncestorWithClass(this, economic_regionNameShortZHIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

