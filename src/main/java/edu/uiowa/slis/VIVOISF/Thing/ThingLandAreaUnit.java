package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingLandAreaUnitIterator theThing = (ThingLandAreaUnitIterator)findAncestorWithClass(this, ThingLandAreaUnitIterator.class);
			pageContext.getOut().print(theThing.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

