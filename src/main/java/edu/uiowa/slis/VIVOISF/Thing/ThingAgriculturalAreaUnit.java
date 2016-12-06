package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingAgriculturalAreaUnitIterator theThing = (ThingAgriculturalAreaUnitIterator)findAncestorWithClass(this, ThingAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theThing.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

