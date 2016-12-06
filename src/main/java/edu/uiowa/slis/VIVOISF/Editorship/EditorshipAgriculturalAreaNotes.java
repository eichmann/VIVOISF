package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipAgriculturalAreaNotesIterator theEditorship = (EditorshipAgriculturalAreaNotesIterator)findAncestorWithClass(this, EditorshipAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theEditorship.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

