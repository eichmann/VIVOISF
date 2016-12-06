package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualLandAreaNotesIterator theIndividual = (IndividualLandAreaNotesIterator)findAncestorWithClass(this, IndividualLandAreaNotesIterator.class);
			pageContext.getOut().print(theIndividual.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

