package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(MapReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapReproducedInIterator theMapReproducedInIterator = (MapReproducedInIterator)findAncestorWithClass(this, MapReproducedInIterator.class);
			pageContext.getOut().print(theMapReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

