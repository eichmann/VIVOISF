package edu.uiowa.slis.VIVOISF.Phase_0;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_0Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_0Label currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_0Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase_0 thePhase_0 = (Phase_0)findAncestorWithClass(this, Phase_0.class);
			if (!thePhase_0.commitNeeded) {
				pageContext.getOut().print(thePhase_0.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_0 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_0 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Phase_0 thePhase_0 = (Phase_0)findAncestorWithClass(this, Phase_0.class);
			return thePhase_0.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase_0 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_0 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Phase_0 thePhase_0 = (Phase_0)findAncestorWithClass(this, Phase_0.class);
			thePhase_0.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_0 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_0 for label tag ");
		}
	}
}

