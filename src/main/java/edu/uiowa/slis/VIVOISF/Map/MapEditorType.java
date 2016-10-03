package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapEditorIterator theMapEditorIterator = (MapEditorIterator)findAncestorWithClass(this, MapEditorIterator.class);
			pageContext.getOut().print(theMapEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for editor tag ");
		}
		return SKIP_BODY;
	}
}

