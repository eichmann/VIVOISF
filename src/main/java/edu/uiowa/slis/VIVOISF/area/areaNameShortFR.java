package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameShortFRIterator thearea = (areaNameShortFRIterator)findAncestorWithClass(this, areaNameShortFRIterator.class);
			pageContext.getOut().print(thearea.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

