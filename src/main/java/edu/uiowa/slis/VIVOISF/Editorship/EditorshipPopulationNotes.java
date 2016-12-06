package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipPopulationNotesIterator theEditorship = (EditorshipPopulationNotesIterator)findAncestorWithClass(this, EditorshipPopulationNotesIterator.class);
			pageContext.getOut().print(theEditorship.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

