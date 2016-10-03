package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(MapIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapIsbn10Iterator theMap = (MapIsbn10Iterator)findAncestorWithClass(this, MapIsbn10Iterator.class);
			pageContext.getOut().print(theMap.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

