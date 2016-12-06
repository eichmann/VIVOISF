package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(KindPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindPopulationNotesIterator theKind = (KindPopulationNotesIterator)findAncestorWithClass(this, KindPopulationNotesIterator.class);
			pageContext.getOut().print(theKind.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

