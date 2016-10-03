package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(MapGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapGtin14Iterator theMap = (MapGtin14Iterator)findAncestorWithClass(this, MapGtin14Iterator.class);
			pageContext.getOut().print(theMap.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

