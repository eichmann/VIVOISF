package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipCountryAreaNotesIterator theEditorship = (EditorshipCountryAreaNotesIterator)findAncestorWithClass(this, EditorshipCountryAreaNotesIterator.class);
			pageContext.getOut().print(theEditorship.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

