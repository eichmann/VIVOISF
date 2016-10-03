package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasCoordinate extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasCoordinate currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasCoordinate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHasCoordinateIterator theself_governing = (self_governingHasCoordinateIterator)findAncestorWithClass(this, self_governingHasCoordinateIterator.class);
			pageContext.getOut().print(theself_governing.getHasCoordinate());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasCoordinate tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasCoordinate tag ");
		}
		return SKIP_BODY;
	}
}

