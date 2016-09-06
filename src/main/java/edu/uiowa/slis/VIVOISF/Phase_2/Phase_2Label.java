package edu.uiowa.slis.VIVOISF.Phase_2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_2Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_2Label currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_2Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase_2 thePhase_2 = (Phase_2)findAncestorWithClass(this, Phase_2.class);
			if (!thePhase_2.commitNeeded) {
				pageContext.getOut().print(thePhase_2.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_2 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_2 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Phase_2 thePhase_2 = (Phase_2)findAncestorWithClass(this, Phase_2.class);
			return thePhase_2.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase_2 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_2 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Phase_2 thePhase_2 = (Phase_2)findAncestorWithClass(this, Phase_2.class);
			thePhase_2.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_2 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_2 for label tag ");
		}
	}
}

