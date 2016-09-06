package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Statute theStatute = (Statute)findAncestorWithClass(this, Statute.class);
			if (!theStatute.commitNeeded) {
				pageContext.getOut().print(theStatute.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Statute theStatute = (Statute)findAncestorWithClass(this, Statute.class);
			return theStatute.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Statute for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Statute theStatute = (Statute)findAncestorWithClass(this, Statute.class);
			theStatute.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for label tag ");
		}
	}
}

