package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameListESIterator theeconomic_region = (economic_regionNameListESIterator)findAncestorWithClass(this, economic_regionNameListESIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

