package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(areaLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaLandAreaTotalIterator thearea = (areaLandAreaTotalIterator)findAncestorWithClass(this, areaLandAreaTotalIterator.class);
			pageContext.getOut().print(thearea.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing area for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

