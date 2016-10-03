package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryOrganizerInverseIterator theCoreLaboratoryOrganizerInverseIterator = (CoreLaboratoryOrganizerInverseIterator)findAncestorWithClass(this, CoreLaboratoryOrganizerInverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for organizer tag ");
		}
		return SKIP_BODY;
	}
}

