package edu.uiowa.slis.VIVOISF.PresentingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PresentingProcessLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PresentingProcessLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PresentingProcessLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PresentingProcess thePresentingProcess = (PresentingProcess)findAncestorWithClass(this, PresentingProcess.class);
			if (!thePresentingProcess.commitNeeded) {
				pageContext.getOut().print(thePresentingProcess.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PresentingProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresentingProcess for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PresentingProcess thePresentingProcess = (PresentingProcess)findAncestorWithClass(this, PresentingProcess.class);
			return thePresentingProcess.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PresentingProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresentingProcess for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PresentingProcess thePresentingProcess = (PresentingProcess)findAncestorWithClass(this, PresentingProcess.class);
			thePresentingProcess.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PresentingProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresentingProcess for label tag ");
		}
	}
}

