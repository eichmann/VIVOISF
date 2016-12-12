package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaGDPUnitIterator theArea = (AreaGDPUnitIterator)findAncestorWithClass(this, AreaGDPUnitIterator.class);
			pageContext.getOut().print(theArea.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

