package edu.uiowa.slis.VIVOISF.EducationalProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EducationalProcessLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EducationalProcessLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EducationalProcessLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EducationalProcess theEducationalProcess = (EducationalProcess)findAncestorWithClass(this, EducationalProcess.class);
			if (!theEducationalProcess.commitNeeded) {
				pageContext.getOut().print(theEducationalProcess.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EducationalProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EducationalProcess for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			EducationalProcess theEducationalProcess = (EducationalProcess)findAncestorWithClass(this, EducationalProcess.class);
			return theEducationalProcess.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing EducationalProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EducationalProcess for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			EducationalProcess theEducationalProcess = (EducationalProcess)findAncestorWithClass(this, EducationalProcess.class);
			theEducationalProcess.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing EducationalProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EducationalProcess for label tag ");
		}
	}
}

