package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNameShortARIterator thearea = (areaNameShortARIterator)findAncestorWithClass(this, areaNameShortARIterator.class);
			pageContext.getOut().print(thearea.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

