package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameListESIterator thearea = (areaNameListESIterator)findAncestorWithClass(this, areaNameListESIterator.class);
			pageContext.getOut().print(thearea.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

