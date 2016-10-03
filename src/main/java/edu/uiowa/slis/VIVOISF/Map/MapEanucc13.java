package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(MapEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapEanucc13Iterator theMap = (MapEanucc13Iterator)findAncestorWithClass(this, MapEanucc13Iterator.class);
			pageContext.getOut().print(theMap.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

