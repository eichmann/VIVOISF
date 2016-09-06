package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapTranslatorIterator theMapTranslatorIterator = (MapTranslatorIterator)findAncestorWithClass(this, MapTranslatorIterator.class);
			pageContext.getOut().print(theMapTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for translator tag ");
		}
		return SKIP_BODY;
	}
}

