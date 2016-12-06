package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualAgriculturalAreaNotesIterator theIndividual = (IndividualAgriculturalAreaNotesIterator)findAncestorWithClass(this, IndividualAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theIndividual.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

