package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameShortARIterator theeconomic_region = (economic_regionNameShortARIterator)findAncestorWithClass(this, economic_regionNameShortARIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

