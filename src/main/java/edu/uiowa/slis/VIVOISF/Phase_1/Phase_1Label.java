package edu.uiowa.slis.VIVOISF.Phase_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_1Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_1Label currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_1Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase_1 thePhase_1 = (Phase_1)findAncestorWithClass(this, Phase_1.class);
			if (!thePhase_1.commitNeeded) {
				pageContext.getOut().print(thePhase_1.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_1 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_1 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Phase_1 thePhase_1 = (Phase_1)findAncestorWithClass(this, Phase_1.class);
			return thePhase_1.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase_1 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_1 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Phase_1 thePhase_1 = (Phase_1)findAncestorWithClass(this, Phase_1.class);
			thePhase_1.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_1 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_1 for label tag ");
		}
	}
}

