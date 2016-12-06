package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameListRUIterator theeconomic_region = (economic_regionNameListRUIterator)findAncestorWithClass(this, economic_regionNameListRUIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

