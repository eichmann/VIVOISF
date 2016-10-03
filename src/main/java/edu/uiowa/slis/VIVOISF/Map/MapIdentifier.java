package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(MapIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapIdentifierIterator theMap = (MapIdentifierIterator)findAncestorWithClass(this, MapIdentifierIterator.class);
			pageContext.getOut().print(theMap.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for identifier tag ");
		}
		return SKIP_BODY;
	}
}

