package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipGDPNotesIterator theEditorship = (EditorshipGDPNotesIterator)findAncestorWithClass(this, EditorshipGDPNotesIterator.class);
			pageContext.getOut().print(theEditorship.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

