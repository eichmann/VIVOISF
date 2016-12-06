package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingAgriculturalAreaTotalIterator theThing = (ThingAgriculturalAreaTotalIterator)findAncestorWithClass(this, ThingAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theThing.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

