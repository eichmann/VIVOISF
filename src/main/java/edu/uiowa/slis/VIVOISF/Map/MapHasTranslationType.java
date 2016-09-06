package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapHasTranslationIterator theMapHasTranslationIterator = (MapHasTranslationIterator)findAncestorWithClass(this, MapHasTranslationIterator.class);
			pageContext.getOut().print(theMapHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

