package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameShortRUIterator theGeographical_region = (Geographical_regionNameShortRUIterator)findAncestorWithClass(this, Geographical_regionNameShortRUIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

