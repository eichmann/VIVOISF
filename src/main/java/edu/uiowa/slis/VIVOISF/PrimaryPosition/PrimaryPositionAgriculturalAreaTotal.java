package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionAgriculturalAreaTotalIterator thePrimaryPosition = (PrimaryPositionAgriculturalAreaTotalIterator)findAncestorWithClass(this, PrimaryPositionAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

