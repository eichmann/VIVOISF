package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameListARIterator theeconomic_region = (economic_regionNameListARIterator)findAncestorWithClass(this, economic_regionNameListARIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

