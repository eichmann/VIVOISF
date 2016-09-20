package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalHasCollaboratorInverseIterator theHospitalHasCollaboratorInverseIterator = (HospitalHasCollaboratorInverseIterator)findAncestorWithClass(this, HospitalHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theHospitalHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

