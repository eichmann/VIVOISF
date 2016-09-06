package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNameOfficialRUIterator theeconomic_region = (economic_regionNameOfficialRUIterator)findAncestorWithClass(this, economic_regionNameOfficialRUIterator.class);
			pageContext.getOut().print(theeconomic_region.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

