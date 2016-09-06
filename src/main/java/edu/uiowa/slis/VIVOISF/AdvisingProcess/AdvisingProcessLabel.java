package edu.uiowa.slis.VIVOISF.AdvisingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdvisingProcessLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdvisingProcessLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AdvisingProcessLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AdvisingProcess theAdvisingProcess = (AdvisingProcess)findAncestorWithClass(this, AdvisingProcess.class);
			if (!theAdvisingProcess.commitNeeded) {
				pageContext.getOut().print(theAdvisingProcess.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisingProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingProcess for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AdvisingProcess theAdvisingProcess = (AdvisingProcess)findAncestorWithClass(this, AdvisingProcess.class);
			return theAdvisingProcess.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AdvisingProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingProcess for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AdvisingProcess theAdvisingProcess = (AdvisingProcess)findAncestorWithClass(this, AdvisingProcess.class);
			theAdvisingProcess.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AdvisingProcess for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdvisingProcess for label tag ");
		}
	}
}

