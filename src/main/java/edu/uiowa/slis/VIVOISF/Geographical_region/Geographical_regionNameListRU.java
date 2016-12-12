package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameListRUIterator theGeographical_region = (Geographical_regionNameListRUIterator)findAncestorWithClass(this, Geographical_regionNameListRUIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

