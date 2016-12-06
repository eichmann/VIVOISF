package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameShortZHIterator thearea = (areaNameShortZHIterator)findAncestorWithClass(this, areaNameShortZHIterator.class);
			pageContext.getOut().print(thearea.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

