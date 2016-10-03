package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumEditorInverseIterator theMuseumEditorInverseIterator = (MuseumEditorInverseIterator)findAncestorWithClass(this, MuseumEditorInverseIterator.class);
			pageContext.getOut().print(theMuseumEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for editor tag ");
		}
		return SKIP_BODY;
	}
}

