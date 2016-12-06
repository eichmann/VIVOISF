package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(areaAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaAgriculturalAreaTotalIterator thearea = (areaAgriculturalAreaTotalIterator)findAncestorWithClass(this, areaAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(thearea.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing area for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

