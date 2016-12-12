package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingPopulationNotesIterator theSelf_governing = (Self_governingPopulationNotesIterator)findAncestorWithClass(this, Self_governingPopulationNotesIterator.class);
			pageContext.getOut().print(theSelf_governing.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

