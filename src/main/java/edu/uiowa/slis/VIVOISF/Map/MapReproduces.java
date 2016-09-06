package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(MapReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapReproducesIterator theMapReproducesIterator = (MapReproducesIterator)findAncestorWithClass(this, MapReproducesIterator.class);
			pageContext.getOut().print(theMapReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

