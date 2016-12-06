package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipLandAreaNotesIterator theEditorship = (EditorshipLandAreaNotesIterator)findAncestorWithClass(this, EditorshipLandAreaNotesIterator.class);
			pageContext.getOut().print(theEditorship.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

