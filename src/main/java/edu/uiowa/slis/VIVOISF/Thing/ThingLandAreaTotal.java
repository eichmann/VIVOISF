package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingLandAreaTotalIterator theThing = (ThingLandAreaTotalIterator)findAncestorWithClass(this, ThingLandAreaTotalIterator.class);
			pageContext.getOut().print(theThing.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

