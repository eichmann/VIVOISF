package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(areaDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaDescriptionIterator thearea = (areaDescriptionIterator)findAncestorWithClass(this, areaDescriptionIterator.class);
			pageContext.getOut().print(thearea.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing area for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for description tag ");
		}
		return SKIP_BODY;
	}
}

