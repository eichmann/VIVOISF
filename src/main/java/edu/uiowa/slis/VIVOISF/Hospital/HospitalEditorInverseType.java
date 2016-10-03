package edu.uiowa.slis.VIVOISF.Hospital;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HospitalEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HospitalEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(HospitalEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HospitalEditorInverseIterator theHospitalEditorInverseIterator = (HospitalEditorInverseIterator)findAncestorWithClass(this, HospitalEditorInverseIterator.class);
			pageContext.getOut().print(theHospitalEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Hospital for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hospital for editor tag ");
		}
		return SKIP_BODY;
	}
}

