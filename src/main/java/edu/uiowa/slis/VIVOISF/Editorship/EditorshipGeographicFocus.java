package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipGeographicFocusIterator theEditorshipGeographicFocusIterator = (EditorshipGeographicFocusIterator)findAncestorWithClass(this, EditorshipGeographicFocusIterator.class);
			pageContext.getOut().print(theEditorshipGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

