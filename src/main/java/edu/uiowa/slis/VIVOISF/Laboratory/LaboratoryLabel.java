package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Laboratory theLaboratory = (Laboratory)findAncestorWithClass(this, Laboratory.class);
			if (!theLaboratory.commitNeeded) {
				pageContext.getOut().print(theLaboratory.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Laboratory theLaboratory = (Laboratory)findAncestorWithClass(this, Laboratory.class);
			return theLaboratory.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Laboratory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Laboratory theLaboratory = (Laboratory)findAncestorWithClass(this, Laboratory.class);
			theLaboratory.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for label tag ");
		}
	}
}

