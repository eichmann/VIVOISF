package edu.uiowa.slis.VIVOISF.Explanatory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExplanatoryLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExplanatoryLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ExplanatoryLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Explanatory theExplanatory = (Explanatory)findAncestorWithClass(this, Explanatory.class);
			if (!theExplanatory.commitNeeded) {
				pageContext.getOut().print(theExplanatory.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Explanatory theExplanatory = (Explanatory)findAncestorWithClass(this, Explanatory.class);
			return theExplanatory.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Explanatory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Explanatory theExplanatory = (Explanatory)findAncestorWithClass(this, Explanatory.class);
			theExplanatory.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for label tag ");
		}
	}
}

