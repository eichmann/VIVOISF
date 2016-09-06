package edu.uiowa.slis.VIVOISF.Coworker;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoworkerLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoworkerLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CoworkerLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Coworker theCoworker = (Coworker)findAncestorWithClass(this, Coworker.class);
			if (!theCoworker.commitNeeded) {
				pageContext.getOut().print(theCoworker.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Coworker for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coworker for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Coworker theCoworker = (Coworker)findAncestorWithClass(this, Coworker.class);
			return theCoworker.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Coworker for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coworker for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Coworker theCoworker = (Coworker)findAncestorWithClass(this, Coworker.class);
			theCoworker.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Coworker for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coworker for label tag ");
		}
	}
}

