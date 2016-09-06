package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MapCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapCitedByIterator theMapCitedByIterator = (MapCitedByIterator)findAncestorWithClass(this, MapCitedByIterator.class);
			pageContext.getOut().print(theMapCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

