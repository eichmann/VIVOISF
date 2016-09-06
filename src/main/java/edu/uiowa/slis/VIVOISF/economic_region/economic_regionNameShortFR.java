package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameShortFRIterator theeconomic_region = (economic_regionNameShortFRIterator)findAncestorWithClass(this, economic_regionNameShortFRIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

