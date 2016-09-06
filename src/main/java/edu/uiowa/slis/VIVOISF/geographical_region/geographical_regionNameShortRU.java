package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameShortRUIterator thegeographical_region = (geographical_regionNameShortRUIterator)findAncestorWithClass(this, geographical_regionNameShortRUIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

