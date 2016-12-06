package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingGDPUnitIterator theThing = (ThingGDPUnitIterator)findAncestorWithClass(this, ThingGDPUnitIterator.class);
			pageContext.getOut().print(theThing.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

