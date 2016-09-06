package edu.uiowa.slis.VIVOISF.Phase_3;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_3Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_3Label currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_3Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase_3 thePhase_3 = (Phase_3)findAncestorWithClass(this, Phase_3.class);
			if (!thePhase_3.commitNeeded) {
				pageContext.getOut().print(thePhase_3.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_3 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_3 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Phase_3 thePhase_3 = (Phase_3)findAncestorWithClass(this, Phase_3.class);
			return thePhase_3.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase_3 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_3 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Phase_3 thePhase_3 = (Phase_3)findAncestorWithClass(this, Phase_3.class);
			thePhase_3.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_3 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_3 for label tag ");
		}
	}
}

