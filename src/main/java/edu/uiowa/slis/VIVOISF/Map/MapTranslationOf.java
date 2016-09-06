package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MapTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapTranslationOfIterator theMapTranslationOfIterator = (MapTranslationOfIterator)findAncestorWithClass(this, MapTranslationOfIterator.class);
			pageContext.getOut().print(theMapTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

