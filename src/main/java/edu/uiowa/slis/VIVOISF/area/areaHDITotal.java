package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaHDITotalIterator thearea = (areaHDITotalIterator)findAncestorWithClass(this, areaHDITotalIterator.class);
			pageContext.getOut().print(thearea.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing area for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

