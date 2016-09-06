package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratory theCoreLaboratory = (CoreLaboratory)findAncestorWithClass(this, CoreLaboratory.class);
			if (!theCoreLaboratory.commitNeeded) {
				pageContext.getOut().print(theCoreLaboratory.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			CoreLaboratory theCoreLaboratory = (CoreLaboratory)findAncestorWithClass(this, CoreLaboratory.class);
			return theCoreLaboratory.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing CoreLaboratory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			CoreLaboratory theCoreLaboratory = (CoreLaboratory)findAncestorWithClass(this, CoreLaboratory.class);
			theCoreLaboratory.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for label tag ");
		}
	}
}

