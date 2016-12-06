package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(areaLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaLandAreaUnitIterator thearea = (areaLandAreaUnitIterator)findAncestorWithClass(this, areaLandAreaUnitIterator.class);
			pageContext.getOut().print(thearea.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing area for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

