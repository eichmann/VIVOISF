package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaBottomDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(areaBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaBottomDataPropertyIterator thearea = (areaBottomDataPropertyIterator)findAncestorWithClass(this, areaBottomDataPropertyIterator.class);
			pageContext.getOut().print(thearea.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing area for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

