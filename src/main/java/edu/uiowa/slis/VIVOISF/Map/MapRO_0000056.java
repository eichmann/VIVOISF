package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(MapRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapRO_0000056Iterator theMapRO_0000056Iterator = (MapRO_0000056Iterator)findAncestorWithClass(this, MapRO_0000056Iterator.class);
			pageContext.getOut().print(theMapRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

