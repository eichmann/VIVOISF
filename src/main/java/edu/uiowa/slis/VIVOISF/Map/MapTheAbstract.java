package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(MapTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapTheAbstractIterator theMap = (MapTheAbstractIterator)findAncestorWithClass(this, MapTheAbstractIterator.class);
			pageContext.getOut().print(theMap.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

