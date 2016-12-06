package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameListZHIterator thearea = (areaNameListZHIterator)findAncestorWithClass(this, areaNameListZHIterator.class);
			pageContext.getOut().print(thearea.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

