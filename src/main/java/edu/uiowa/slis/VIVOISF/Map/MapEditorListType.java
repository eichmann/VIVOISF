package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapEditorListIterator theMapEditorListIterator = (MapEditorListIterator)findAncestorWithClass(this, MapEditorListIterator.class);
			pageContext.getOut().print(theMapEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for editorList tag ");
		}
		return SKIP_BODY;
	}
}

