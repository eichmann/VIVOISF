package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(MapEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapEditionIterator theMap = (MapEditionIterator)findAncestorWithClass(this, MapEditionIterator.class);
			pageContext.getOut().print(theMap.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for edition tag ");
		}
		return SKIP_BODY;
	}
}

