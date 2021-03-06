package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityGeographicFocusOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityGeographicFocusOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityGeographicFocusOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityGeographicFocusOfIterator theGeopoliticalEntityGeographicFocusOfIterator = (GeopoliticalEntityGeographicFocusOfIterator)findAncestorWithClass(this, GeopoliticalEntityGeographicFocusOfIterator.class);
			pageContext.getOut().print(theGeopoliticalEntityGeographicFocusOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

