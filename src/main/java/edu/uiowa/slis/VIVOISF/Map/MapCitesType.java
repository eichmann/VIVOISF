package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapCitesIterator theMapCitesIterator = (MapCitesIterator)findAncestorWithClass(this, MapCitesIterator.class);
			pageContext.getOut().print(theMapCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for cites tag ");
		}
		return SKIP_BODY;
	}
}

