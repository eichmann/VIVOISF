package edu.uiowa.slis.VIVOISF.Equipment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EquipmentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EquipmentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EquipmentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Equipment theEquipment = (Equipment)findAncestorWithClass(this, Equipment.class);
			if (!theEquipment.commitNeeded) {
				pageContext.getOut().print(theEquipment.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Equipment for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Equipment for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Equipment theEquipment = (Equipment)findAncestorWithClass(this, Equipment.class);
			return theEquipment.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Equipment for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Equipment for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Equipment theEquipment = (Equipment)findAncestorWithClass(this, Equipment.class);
			theEquipment.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Equipment for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Equipment for subjectURI tag ");
		}
	}
}

