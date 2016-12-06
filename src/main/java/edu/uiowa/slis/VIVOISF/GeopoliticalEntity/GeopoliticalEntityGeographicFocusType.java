package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityGeographicFocusIterator theGeopoliticalEntityGeographicFocusIterator = (GeopoliticalEntityGeographicFocusIterator)findAncestorWithClass(this, GeopoliticalEntityGeographicFocusIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

