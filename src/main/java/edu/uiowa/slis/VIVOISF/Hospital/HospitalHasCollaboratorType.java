package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalHasCollaboratorIterator theHospitalHasCollaboratorIterator = (HospitalHasCollaboratorIterator)findAncestorWithClass(this, HospitalHasCollaboratorIterator.class);
			pageContext.getOut().print(theHospitalHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

