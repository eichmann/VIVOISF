package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(areaGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaGDPUnitIterator thearea = (areaGDPUnitIterator)findAncestorWithClass(this, areaGDPUnitIterator.class);
			pageContext.getOut().print(thearea.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing area for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

