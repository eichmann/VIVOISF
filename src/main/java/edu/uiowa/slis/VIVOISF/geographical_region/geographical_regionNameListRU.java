package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameListRUIterator thegeographical_region = (geographical_regionNameListRUIterator)findAncestorWithClass(this, geographical_regionNameListRUIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

