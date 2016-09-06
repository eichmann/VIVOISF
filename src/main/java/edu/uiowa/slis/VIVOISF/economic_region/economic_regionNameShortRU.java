package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameShortRUIterator theeconomic_region = (economic_regionNameShortRUIterator)findAncestorWithClass(this, economic_regionNameShortRUIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

