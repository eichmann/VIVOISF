package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaTopDataProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(areaTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaTopDataPropertyIterator thearea = (areaTopDataPropertyIterator)findAncestorWithClass(this, areaTopDataPropertyIterator.class);
			pageContext.getOut().print(thearea.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing area for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

