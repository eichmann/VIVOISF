package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualGDPNotesIterator theIndividual = (IndividualGDPNotesIterator)findAncestorWithClass(this, IndividualGDPNotesIterator.class);
			pageContext.getOut().print(theIndividual.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

