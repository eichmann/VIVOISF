package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaSource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaSource currentInstance = null;
	private static final Log log = LogFactory.getLog(areaSource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaSourceIterator thearea = (areaSourceIterator)findAncestorWithClass(this, areaSourceIterator.class);
			pageContext.getOut().print(thearea.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing area for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for source tag ");
		}
		return SKIP_BODY;
	}
}

