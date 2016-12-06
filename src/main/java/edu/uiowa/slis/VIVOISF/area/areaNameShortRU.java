package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameShortRUIterator thearea = (areaNameShortRUIterator)findAncestorWithClass(this, areaNameShortRUIterator.class);
			pageContext.getOut().print(thearea.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

