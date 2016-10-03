package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(MapLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapLccnIterator theMap = (MapLccnIterator)findAncestorWithClass(this, MapLccnIterator.class);
			pageContext.getOut().print(theMap.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for lccn tag ");
		}
		return SKIP_BODY;
	}
}

