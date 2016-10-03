package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapReviewOfIterator theMapReviewOfIterator = (MapReviewOfIterator)findAncestorWithClass(this, MapReviewOfIterator.class);
			pageContext.getOut().print(theMapReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

