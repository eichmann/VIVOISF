package edu.uiowa.slis.VIVOISF.Phase_4;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Phase_4Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Phase_4Label currentInstance = null;
	private static final Log log = LogFactory.getLog(Phase_4Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Phase_4 thePhase_4 = (Phase_4)findAncestorWithClass(this, Phase_4.class);
			if (!thePhase_4.commitNeeded) {
				pageContext.getOut().print(thePhase_4.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_4 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_4 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Phase_4 thePhase_4 = (Phase_4)findAncestorWithClass(this, Phase_4.class);
			return thePhase_4.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Phase_4 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_4 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Phase_4 thePhase_4 = (Phase_4)findAncestorWithClass(this, Phase_4.class);
			thePhase_4.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Phase_4 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Phase_4 for label tag ");
		}
	}
}

