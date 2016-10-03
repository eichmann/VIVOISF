package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasListName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasListName currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasListName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaHasListNameIterator thearea = (areaHasListNameIterator)findAncestorWithClass(this, areaHasListNameIterator.class);
			pageContext.getOut().print(thearea.getHasListName());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasListName tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasListName tag ");
		}
		return SKIP_BODY;
	}
}

