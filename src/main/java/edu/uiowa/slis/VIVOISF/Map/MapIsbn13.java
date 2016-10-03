package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(MapIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapIsbn13Iterator theMap = (MapIsbn13Iterator)findAncestorWithClass(this, MapIsbn13Iterator.class);
			pageContext.getOut().print(theMap.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

